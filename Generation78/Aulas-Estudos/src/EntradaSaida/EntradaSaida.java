package EntradaSaida;

import java.util.Scanner;

public class EntradaSaida {

    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine().toUpperCase();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);

        

    }

}
