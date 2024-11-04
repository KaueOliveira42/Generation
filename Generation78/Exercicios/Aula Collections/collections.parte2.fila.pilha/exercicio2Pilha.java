import java.util.Scanner;
import java.util.Stack;

public class exercicio2Pilha {
    public static void main(String[] args) {

        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 999; // inicializando varíavel opção com valor aleatório.

        do {
            System.out.println("**********MENU************");
            System.out.println("Digite a opção desejada: \n");
            System.out.println("1 - Adicionar livro na pilha");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Retirar livro da pilha");
            System.out.println("0 - Sair \n");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consume a quebra de linha pendente

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do livro que deseja adicionar: ");
                    String nomeLivro = scanner.nextLine(); // Use nextLine() para ler o nome completo
                    pilhaLivros.push(nomeLivro);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nListando todos os livros...");
                    System.out.println(pilhaLivros);
                    System.out.println();
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nPilha está vazia!");
                        System.out.println();
                    } else {
                        System.out.println("\nRemovendo o último livro adicionado da pilha...");
                        pilhaLivros.pop();
                        System.out.println("\nLivro removido com sucesso!");
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("\nEncerrando programa...");
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
