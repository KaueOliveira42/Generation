package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio2Condicionais {

    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite um número: ");
    float numero = leitor.nextFloat();



    if (numero % 2 == 0 && numero > 0) {
        System.out.println("O número é par e positivo!");
    }
    else if (numero % 2 == 0 && numero < 0) {
        System.out.println("O número é par e negativo!");
    }
    else if (numero % 2 != 0 && numero > 0) {
        System.out.println("O número é impar e positivo!");
    }
    else if (numero % 2 != 0 && numero < 0) {
        System.out.println("O número é impar e negativo!");
    }



    }

}
