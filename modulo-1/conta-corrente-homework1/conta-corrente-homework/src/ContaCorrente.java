public class ContaCorrente extends Conta implements Impressao {
    private double saldo;
    double chequeEspecial;

    public ContaCorrente(double saldo, double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public double retornarSaldoComChequeEspecial() {
        System.out.println("O valor disponivel em sua conta e de : ");
        return this.saldo + this.chequeEspecial;
    }

    public boolean sacar(double saque) {
        if (saque < 0.0) {
            System.out.println("Nao foi possivel realizar o saque.");
            return false;
        } else if (saque > 0.0 && saque < this.retornarSaldoComChequeEspecial()) {
            this.saldo -= saque;
            System.out.println("Saque autorizado, retire o dinheiro no local indicado: " + this.saldo);
            return true;
        } else {
            System.out.println("Nao foi possivel realizar o saque, saldo negativo.");
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

    @Override
    public void imprimir() {

    }
}



