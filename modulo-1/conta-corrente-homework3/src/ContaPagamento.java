public class ContaPagamento extends Conta implements Impressao {
    final double TAXA_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public boolean sacar(double valor) {
        if (getSaldo() >= valor + TAXA_SAQUE) {
            this.setSaldo(this.getSaldo() - valor - TAXA_SAQUE);
            return true;
        } else {
            System.out.println("Saque não pode ser efetuado, saldo negativo.");
            return false;
        }
    }

    public void imprimir() {
        System.out.println("Saldo da conta pagamento: R$" + this.getSaldo());
    }
}
