abstract class Conta implements Movimentacao {

    private Cliente cliente;
    private String numeroConta;
    private String agencia;
    private double saldo;

    public Conta(Cliente cliente, String numeroConta, String agencia, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
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

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double saque) {
        if (saque < 0.0) {
            System.out.println("Nao foi possivel realizar o saque, saldo negativo.");
            return false;
        } else if (saque > 0.0) {
            this.setSaldo(this.saldo - saque);
            System.out.println("Saque autorizado, retire o dinheiro no local indicado: " + this.saldo);
            return true;
        } else {
            System.out.println("Nao foi possivel realizar o saque");
            return true;
        }
    }

    public void depositar(double deposito) {
        if (deposito > 0.0) {
            this.saldo += deposito;
            System.out.println("Deposito realizado com sucesso.");
            System.out.println("Seu novo saldo e de R$: " + this.saldo);
        } else {
            System.out.println("Nao foi possivel realizar seu deposito.");
        }
    }

    public void transferir(ContaCorrente conta, double valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
        } else {
            System.out.println("Nao foi possivel realizar sua transferencia neste momento, tente novamente.");
        }
    }

}