import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Digite sua idade:");
        String idade = leitor.nextLine();
        System.out.println("Digite sua cidade:");
        String cidade = leitor.nextLine();
        System.out.println("Digite seu estado:");
        String estado = leitor.nextLine();

        String mensagem = "Olá seu nome é " + nome + ", você tem " + idade + " anos, é da cidade de " + cidade + ", situada no estado de " + estado + ".";

        System.out.println(mensagem);

    }
}
