import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2Collections {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numerosInteiros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numerosInteiros.add(i);
        }

        System.out.println("Digite um número inteiro a ser buscado no Array: ");
        int numInputUsuario = scanner.nextInt();

        System.out.println();

        if (numerosInteiros.contains(numInputUsuario)) {
            System.out.println("O número " + numInputUsuario + " foi encontrado na posição "
                    + numerosInteiros.indexOf(numInputUsuario));
        } else {
            System.out.println("O número " + numInputUsuario + " não foi encontrado no Array");
        }

        System.out.println();

        System.out.println("Números presentes no Array: " + numerosInteiros);
    }
}
