import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a base");
        double base = leitor.nextDouble();
        System.out.println("Digite a altura");
        double altura = leitor.nextDouble();

        double area = (base*altura);
        System.out.println(area);

    }
}
