public class ContaPagamento extends Conta implements Impressao {
        final double TAXA_SAQUE = 4.25;

        public ContaPagamento(Cliente cliente, String numeroConta, String agencia, double saldo) {
            super(cliente, numeroConta, agencia, saldo);
        }

    public ContaPagamento(Cliente contato5, String numeroConta, int i, double saldo) {
        super(contato5, numeroConta, String.valueOf(i), saldo);
    }

    public ContaPagamento(Contato contato5, String s, int i, double v) {
        super();
    }

    public boolean sacar(double valor) {
            if (valor > 0.0 && valor <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - valor);
                if (this.getSaldo() >= 4.25) {
                    this.setSaldo(this.getSaldo() - 4.25);
                    return true;
                } else {
                    System.out.println("Saque não pode ser realizado no momento, saldo insuficiente. ");
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
