import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class exercicio4Collections {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<Integer>();

        // Inserção de números no Set
        for (int i = 0; i < 10; i++) {
            numeros.add(i + 1);
        }

        // Solicitação de número ao usuário
        System.out.println("Digite um número a ser buscado no Set: ");
        int numInputUsuario = scanner.nextInt();

        // Verificação se o número está presente no Set
        if (numeros.contains(numInputUsuario)) {
            System.out.println("O número " + numInputUsuario + " foi encontrado!");
        } else {
            System.out.println("O número " + numInputUsuario + " não foi encontrado!");
        }
    }
}
