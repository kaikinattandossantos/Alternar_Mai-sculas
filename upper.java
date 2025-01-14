public class upper {

    // Método para converter letras minúsculas em maiúsculas
    public static String converte(String str) {
        StringBuilder r = new StringBuilder(); // Usado para construir a string modificada
        int i = 0;

        while (i < str.length()) {
            char x = str.charAt(i);

            if (Character.isLowerCase(x)) { // Se for letra minúscula
                r.append(Character.toUpperCase(x)); // Converte para maiúscula
            } else {
                r.append(x); // Mantém o caractere inalterado
            }

            i++; // Incrementa o índice para percorrer a string
        }

        return r.toString(); // Retorna a string convertida
    }
}