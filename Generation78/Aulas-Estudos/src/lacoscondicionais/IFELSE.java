package lacoscondicionais;

import java.util.Scanner;

public class IFELSE {

    public static void main (String[] args) {
                Scanner leitor = new Scanner(System.in);
        
                System.out.println("Digite a 1ª nota: ");
                float nota1 = leitor.nextFloat();
        
                System.out.println("Digite a 2ª nota: ");
                float nota2 = leitor.nextFloat();
        
                System.out.println("Digite a 3ª nota: ");
                float nota3 = leitor.nextFloat();
        
                System.out.println("Digite a 4ª nota: ");
                float nota4 = leitor.nextFloat();
        
                float media = (nota1+nota2+nota3+nota4)/4;

                if (media > 6) {
                    System.out.println("O aluno foi aprovado com média: " + media);
                }
                else if (media > 5 && media < 6) {
                    System.out.println("O aluno está em recuperação com média: " + media);
                }
                else {
                    System.out.println("O aluno foi reprovado com média: " + media);
                }
     }
        
}
        