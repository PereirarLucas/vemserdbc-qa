public class Banco {

    public static void main(String[] args) {
        Contato contato1 = new Contato("Casa", "40028922", 1);
        Contato contato2 = new Contato("Empresa", "40028922", 2);
        Contato contato3 = new Contato("Casa", "40028922", 1);
        Contato contato4 = new Contato("Empresa", "40028922", 2);

        Endereco endereco1 = new Endereco(110, 1, "Travessa fischer", "Mendanha", "94410200", "Viamão", "RS", "BRASIL");
        Endereco endereco2 = new Endereco(106, 2, "Rua da estrela", "Messejana", "36218999", "Fortaleza", "CE", "BRASIL");
        Endereco endereco3 = new Endereco(900, 1, "Rua IV", "Bela Vista", "21455220", "Itaborai", "RJ", "BRASIL");
        Endereco endereco4 = new Endereco(222, 2, "Rua Caruaru", "Centro", "94410578", "Viamão", "RS", "BRASIL");

        Cliente cliente1 = new Cliente("Lucas", "944.555.888-99", new Contato[]{contato1, contato2}, new Endereco[]{endereco1, endereco2});
        Cliente cliente2 = new Cliente("Paulo", "111.222.333-55", new Contato[]{contato3, contato4}, new Endereco[]{endereco3, endereco4});

        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, "1461", "378", 200.0, 100.0);
        ContaCorrente contaCorrente2 = new ContaCorrente(cliente2, "689", "700", 100.0, 50.0);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente1, "1461", "378", 200.0);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente2, "689", "700", 100.0);

        contaCorrente1.imprimir();
        cliente1.imprimirCliente();

        contaCorrente2.imprimir();
        cliente2.imprimirCliente();

        contaCorrente1.transferir(contaCorrente2, 50.0);
        contaCorrente2.transferir(contaCorrente2, 100.0);

        contaCorrente1.imprimir();
        contaCorrente2.imprimir();

        contaPoupanca1.creditarTaxa();
        contaPoupanca2.creditarTaxa();

        contaPoupanca1.imprimir();
        contaPoupanca2.imprimir();
    }

}
