public class Contato {
    private final String descricao;
    private final String telefone;
    private final int tipo;

    public Contato(String descricao, String telefone, int tipo) {
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public void imprimirContato() {
        switch (this.tipo) {
            case 1 -> {
                System.out.println("Contato");
                System.out.println("Descrição: " + this.descricao);
                System.out.println("Telefone: " + this.telefone);
                System.out.println("Tipo: Comercial");
            }
            case 2 -> {
                System.out.println("Contato");
                System.out.println("Descrição: " + this.descricao);
                System.out.println("Telefone: " + this.telefone);
                System.out.println("Tipo: Residencial");
            }
        }
    }
}
