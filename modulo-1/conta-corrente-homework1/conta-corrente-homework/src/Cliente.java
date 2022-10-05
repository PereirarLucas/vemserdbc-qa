import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private List<Contato> contatos = new ArrayList();
    private List<Endereco> enderecos = new ArrayList();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {

    }

    public void imprimirContatos() {
        if (this.contatos != null) {
            for (Contato contato : this.contatos) {
                if (contato != null) {
                    contato.imprimirContato();
                }
            }
        }
    }

    public void imprimirEnderecos() {
        if (this.enderecos != null) {
            for (Endereco endereco : this.enderecos) {
                if (endereco != null) {
                    endereco.imprimirEndereco();
                }
            }
        }
    }

    public void imprimirCliente() {
        System.out.println("Dados do Cliente:");
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("CPF: " + this.cpf);

        System.out.println("Contatos:");
        this.imprimirContatos();

        System.out.println("Enderecos:");
        this.imprimirEnderecos();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = List.of(contatos);
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = List.of(enderecos);
    }

}