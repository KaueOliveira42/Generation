import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1Collections {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a " + (i + 1) + "º cor: ");
            cores.add(scanner.next());
        }

        System.out.println("Cores adicionadas: " + cores);

        Collections.sort(cores);

        System.out.println("Lista de cores em ordem alfabética: " + cores);
    }
}
