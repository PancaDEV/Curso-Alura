import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        int tentativasMaximas = 5;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.\n");

        for (int tentativa = 1; tentativa <= tentativasMaximas; tentativa++) {
            System.out.printf("Tentativa %d de %d: Digite um número:\n ", tentativa, tentativasMaximas);
            int numeroTentativa = scanner.nextInt();

            if (numeroTentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                break; // Interrompe o loop, pois o número foi adivinhado
            } else if (numeroTentativa < numeroAleatorio) {
                System.out.println("Tente novamente! O número é maior.");
            } else {
                System.out.println("Tente novamente! O número é menor.");
            }

            if (tentativa == tentativasMaximas) {
                System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
            }
        }

        scanner.close();
    }
}
