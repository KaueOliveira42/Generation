import java.util.Scanner;

public class vetoresExercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumeros[] = new int[10];
        float soma = 0, media = 0;

        // Solicitação de input ao usuário
        for (int i = 0; i < inputNumeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + " número a ser inserido no vetor: ");
            inputNumeros[i] = scanner.nextInt();
        }

        System.out.println();

        // Exibição dos números ímpares
        System.out.println("NÚMEROS IMPARES: ");
        for (int i = 0; i < inputNumeros.length; i++) {
            if (inputNumeros[i] % 2 != 0) {
                System.out.println(inputNumeros[i]);
            }
        }

        System.out.println();

        // Exibição dos números pares
        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < inputNumeros.length; i++) {
            if (inputNumeros[i] % 2 == 0) {
                System.out.println(inputNumeros[i]);
            }
        }

        System.out.println();

        // Cálculo e exibição da soma dos elementos do vetor
        System.out.println("SOMA: ");
        for (int i = 0; i < inputNumeros.length; i++) {
            soma += inputNumeros[i];
        }
        System.out.println(soma);

        System.out.println();

        // Calculo e exibição da média
        System.out.println("MÉDIA: ");
        media = soma / inputNumeros.length;
        System.out.println(media);
    }
}