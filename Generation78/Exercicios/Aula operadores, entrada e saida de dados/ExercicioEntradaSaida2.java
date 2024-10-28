import java.util.Scanner;

public class ExercicioEntradaSaida2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a 1ª nota: ");
        nota1 = leitor.nextFloat();

        System.out.println("Digite a 2ª nota: ");
        nota2 = leitor.nextFloat();

        System.out.println("Digite a 3ª nota: ");
        nota3 = leitor.nextFloat();

        System.out.println("Digite a 4ª nota: ");
        nota4 = leitor.nextFloat();

        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média é: " + media);

    }

}
