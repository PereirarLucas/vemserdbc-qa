public class ContaPoupanca extends Conta implements Impressao {

    private final double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public void creditarTaxa() {
        this.setSaldo(this.getSaldo() * this.JUROS_MENSAL);
    }

    public void imprimir() {
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Saldo: " + this.getSaldo());
    }

}