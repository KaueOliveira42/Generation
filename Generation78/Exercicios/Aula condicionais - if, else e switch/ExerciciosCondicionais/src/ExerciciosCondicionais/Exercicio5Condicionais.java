package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio5Condicionais {

    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);

    int opcao, quantidade=0;
    float preco=0, ValorTotal;
    String produto="Produto";

    System.out.println("Código: 1 \n Produto: Cachorro quente \n Preço: R$10.00\n");
    System.out.println("Código: 2 \n Produto: X-Salada \n Preço: R$15.00\n");
    System.out.println("Código: 3 \n Produto: X-Bacon \n Preço: R$18.00\n");
    System.out.println("Código: 4 \n Produto: Bauru  \n Preço: R$12.00\n");
    System.out.println("Código: 5 \n Produto: Refrigerante \n Preço: R$8.00\n");
    System.out.println("Código: 6 \n Produto: Suco de laranja \n Preço: R$13.00\n");

    System.out.println("Digite o código do produto desejado: \n");
    opcao = leitor.nextInt();

    switch (opcao) {
        case 1:
        preco = 10;
        produto = "Cachorro quente";
        System.out.println("Quantas unidades deseja?");
        quantidade = leitor.nextInt();
        break;

        case 2:
        preco = 15;
        produto = "X-Salada";
        System.out.println("Quantas unidades deseja?");
        quantidade = leitor.nextInt();
        break;

        case 3:
        preco = 18;
        produto = "X-Bacon";
        System.out.println("Quantas unidades deseja?");
        quantidade = leitor.nextInt();
        break;

        case 4:
        preco = 12;
        produto = "Bauru";
        System.out.println("Quantas unidades deseja?");
        quantidade = leitor.nextInt();
        break;

        case 5:
        preco = 8;
        produto = "Refrigerante";
        System.out.println("Quantas unidades deseja?");
        quantidade = leitor.nextInt();
        break;

        case 6:
        preco = 13;
        produto = "Suco de laranja";
        System.out.println("Quantas unidades deseja?");
        quantidade = leitor.nextInt();
        break;

        default:
        System.out.println("Digite uma opção válida!");
    }

    ValorTotal = preco * quantidade;
    System.out.println("\n***************************************");
    System.out.println("\nProduto comprado: " + produto);
    System.out.println("Quantidade: " + quantidade);
    System.out.println("\nO valor total da sua compra é: " + ValorTotal);

    }

}
