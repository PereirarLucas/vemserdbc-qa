import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println("Escolha um estado: ");
        System.out.println("1 - RJ");
        System.out.println("2 - RS");
        System.out.println("3 - CE");
        Scanner entrada = new Scanner(System.in);
        int estado = entrada.nextInt();
        if (estado == 1){
            System.out.println("escolha uma cidade");
            System.out.println("1 - Rio de Janeiro");
            System.out.println("2 - Niteroi");
            int cidade = entrada.nextInt();
            if (cidade == 1){
                System.out.println("Dados sobre o Rio de Janeiro");
                System.out.println("População no último censo [2022]: 6.775.561 pessoas. ");
                System.out.println("Principal festa: Carnaval");
                System.out.println("Índice de desenvolvimento humano municipal (IDH-M) [2013]: 0,799");
            }else if (cidade == 2){
                System.out.println("Dados sobre Niteroi");
                System.out.println("População no último censo [2019]: 513 584 pessoas. ");
                System.out.println("Principal festa: Carnaval");
                System.out.println("Índice de desenvolvimento humano municipal (IDH-M) [2000]: 0,886");
            }

        } else if (estado == 2) {
            System.out.println("escolha uma cidade");
            System.out.println("1 - Gramado");
            System.out.println("2 - Viamão");
            int cidade = entrada.nextInt();
            if (cidade == 1){
                System.out.println("Dados sobre Gramado");
                System.out.println("População no último censo [2022]: 36 500 pessoas. ");
                System.out.println("Principal festa: Festival de Cinema de Gramado");
                System.out.println("Índice de desenvolvimento humano municipal (IDH-M) [2019]: 0.841");
            }else if (cidade == 2){
                System.out.println("Dados sobre Viamão");
                System.out.println("População no último censo [2020]: 256 302 pessoas. ");
                System.out.println("Principal festa: Resenha do Lukinhas ");
                System.out.println("Índice de desenvolvimento humano municipal (IDH-M) [2010]: 0,717");
            }

        } else if (estado == 3) {
            System.out.println("escolha uma cidade");
            System.out.println("1 - Fortaleza");
            System.out.println("2 - Canoa quebrada");
            int cidade = entrada.nextInt();
            if (cidade == 1){
                System.out.println("Dados sobre Fortaleza");
                System.out.println("População no último censo [2022]: 2.686.612 pessoas. ");
                System.out.println("Principal festa: Festas juninas");
                System.out.println("Índice de desenvolvimento humano municipal (IDH-M) [2013]: 0,754");
            }else if (cidade == 2){
                System.out.println("Dados sobre Aracati");
                System.out.println("População no último censo [2010]: 69.159 pessoas. ");
                System.out.println("Principal festa: Rota das Falésias ");
                System.out.println("Índice de desenvolvimento humano municipal (IDH-M) [2014]: 0,655");

            }
        }
    }
}
