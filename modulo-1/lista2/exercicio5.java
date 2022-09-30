import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[5][4];
        double mediaNotas = 0;
        double maiorNota = 0;
        double maiorMatricula = 0;

        for (int i=0;i<5;i++) {
            System.out.println("Digite o número da matricula do aluno: ");
            matriz[i][0] = entrada.nextInt();
            System.out.println("Digite a nota da média das provas: ");
            matriz[i][1] = entrada.nextInt();
            System.out.println("Digite a nota da média dos trabalhos: ");
            matriz[i][2] = entrada.nextInt();
            matriz[i][3] = (int) (matriz[i][1] * 0.6 + matriz[i][2] * 0.4);
        }

        mediaNotas = (matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3] + matriz[4][3])/5;

        for (int i=0;i<3;i++) {
            if (maiorNota < matriz[i][3]) {
                maiorNota = matriz[i][3];
                maiorMatricula = matriz[i][3];
            }
        }

        System.out.printf("A MAIOR NOTA FINAL FOI DA MATRICULA: %.2f\n", maiorMatricula );
        System.out.printf("A MEDIA DE NOTAS FINAIS FOI DE: %.2f", mediaNotas);

    }
}


