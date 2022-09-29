import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        double eleitores;
        double votosBrancos;
        double votosNulos;
        double votosvalidos;

        Scanner eleição = new Scanner(System.in);

        System.out.println("Digite o número de eleitores da sua região. ");
        eleitores = eleição.nextDouble();
        System.out.println("Digite o numero de votos em branco. ");
        votosBrancos = eleição.nextDouble();
        System.out.println("Digite o numero de votos nulo. ");
        votosNulos = eleição.nextDouble();
        System.out.println("Digite o numero de votos validos. ");
        votosvalidos = eleição.nextDouble();

        double total = votosBrancos + votosNulos + votosvalidos;

        double porcentvotosbranco = Math.round((votosBrancos/total) * 100.0);
        System.out.println("O número de votos em branco é " + votosBrancos + " e, representa o total de %" + porcentvotosbranco + " dos votos dos eleitores");
        double porcentvotosnulo = Math.round(votosNulos/total * 100);
        System.out.println("O número de votos nulos é" + votosNulos + " e, representa o total de %" + porcentvotosnulo + "dos votos dos eleitores");
        double votosreais = Math.round(votosvalidos/total * 100);
        System.out.println("O número de votos válidos é " + votosvalidos + " e, representa o total de %" + votosvalidos + "dos votos dos eleitores");

        eleição.close();

    }
}
