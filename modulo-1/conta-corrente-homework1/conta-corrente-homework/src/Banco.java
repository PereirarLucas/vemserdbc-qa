public class Banco {
    public Banco() {
    }
            public static void main(String[] args) {
                new Contato("Casa", "40028922", 1);
                new Contato("Casa", "40028922", 2);
                new Contato("Empresa", "40028922", 1);
                new Contato("Casa", "40028922", 2);
                Endereco endereco1 = new Endereco(1, 13, "Travessa fischer", "Mendanha", "94410200", "Viamão", "RS", "BRASIL");
                Endereco endereco2 = new Endereco(2, 13, "Rua da estrela", "Messejana", "36218999", "Fortaleza", "CE", "BRASIL");
                Endereco endereco3 = new Endereco(1, 13, "Rua IV", "Bela Vista", "21455220", "Itaborai", "RJ", "BRASIL");
                Endereco endereco4 = new Endereco(2, 13, "Rua Caruaru", "Centro", "94410578", "Viamão", "RS", "BRASIL");
                String nome = null;
                Contato contato2 = null;
                Cliente cliente1 = new Cliente("Lucas", "944.555.888-99", endereco1, contato2, endereco2, nome);
                Contato contato4 = null;
                Cliente cliente2 = new Cliente("Paulo", "111.222.333-55", endereco3, contato4, endereco4, nome);
                ContaCorrente contaCorrente1 = new ContaCorrente(200.0, 100.0);
                ContaCorrente contaCorrente2 = new ContaCorrente(100.0, 50.0);
                ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente1, "1461", 378, 200.0);
                ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente2, "689", 700, 100.0);
                contaCorrente1.imprimir();
                cliente1.imprimirCliente();
                contaCorrente2.imprimir();
                cliente2.imprimirCliente();
                contaCorrente1.transferir(contaCorrente2, 50.0);
                contaCorrente1.imprimir();
                contaCorrente2.imprimir();
                contaPoupanca1.creditarTaxa();
                contaPoupanca2.creditarTaxa();
                contaPoupanca1.imprimir();
                contaPoupanca2.imprimir();
            }
        }

