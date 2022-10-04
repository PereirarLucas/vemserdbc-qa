public class Cliente {
    private final String nome;
    private String cpf;
    private final Contato[] contato = new Contato[2];
    private final Endereco[] endereco = new Endereco[2];

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String lucas, String s, Endereco endereco1, Contato contato2, Endereco endereco2, String nome) {

        this.nome = nome;
    }

    public void imprimirContatos() {
        for (Contato value : this.contato) {
            if (value != null) {
                value.imprimirContato();
            }
        }
    }

    public void imprimirEndereco() {
        for (int i = 0; i < this.endereco.length; ++i) {
            if (this.endereco[i] != null) {
                this.endereco[i].imprimirEndereco();
            }

        }
    }


    public void imprimirCliente() {
        System.out.println("Dados do Cliente:");
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("CPF : " + this.cpf);
        System.out.println("Contato: ");
        System.out.println("endereco: ");
        this.imprimirContatos();
        this.imprimirEndereco();
    }

}