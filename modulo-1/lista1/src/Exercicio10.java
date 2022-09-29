import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner alunos = new Scanner(System.in);

        String conceito;
        String resultado;

        System.out.println("Digite seu nome: ");
        String nomealuno = alunos.nextLine();
        System.out.println("Digite sua nota1: ");
        double nota1luno = alunos.nextDouble();
        System.out.println("Digite sua nota2: ");
        double nota2aluno = alunos.nextDouble();
        System.out.println("Digite sua nota3: ");
        double nota3aluno = alunos.nextDouble();
        System.out.println("Digite sua média de exercicios: ");
        double mediaexercicios = alunos.nextDouble();

        double mediaAproveitamento = (nota1luno + nota2aluno * 2 + nota3aluno * 3 + mediaexercicios) / 7;

        if (mediaAproveitamento >= 9){
            conceito = "A";
            resultado = "APROVADO";
        } else if (mediaAproveitamento< 9 && mediaAproveitamento >= 7.0) {
            conceito = "B";
            resultado = "APROVADO";
        } else if (mediaAproveitamento< 7.0 && mediaAproveitamento >= 6) {
            conceito = "C";
            resultado = "APROVADO";
        } else if (mediaAproveitamento< 6 && mediaAproveitamento >= 5) {
            conceito = "D";
            resultado = "REPROVADO";
        } else {
            conceito = "E";
            resultado = "REPROVADO";
        }
        System.out.println("Resultado aluno");
        System.out.println("Nota1 = " + nota1luno);
        System.out.println("Nota2 = " + nota2aluno);
        System.out.println("Nota3 = " + nota3aluno);
        System.out.println("media dos exercicios: = " + mediaexercicios);
        System.out.println("media de aproveitamento: = " + mediaAproveitamento);
        System.out.println("conceito : " + conceito);
        System.out.println("Resultado : " + resultado);
        alunos.close();

    }
}
