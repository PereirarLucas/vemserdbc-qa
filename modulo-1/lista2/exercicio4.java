import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner algoritmo = new Scanner(System.in);
        int[] vet = new int[20];

        System.out.println("Digite um numero:");
        for (int i=0;i< 20; i++){
            vet [i]=algoritmo.nextInt();
        }
        for (int i=19;i>=0;i--){
            System.out.println(vet[i]);

        }
    }
}
