import java.util.Scanner;

public class ExercicioEntradaSaida1 {
    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        float salario = leitor.nextFloat();

        System.out.println("Digite o abono: ");
        float abono = leitor.nextFloat();

        float NovoSalario = salario+abono;

        System.out.println("O resultado do salário e abono é: \n " + NovoSalario);

    }

}
