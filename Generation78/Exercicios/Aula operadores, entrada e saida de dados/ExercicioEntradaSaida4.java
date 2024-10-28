import java.util.Scanner;

public class ExercicioEntradaSaida4 {

    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1ª valor: ");
        float valor1 = leitor.nextFloat();

        System.out.println("Digite o 2ª valor: ");
        float valor2 = leitor.nextFloat();

        System.out.println("Digite o 3ª valor: ");
        float valor3 = leitor.nextFloat();

        System.out.println("Digite o 4ª valor: ");
        float valor4 = leitor.nextFloat();

        float resultado = (valor1*valor2)-(valor3*valor4);

        System.out.println("O resultado é: " + resultado);
    }

}
