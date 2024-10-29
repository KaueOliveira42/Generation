package lacoscondicionais;

import java.util.Scanner;

public class SWITCHCASE {

    public static void main(String[] args) {
        
        int opcao;

        Scanner leitor = new Scanner(System.in);

        System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Senhor dos Aneis");
                break;
            case 2:
                System.out.println("Não desista!");
                break;
            case 3:
                System.out.println("Seven Nation Army");
                break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
    }

}
}