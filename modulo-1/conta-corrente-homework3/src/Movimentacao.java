public interface Movimentacao {

    boolean sacar(double valor);

    boolean depositar(double valor);

    boolean transferir(ContaCorrente contaCorrente, double valor);

}