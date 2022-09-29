import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner salário = new Scanner(System.in);
        System.out.println("Digite seu cargo");
        int codigocargo = salário.nextInt();
        salário.nextLine();
        switch (codigocargo) {
            case 101:
                System.out.println("O gerente recebera um aumento de 37% !! \n o salario atual é 9100");
                break;
            case 102:
                System.out.println("O engenheiro recebera um aumento de 19% !! \n o salario atual é 5700");
                break;
            case 103:
                System.out.println("O tecnico recebera um aumento de 15% !! \n o salario atual é 3000");
                break;

        }
    }
}
