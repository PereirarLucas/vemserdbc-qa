public class Endereco {
    private int numero;
    private int tipo;
    private String logradouro;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(int numero, int tipo, String logradouro, String complemento, String cep, String cidade, String pais){
        this.tipo = tipo;
        this.numero = numero;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public Endereco() {

    }

    public Endereco(int i, int i1, String rua_firmina, String arniqueiras, String s, String divina, String rs, String brasil) {
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void imprimirEndereco() {
        switch (this.tipo) {
            case 1:
                System.out.println("Endereço");
                System.out.println("Residencial");
                System.out.println("Numero" + this.numero);
                System.out.println("CEP" + this.cep);
                System.out.println("Cidade" + this.cep);
                System.out.println("Estado" + this.estado);
                System.out.println("Pais" + this.pais);
                break;

            case 2:
                System.out.println("Endereço");
                System.out.println("Comercial");
                System.out.println("Numero" + this.numero);
                System.out.println("CEP" + this.cep);
                System.out.println("Cidade" + this.cep);
                System.out.println("Estado" + this.estado);
                System.out.println("Pais" + this.pais);
        }
    }
}
