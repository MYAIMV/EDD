import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayQueue<Job> queue = new ArrayQueue<>(50);
        ArrayStack<Job> stack = new ArrayStack<>(50);
        SinglyLinkedList<Job> log = new SinglyLinkedList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            String cmd = parts[0].toUpperCase();

            switch (cmd) {
                case "ADD":
                    if (parts.length < 2) {
                        System.out.println("Falta ID de trabajo");
                        break;
                    }
                    queue.enqueue(new Job(parts[1]));
                    break;

                case "PROCESS":
                    if (parts.length < 2 || !parts[1].matches("\\d+")) {
                        System.out.println("Número inválido");
                        break;
                    }
                    int n = Integer.parseInt(parts[1]);
                    int count = Math.min(n, queue.size());
                    for (int i = 0; i < count; i++) {
                        stack.push(queue.dequeue());
                    }
                    break;

                case "COMMIT":
                    while (!stack.isEmpty()) {
                        log.addLast(stack.pop());
                    }
                    break;

                case "ROLLBACK":
                    if (parts.length < 2 || !parts[1].matches("\\d+")) {
                        System.out.println("Número inválido");
                        break;
                    }
                    int m = Integer.parseInt(parts[1]);
                    int rollbackCount = Math.min(m, log.size());
                    for (int i = 0; i < rollbackCount; i++) {
                        queue.enqueue(log.removeLast());
                    }
                    break;

                case "PRINT":
                    System.out.println("QUEUE (pendientes): " + queue);
                    System.out.println("STACK (procesando): " + stack);
                    System.out.println("BITÁCORA (confirmados): " + log);
                    break;

                case "END":
                    System.out.println("=== ESTADO FINAL ===");
                    System.out.println("QUEUE (pendientes): " + queue);
                    System.out.println("STACK (procesando): " + stack);
                    System.out.println("BITÁCORA (confirmados): " + log);
                    return;

                default:
                    System.out.println("Comando desconocido");
            }
        }
    }
}
