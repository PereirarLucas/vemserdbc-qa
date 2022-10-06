import java.util.List;

public class Banco {

    public static void main(String[] args) {
        Contato contato1 = new Contato("Casa", "40028922", 1);
        Contato contato2 = new Contato("Empresa", "40028922", 2);
        Contato contato3 = new Contato("Casa", "40028922", 1);
        Contato contato4 = new Contato("Empresa", "40028922", 2);
        Contato contato5 = new Contato("Casa", "40028922", 2);

        Endereco endereco1 = new Endereco(110, 1, "Travessa fischer", "Mendanha", "94410200", "Viamão", "RS", "BRASIL");
        Endereco endereco2 = new Endereco(106, 2, "Rua da estrela", "Messejana", "36218999", "Fortaleza", "CE", "BRASIL");
        Endereco endereco3 = new Endereco(900, 1, "Rua IV", "Bela Vista", "21455220", "Itaborai", "RJ", "BRASIL");
        Endereco endereco4 = new Endereco(222, 2, "Rua Caruaru", "Centro", "94410578", "Viamão", "RS", "BRASIL");
        Endereco endereco5 = new Endereco(222, 2, "Rua Jaguarao", "Cocao", "94410578", "Viamão", "RS", "BRASIL");

        Cliente cliente1 = new Cliente("Lucas", "944.555.888-99", List.of(contato1, contato2), List.of(endereco1, endereco2));
        Cliente cliente2 = new Cliente("Paulo", "111.222.333-55", List.of(contato3, contato4), List.of(endereco3, endereco4));
        Cliente cliente3 = new Cliente("Douglas", "111.222.333-54", List.of(contato5), List.of(endereco5));

        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, "1461", "378", 200.0, 100.0);
        ContaCorrente contaCorrente2 = new ContaCorrente(cliente2, "689", "700", 100.0, 50.0);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente1, "1461", "378", 200.0);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente3, "689", "700", 100.0);

        ContaPagamento contaPagamento = new ContaPagamento(cliente2,"545", "370", 254.0 );

        contaCorrente1.imprimir();
        cliente1.imprimirCliente();

        contaCorrente2.imprimir();
        cliente2.imprimirCliente();

        contaCorrente1.transferir(contaCorrente2, 50.0);
        contaCorrente2.transferir(contaCorrente1, 100.0);

        contaCorrente1.imprimir();
        contaCorrente2.imprimir();

        contaPoupanca1.creditarTaxa();
        contaPoupanca2.creditarTaxa();

        contaPoupanca1.imprimir();
        contaPoupanca2.imprimir();

        contaPagamento.imprimir();
        cliente3.imprimirCliente();

        contaPagamento.sacar(130.0);
        contaPagamento.imprimir();
    }

}
