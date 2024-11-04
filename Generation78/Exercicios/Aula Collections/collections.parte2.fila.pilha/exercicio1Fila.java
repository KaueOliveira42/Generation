import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1Fila {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao = 999; // inicializando varíavel opção com valor aleatório.

        do {
            System.out.println("**********MENU************");
            System.out.println("Digite a opção desejada: \n");
            System.out.println("1 - Adicionar clientes na fila");
            System.out.println("2 - Listar todos os clientes");
            System.out.println("3 - Retirar cliente da fila");
            System.out.println("0 - Sair \n");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do cliente que deseja adicionar à fila: ");
                    String novoCliente = scanner.next();
                    filaClientes.add(novoCliente);
                    System.out.println("\nNovo cliente adicionado com sucesso!");
                    System.out.println("\nFila atual: " + filaClientes + "\n");
                    break;
                case 2:
                    System.out.println("\nMostrando todos os clientes na fila: ");
                    System.out.println(filaClientes + "\n");
                    break;
                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("Fila vazia, não há clientes a serem removidos!\n");
                    } else {
                        System.out.println("Retirando o primeiro cliente da fila...");
                        filaClientes.remove();
                        System.out.println("Cliente removido com sucesso!");
                        System.out.println("\nFila atual: " + filaClientes + "\n");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    System.exit(0);
            }
        } while (opcao != 0);
    }
}
