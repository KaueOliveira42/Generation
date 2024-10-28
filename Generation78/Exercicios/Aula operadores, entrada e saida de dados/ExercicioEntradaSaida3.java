import java.util.Scanner;

public class ExercicioEntradaSaida3 {

    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o salário bruto: ");
        float Salario_Bruto = leitor.nextFloat();

        System.out.println("Digite o adicional noturno: ");
        float Adicional_Noturno = leitor.nextFloat();

        System.out.println("Digite as horas Extras: ");
        float Horas_Extras = leitor.nextFloat();

        System.out.println("Digite os descontos: ");
        float descontos = leitor.nextFloat();

        float Salario_Liquido = (Salario_Bruto+Adicional_Noturno+(Horas_Extras*5))-descontos;

        System.out.println("O valor do salário líquido é: " + Salario_Liquido);


    }

}
