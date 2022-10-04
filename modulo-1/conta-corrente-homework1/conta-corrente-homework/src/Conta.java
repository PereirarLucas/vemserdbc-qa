abstract class Conta implements Movimentacao {
    private String nome;
    private Cliente cliente =new Cliente(nome);
    private  String numeroConta;
    private  int agencia;
    private double saldo;

    public Conta() {
    }

    public Conta(Cliente cliente, String numeroConta, int agencia, double saldo) {
        this.cliente = cliente;
        this.numeroConta =numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
