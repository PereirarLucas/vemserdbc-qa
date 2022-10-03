public class Contato {
    String descricao;
    String telefone;
    int tipo;

    public  Contato() {
    }

    public void imprimirContato() {
        switch (this.tipo) {
            case 1:
                System.out.println("Contato");
                System.out.println("Descrição: " + this.descricao);
                System.out.println("Telefone: " + this.telefone);
                System.out.println("Tipo: Comercial");
                break;
            case 2:
                System.out.println("Contato");
                System.out.println("Descrição: " + this.descricao);
                System.out.println("Telefone: " + this.telefone);
                System.out.println("Tipo: Residencial");
        }
    }
}
