public interface Movimentacao {

    boolean sacar(double valor);

    void depositar(double valor);

    void transferir(ContaCorrente contaCorrente, double valor);

}