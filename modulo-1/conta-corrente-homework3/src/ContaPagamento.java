public class ContaPagamento extends Conta implements Impressao {
    final double TAXA_SAQUE = 4.25;

    public ContaPagamento(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public boolean sacar(double valor) {
        if (getSaldo() >= valor + TAXA_SAQUE) {
            this.setSaldo(this.getSaldo() - valor - TAXA_SAQUE);
            System.out.println("Saque realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque não pode ser efetuado, saldo negativo.");
            return false;
        }
    }

    public boolean transferir(ContaCorrente conta, double valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
            return true;
        } else {
            System.out.println("Nao foi possivel realizar sua transferencia neste momento, tente novamente.");
            return false;
        }
    }

        public void imprimir () {
            System.out.println("Seu novo saldo da conta pagamento é: R$" + this.getSaldo());
        }
    }

