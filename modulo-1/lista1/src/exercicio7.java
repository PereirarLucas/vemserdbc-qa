import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Qual o código do produto?:");
        String produto = dados.nextLine();
        System.out.println("Qual o número de vendas do produto?:");
        double quantidade = dados.nextDouble();
        dados.nextLine();
        switch (produto) {
            case "ABCD":
                System.out.println("O valor do produto será: " + quantidade * 5.3);
                break;
            case "XYPK":
                System.out.println("O valor do produto será: " + quantidade * 6.0);
            case "KLMP":
                System.out.println("O valor do produto será:" + quantidade * 3.2);
            case "QRST":
                System.out.println("O valor do produto será:" + quantidade * 2.5);
                break;
            default:
                System.out.println("Esse código está incorreto, insira novamente.");
        }
    }
}
