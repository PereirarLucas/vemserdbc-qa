import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = leitor.next();
        switch (palavra){
            case "dog":
                System.out.println("cachorro ");
                break;
            case "time":
                System.out.println("tempo ");
                break;
            case "love":
                System.out.println("amor ");
                break;
            case "city":
                System.out.println("cidade ");
                break;
            case "happy":
                System.out.println("feliz ");
                break;
            case "sad":
                System.out.println("triste ");
                break;
            case "should":
                System.out.println("deveria ");
                break;
            case "could":
                System.out.println("poderia ");
                break;
            case "tempo":
                System.out.println("time ");
                break;
            case "amor":
                System.out.println("love ");
                break;
            case "cidade":
                System.out.println("city ");
                break;
            case "feliz":
                System.out.println("happy ");
                break;
            case "triste":
                System.out.println("sad ");
                break;
            case "deveria":
                System.out.println("should ");
                break;
            case "poderia":
                System.out.println("could ");
                break;
            default:
                System.out.println("A palavra não é válida. ");
        }

    }
}
