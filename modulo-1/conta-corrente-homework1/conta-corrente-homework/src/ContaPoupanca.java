public class ContaPoupanca extends Conta implements Impressao {
    static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca() {
    }

    public ContaPoupanca(Cliente cliente, String numeroConta, int agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public void imprimir() {
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Saldo: " + this.getSaldo());
    }

    public void creditarTaxa() {
        this.setSaldo(this.getSaldo() * 1.01);
    }

    @Override
    public boolean sacar(double var1) {
        return false;
    }

    @Override
    public void depositar(double var2) {
    }

    @Override
    public void transferir(ContaCorrente var1, double var2) {
    }
}
