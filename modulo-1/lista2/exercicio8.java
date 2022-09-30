import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner vetor = new Scanner(System.in);
        int[] numeros = new int[]{1, 5, 6, 6, 10, 12, 19, 19, 23, 27};
        System.out.println("Digite um número:");
        int numero = vetor.nextInt();
        int maior = 0;
        int igual = 0;
        int menor = 0;

        for(int i=0;i<10;++i) {
            if  (numero > numeros[i]){
                ++maior;
            } else if (numero == numeros[i]) {
                ++igual;
            } else if (numero < numeros[i]) {
                ++menor;
            }
        }
        System.out.println("Quantidade de numeros repetidos é " + igual);
        System.out.println("Quantidade de numeros maior que o numero digitado é " + maior);
        System.out.println("Quantidade de numeros menor que o numero digitado é " + menor);

    }
}
