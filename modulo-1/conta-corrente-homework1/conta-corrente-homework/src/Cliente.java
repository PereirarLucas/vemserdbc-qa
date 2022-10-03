public class Cliente {
    String nome;
    String cpf;
    Contato[] contato = new Contato[2];
    Endereco[] endereco = new Endereco[2];

    public Cliente() {
    }

    public void imprimirContatos() {
        for (int i = 0; i < this.contato.length; ++i) {
            this.contato[i].imprimirContato();
        }
    }
    public void imprimirEndereco() {
        for(int i = 0; i < this.contato.length; ++i) {
            this.endereco[i].imprimirEndereco();
        }

    }
    public void imprimirCliente() {
        System.out.println("Dados do Cliente:");
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("CPF : " + this.cpf);
        System.out.println("Contato: ");
        System.out.println("endereço: ");
        this.imprimirContatos();
        this.imprimirEndereco();
    }
}