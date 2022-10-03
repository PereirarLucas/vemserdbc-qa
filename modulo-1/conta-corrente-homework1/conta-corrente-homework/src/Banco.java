public class Banco {
    public Banco() {
    }

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        c1.cliente.contato[0] = new Contato();
        c1.cliente.contato[1] = new Contato();
        c1.cliente.endereco[0] = new Endereco();
        c1.cliente.endereco[1] = new Endereco();
        c2.cliente.contato[0] = new Contato();
        c2.cliente.contato[1] = new Contato();
        c2.cliente.endereco[0] = new Endereco();
        c2.cliente.endereco[1] = new Endereco();
        c1.cliente.contato[0].descricao = "Celular";
        c1.cliente.contato[0].telefone = "94410-5089";
        c1.cliente.contato[0].tipo = 1;
        c1.cliente.contato[1].descricao = "Telefone";
        c1.cliente.contato[1].telefone = "3333-6565";
        c1.cliente.contato[1].tipo = 2;
        c1.cliente.endereco[0].tipo = 1;
        c1.cliente.endereco[0].logradouro = "Rua IV";
        c1.cliente.endereco[0].numero = 1;
        c1.cliente.endereco[0].complemento = "Bela vista";
        c1.cliente.endereco[0].cep = "99999-000";
        c1.cliente.endereco[0].cidade = "Itaborai";
        c1.cliente.endereco[0].estado = "Rio de Janeiro";
        c1.cliente.endereco[0].pais = "Brasil";
        c1.cliente.endereco[1].tipo = 2;
        c1.cliente.endereco[1].logradouro = "R da estrela";
        c1.cliente.endereco[1].numero = 1;
        c1.cliente.endereco[1].complemento = "Cemite´rio";
        c1.cliente.endereco[1].cep = "94410-200";
        c1.cliente.endereco[1].cidade = "Viamão";
        c1.cliente.endereco[1].estado = "Rio Grande do Sul";
        c1.cliente.endereco[1].pais = "Brasil";
        c1.cliente.nome = "Paulo";
        c1.cliente.cpf = "789.548.604.05";
        c1.numeroConta = "15967";
        c1.agencia = 1;
        c1.saldo = 1200.0;
        c1.chequeEspecial = 50.0;
        c2.cliente.contato[0].descricao = "Celular";
        c2.cliente.contato[0].telefone = "98765-4321";
        c2.cliente.contato[0].tipo = 2;
        c2.cliente.contato[1].descricao = "Telefone";
        c2.cliente.contato[1].telefone = "4002-8922";
        c2.cliente.contato[1].tipo = 1;
        c2.cliente.contato[0].tipo = 1;
        c2.cliente.endereco[0].logradouro = "Rua Cauaru";
        c2.cliente.endereco[0].numero = 2;
        c2.cliente.endereco[0].complemento = "Chapa quente";
        c2.cliente.endereco[0].cep = "93215-587";
        c2.cliente.endereco[0].cidade = "Porto Alegre";
        c2.cliente.endereco[0].estado = "Rio Grande do Sul";
        c2.cliente.endereco[0].pais = "Brasil";
        c2.cliente.endereco[1].tipo = 2;
        c2.cliente.endereco[1].logradouro = "Rua 7 de setembro";
        c2.cliente.endereco[1].numero = 1;
        c2.cliente.endereco[1].complemento = "";
        c2.cliente.endereco[1].cep = "94489-256";
        c2.cliente.endereco[1].cidade = "Canoas";
        c2.cliente.endereco[1].estado = "Rio Grande do Sul";
        c2.cliente.endereco[1].pais = "Brasil";
        c2.cliente.nome = "Ronaldo";
        c2.cliente.cpf = "444.655.789-12";
        c2.numeroConta = "26349";
        c2.agencia = 1;
        c2.saldo = 4300.0;
        c2.chequeEspecial = 150.0;
        c1.imprimirContaCorrente();
        c1.sacar(1200.0);
        c1.sacar(1500.0);
        c1.imprimirContaCorrente();
        c1.cliente.imprimirEndereco();
    }
}
