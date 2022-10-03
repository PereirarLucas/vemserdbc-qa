public class ContaCorrente {
    Cliente cliente = new Cliente();
    String numeroConta;
    int agencia;
    double saldo;
    double chequeEspecial;

    public ContaCorrente() {
    }

    public void imprimirContaCorrente() {
        System.out.println("Conta corrente: ");
        System.out.println("Nome do titular: " + this.cliente.nome);
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Cheque Especial: " + this.chequeEspecial);
    }
    public double retornarSaldoComChequeEspecial() {
        double sCCE = this.saldo + this.chequeEspecial;
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

    public boolean depositar(double deposito) {
        if (deposito > 0.0) {
            this.saldo += deposito;
            System.out.println("Deposito realizado com sucesso.");
            System.out.println("Seu novo saldo é de R$: " + this.saldo);
            return true;
        } else {
            System.out.println("Nao foi possivel realizar seu deposito.");
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
}



