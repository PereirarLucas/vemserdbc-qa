import java.util.Objects;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner informações = new Scanner(System.in);
        System.out.println("Digite o código do seu serviço:");
        int codigo = informações.nextInt();
        informações.nextLine();
        System.out.println("Digite seu salário atual: ");
        double salario = informações.nextDouble();
        informações.nextLine();
        informações.close();
        switch (codigo) {
            case 101:
                double novoSalario = salario + salario * 0.1;
                double diferenca = novoSalario - salario;
                System.out.println("Como gerente seu aumento sera de: ");
                System.out.printf("Salario antigo: R$ %.2f Novo salario: R$ %.2f Diferença: R$ %.2f%n", salario, novoSalario, diferenca);
                break;
            case 102:
                novoSalario = salario + salario * 0.2;
                diferenca = novoSalario - salario;
                System.out.println("Como engenheiro seu aumento sera de: ");
                System.out.printf("Salario antigo: R$ %.2f Novo salario: R$ %.2f Diferença: R$ %.2f%n", salario, novoSalario, diferenca);
                break;
            case 103:
                novoSalario = salario + salario * 0.3;
                diferenca = novoSalario - salario;
                System.out.println("Como tecnico seu aumento sera de: ");
                System.out.printf("Salario antigo: R$ %.2f Novo salario: R$ %.2f Diferença: R$ %.2f%n", salario, novoSalario, diferenca);
                break;
            default:
                novoSalario = salario + salario * 0.4;
                diferenca = novoSalario - salario;
                System.out.println("Como contribuente seu aumento sera de: ");
                System.out.printf("Salario antigo: R$ %.2f Novo salario: R$ %.2f Diferença: R$ %.2f%n", salario, novoSalario, diferenca);
        }
        }
    }
