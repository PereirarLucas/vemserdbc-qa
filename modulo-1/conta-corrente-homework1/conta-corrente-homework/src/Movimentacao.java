public interface Movimentacao {
    boolean sacar(double var1);

    void depositar(double var2);

    void transferir(ContaCorrente var1, double var2);
}
