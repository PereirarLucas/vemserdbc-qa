public enum exercicio6{;
    public static void main(String[] args) {
        double [][] matriz = {
                {10,9,8,7},
                {7,8,9,10},
                {6,7,9,8},
                {10,9,9.3,6},
                {8,8,9,9.7},
        };
        double[] soma = {0, 0, 0, 0, 0};
        double[] media = {0, 0, 0, 0, 0};
        double somaTot = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                soma[i] += matriz[i][j];
            }
        }

        for (int i = 0; i < 5 ; i++) {
            media[i] = soma[i] / 4;
        }
        for (int i = 0; i < 5; i++) {
            somaTot += media[i];
        }
        double mediaTot = somaTot/5;

        System.out.printf("A média da primeira disciplina foi: %.2f\n", media[0]);
        System.out.printf("A média da segunda disciplina foi: %.2f\n", media[1]);
        System.out.printf("A média da terceira disciplina foi: %.2f\n", media[2]);
        System.out.printf("A média da quarta disciplina foi: %.2f\n", media[3]);
        System.out.printf("A média da quinta disciplina foi: %.2f\n", media[4]);
        System.out.printf("A média da sexta disciplina foi: %.2f\n", mediaTot);
    }
}