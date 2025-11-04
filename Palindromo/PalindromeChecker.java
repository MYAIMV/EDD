public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        // 1. Limpiar el texto: sin espacios, sin signos, todo minúsculas
        String clean = "";
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                clean += c;
            }
        }

        // 2. Crear stack
        MyStack<Character> stack = new MyStack<>(clean.length());

        // 3. Meter cada letra a la pila
        for (int i = 0; i < clean.length(); i++) {
            stack.push(clean.charAt(i));
        }

        // 4. Sacar y comparar con el original
        for (int i = 0; i < clean.length(); i++) {
            if (clean.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
