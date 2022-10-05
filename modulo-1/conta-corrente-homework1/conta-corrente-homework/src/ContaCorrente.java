public class ContaCorrente extends Conta implements Impressao {
    double chequeEspecial;

    public ContaCorrente(Cliente cliente, String numeroConta, String agencia, double saldo, double chequeEspecial) {
        super(cliente, numeroConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public void imprimir() {
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Saldo: " + this.getSaldo());
    }

    public double retornarSaldoComChequeEspecial() {
        double valorDisponivel = this.getSaldo() + this.chequeEspecial;
        System.out.println("O valor disponivel em sua conta e de: " + valorDisponivel);
        return valorDisponivel;
    }

    public boolean sacar(double saque) {
        if (saque < 0.0) {
            System.out.println("Nao foi possivel realizar o saque.");
            return false;
        } else if (saque > 0.0 && saque < this.retornarSaldoComChequeEspecial()) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque autorizado, retire o dinheiro no local indicado: " + this.getSaldo());
            return true;
        } else {
            System.out.println("Nao foi possivel realizar o saque, saldo negativo.");
            return true;
        }
    }

}


