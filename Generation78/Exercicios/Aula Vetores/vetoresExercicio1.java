import java.util.Scanner;

public class vetoresExercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorNumeros = { 4, 8, 15, 16, 23, 42, 64, 128, 252, 516 };
        boolean numeroEncontrado = false;

        System.out.println("Digite o número que deseja encontrar: ");
        int numDigitado = scanner.nextInt();

        // Busca do número digitado no vetor e exibição da posição
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] == numDigitado) {
                System.out.println("O número " + numDigitado + " foi encontrado na posição: " + i);
                numeroEncontrado = true;
            }
        }

        // Condição exibida caso número não seja encontrado no vetor
        if (!numeroEncontrado) {
            System.out.println("Número não encontrado!");
        }
    }
}