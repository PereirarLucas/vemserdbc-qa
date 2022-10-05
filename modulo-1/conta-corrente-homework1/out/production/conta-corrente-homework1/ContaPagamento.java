public class ContaPagamento {
    public class ContaPagamento extends Conta implements Impressao {
        final double TAXA_SAQUE = 4.25;

        public ContaPagamento(Cliente cliente, String numeroConta, String agencia, double saldo) {
            super(cliente, numeroConta, agencia, saldo);
        }

        public boolean sacar(double valor) {
            if (valor > 0.0 && valor <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - valor);
                if (this.getSaldo() >= 4.25) {
                    this.setSaldo(this.getSaldo() - 4.25);
                    return true;
                } else {
                    System.out.println("Não foi possivel sacar, saque menor que saldo atual.");
                    return false;
                }
            } else {
                return false;
            }
        }

        public void imprimir() {
            System.out.println("Saldo da conta pagamento: R$" + this.getSaldo());
        }
    }

}
