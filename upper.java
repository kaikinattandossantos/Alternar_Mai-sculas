import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um texto
        System.out.println("Digite um texto para converter letras minúsculas em maiúsculas:");
        String texto = scanner.nextLine();

        // Chama o método para fazer a conversão
        String textoConvertido = converte(texto);

        // Exibe o resultado no console
        System.out.println("Texto convertido: " + textoConvertido);

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}
