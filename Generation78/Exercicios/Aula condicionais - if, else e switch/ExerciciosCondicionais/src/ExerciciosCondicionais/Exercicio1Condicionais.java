package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio1Condicionais {

    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o 1º número: ");
    float a = leitor.nextFloat();
    
    System.out.println("Digite o 2º número: ");
    float b = leitor.nextFloat();

    System.out.println("Digite o 3º número: ");
    float c = leitor.nextFloat();
    
    if ((a+b)>c) {
        System.out.println("A soma de A e B é maior do que C");
    }
    else if ((a+b)<c) {
        System.out.println("A soma de A e B é menor do que C");
    }
    else if ((a+b)==c) {
        System.out.println("A soma de A e B é igual ao valor de C");
    }

}
}