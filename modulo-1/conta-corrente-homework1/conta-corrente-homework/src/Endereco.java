public class Endereco {
    int numero;
    int tipo;
    String logradouro;
    String complemento;
    String cep;
    String cidade;
    String estado;
    String pais;

    public Endereco(){
    }

    public void imprimirEndereco() {
        switch (this.tipo) {
            case 1:
                System.out.println("Endereço");
                System.out.println("Residencial");
                System.out.println("Número" + this.numero);
                System.out.println("CEP" + this.cep);
                System.out.println("Cidade" + this.cep);
                System.out.println("Estado" + this.estado);
                System.out.println("Pais" + this.pais);
        }
    }
}
