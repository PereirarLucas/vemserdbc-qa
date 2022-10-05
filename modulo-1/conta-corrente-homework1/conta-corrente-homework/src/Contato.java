import java.util.List;

public class Contato extends Cliente {

    private String descricao;
    private String telefone;
    private int tipo;

    public Contato(String descricao, String telefone, int tipo) {
        super();
        this.descricao = descricao;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    public void imprimirContato() {
        switch (this.tipo) {
            case 1 -> {
                System.out.println("Contato Residencial");
                System.out.println("Descrição: " + this.descricao);
                System.out.println("Telefone: " + this.telefone);
            }
            case 2 -> {
                System.out.println("Contato Comercial");
                System.out.println("Descrição: " + this.descricao);
                System.out.println("Telefone: " + this.telefone);
            }
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setContatos(List<Object> asList) {
    }

    public void setEnderecos(List<Object> asList) {
    }

    public void imprimirCliente() {
    }
}