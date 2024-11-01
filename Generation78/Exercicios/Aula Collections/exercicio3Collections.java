import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class exercicio3Collections {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeSet<Integer> numeros = new TreeSet<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros.add(scanner.nextInt());
        }

        Iterator<Integer> iterator = numeros.iterator(); // Criação do Iterator

        System.out.println();

        System.out.println("Exibição dos números de forma ordenada: ");
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            System.out.println(numero);
        }
    }
}
