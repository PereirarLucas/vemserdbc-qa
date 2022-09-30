import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
            Scanner mercado = new Scanner(System.in);

            double[][] supermercado = {
                    {20, 12, 11},
                    {12, 11, 13},
                    {12, 17, 15},
                    {14, 12, 11},
                    {7, 8, 18},
                    {11, 14, 16},
                    {16, 8, 17},
                    {10, 13, 19},
                    {11, 14, 17},
                    {27, 9, 15},
            };

            double[] soma = {0, 0, 0};
            double barato = 30000;

            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 10; i++) {
                    soma[j] += supermercado[i][j];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (barato > soma[i]) {
                    barato = soma[i];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (barato == soma[i]) {
                    System.out.printf("O mercado mais barato foi o %d", (i+1));
                }
            }
        }
    }


