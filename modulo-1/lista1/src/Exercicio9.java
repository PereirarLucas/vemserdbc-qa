import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ft = new Scanner(System.in);
        ft.next();
        System.out.println("Digite a hora que o jogo começou:");
        int horaInicial = ft.nextInt();

        System.out.println("Digite o minuto que o jogo começou:");
        int minutoInicial = ft.nextInt();

        System.out.println("Digite a hora que o jogo terminou:");
        int horaFinal = ft.nextInt();

        System.out.println("Digite o minuto que o jogo terminou:");
        int minutoFinal = ft.nextInt();
        ft.close();

        int instanteInicial = horaInicial * 60 + minutoInicial;
        int instanteFinal = horaFinal * 60 + minutoFinal;
        int duracao;
        if (instanteInicial < instanteFinal){
            duracao = instanteFinal - instanteInicial;
        }
        else {
            duracao = (24*60 + instanteFinal) - instanteInicial;
        }
        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;

        System.out.println("O jogo durou" + duracaoHoras + "Hora(s) E" + duracaoMinutos + "minuto(s)");
    }
}
