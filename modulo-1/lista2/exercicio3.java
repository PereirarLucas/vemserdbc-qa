import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner basquete = new Scanner(System.in);
        int quantidade = 0;
        double maiorAlt = 0;
        int somaAlt = 0;
        int idadeVelho = 0;
        String velho = "";
        double maisPesado = 0;
        String pesado = "";
        double media = 0;

        System.out.println("-----");
        boolean loop = true;

        while (loop){
            System.out.println("Digite o nome do jogador escolhido: ");
            String nome = basquete.nextLine();{

            switch (nome) {

                case "SAIR" ->{
                    loop = false;
                }
                default -> {

                    quantidade++;

                    System.out.println("Digite a altura do jogador: ");
                    double altura = basquete.nextDouble();
                    System.out.println("Digite a idade do jogador: ");
                    int idade = basquete.nextInt();
                    System.out.println("Digite o peso do jogador");
                    double peso = basquete.nextDouble();

                    if (altura > maiorAlt){
                        maiorAlt = altura;
                    }
                    if (idade > idadeVelho){
                        idadeVelho = idade;
                        velho = nome;
                    }
                    if (peso > maisPesado){
                        maisPesado = peso;
                        pesado = nome;
                    }
                    somaAlt += altura;
                    basquete.nextLine();
                }
            }
        }
        media = somaAlt/(quantidade);
        System.out.println("Quantos jogadores inscritos:" + quantidade);
        System.out.println("Jogador mais alto:" + maiorAlt);
        System.out.println("Jogador mais velho:" + velho);
        System.out.println("Jogador mais pesado:" + pesado);
        System.out.printf("Média das alturas dos jogadores: " + media/ (double)quantidade);

        basquete.close();{
        }

        }
        {
        }
    }{
    }
}