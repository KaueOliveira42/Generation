package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio6Condicionais {

    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    double NovoSalario;

    System.out.println("Digite o nome do colaborador: ");
    String nome = leitor.nextLine();

    System.out.println("\nDigite o código do colaborador: ");
    System.out.println("1 - Gerente");
    System.out.println("2 - Vendedor");
    System.out.println("3 - Supervisor");
    System.out.println("4 - Motorista");
    System.out.println("5 - Estoquista");
    System.out.println("6 - Técnico de TI");
    int codigo = leitor.nextInt();

    System.out.println("\nDigite o salário: ");
    double salario = leitor.nextFloat();

    switch (codigo) {
        case 1:
        NovoSalario = salario+(salario*0.10);
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: Gerente");
        System.out.println("Salário reajustado: " + NovoSalario);
        break;

        case 2:
        NovoSalario = salario+(salario*0.7);
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: Vendedor");
        System.out.println("Salário reajustado: " + NovoSalario);
        break;

        case 3:
        NovoSalario = salario+(salario*0.09);
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: Supervisor");
        System.out.println("Salário reajustado: " + NovoSalario);
        break;

        case 4:
        NovoSalario = salario+(salario*0.06);
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: Motorista");
        System.out.println("Salário reajustado: " + NovoSalario);
        break;

        case 5:
        NovoSalario = salario+(salario*0.05);
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: Estoquista");
        System.out.println("Salário reajustado: " + NovoSalario);
        break;

        case 6:
        NovoSalario = salario+(salario*0.08);
        System.out.println("\nNome do colaborador: " + nome);
        System.out.println("Cargo: Técnico de TI");
        System.out.println("Salário reajustado: " + NovoSalario);
        break;

        default:
        System.out.println("Digite uma opção válida!");
    }

    }

}
