import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner mercado = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = mercado.next();
        System.out.println("Digite o valor do produto: ");
        double valor = mercado.nextDouble();
        System.out.println("A cada 10 produtos da mesma marca, um desconto será liberado:");

        for (int i = 1; i <= 10; i++){
            double desconto = 1.35;

            System.out.printf("%d x R$ %.2f = %.2f\n", i, valor * desconto, valor * desconto * (double)i);
            desconto -= 1.35;

        }

    }
}
