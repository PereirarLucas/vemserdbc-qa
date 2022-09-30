import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner brincadeira = new Scanner(System.in);
        boolean loop = true;
        System.out.println("Digite um número para iniciar o jogo");
        int numero = brincadeira.nextInt();
        brincadeira.nextLine();
        int advinha = 0;

        while (loop){
            System.out.println("Advinhe o número: ");
            advinha = brincadeira.nextInt();

            if (numero == advinha) {
                System.out.println("VOCÊ ACERTOU, UHUU");
                loop = false;
            } else if (numero > advinha) {
                System.out.println("Você errou, tente novamente");
            } else {
            System.out.println("Você errou, tente novamente");
            }
        }

    }

}
