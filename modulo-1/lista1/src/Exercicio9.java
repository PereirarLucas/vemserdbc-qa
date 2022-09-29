import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ft = new Scanner(System.in);
        ft.next();
        System.out.println("Digite a hora que o jogo começou:");
        int horainicial = ft.nextInt();

        System.out.println("Digite o minuto que o jogo começou:");
        int minutoinicial = ft.nextInt();

        System.out.println("Digite a hora que o jogo terminou:");
        int horafinal = ft.nextInt();

        System.out.println("Digite o minuto que o jogo terminou:");
        int minutofinal = ft.nextInt();
        ft.close();

        int instanteinicial = horainicial * 60 + minutoinicial;
        int instantefinal = horafinal * 60 + minutofinal;
        int duracao;
        if (instanteinicial < instantefinal){
            duracao = instantefinal - instanteinicial;
        }
        else {
            duracao = (24*60 + instantefinal) - instanteinicial;
        }
        int duracaohoras = duracao / 60;
        int duracaominutos = duracao % 60;

        System.out.println("O jogo durou" + duracaohoras + "Hora(s) E" + duracaominutos + "minuto(s)");
    }
}
