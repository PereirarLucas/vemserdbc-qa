import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Stream {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        int i = 0;
        lista.add(new Pessoa(++i, "Paulo", 6500, "Desenvolvedor"));
        lista.add(new Pessoa(++i, "Pedro Paulo", 5300, "Desenvolvedor"));
        lista.add(new Pessoa(++i, "Enzo", 2350, "Desenvolvedor"));
        lista.add(new Pessoa(++i, "Joel", 6000, "Arquiteto"));
        lista.add(new Pessoa(++i, "Henrique", 1000, "Estagiário"));
        lista.add(new Pessoa(++i, "Gabriel", 1000, "Estagiário"));
        lista.add(new Pessoa(++i, "Gustavo", 18000, "Diretor"));

        //1- listar todas as pessoas
        lista.stream().
                forEach(pessoa -> System.out.println(pessoa));
        System.out.println();

        //2- filtrar todas as pessoas com salario maior do que 5 mil (filter)
        List<Pessoa> filtrado = lista.stream()
                .filter(pessoa -> pessoa.getSalario() > 5000)
                .toList();
        System.out.println(filtrado);
        System.out.println();

        //3- filtrar todas as pessoas que são desenvolvedoras e organizar por salário crescente (filter, sorted)
        List<Pessoa> filtrado1 = lista.stream()
                .filter(pessoa -> pessoa.getCargo().equals("Desenvolvedor"))
                .sorted(Comparator.comparing(pessoa -> pessoa.getSalario()))
                .toList();
        System.out.println(filtrado1);
        System.out.println();

        //4- fazer a média salarial de todos
        Double media = lista.stream()
                .mapToDouble(Pessoa::getSalario)
                .average()
                .getAsDouble();
        System.out.println(media);
        System.out.println();

        //5- verificar na lista (utilizando o método anyMatch) se tem alguém que ganha mais do que 20 mil
        boolean maisde20k = lista.stream()
                .anyMatch(pessoa -> pessoa.getSalario() > 20000.00);
        System.out.println(maisde20k);
        System.out.println();

        //6- retornar uma lista de todos os ids das pessoas
        List<Integer> listaIds = lista.stream()
                .map(Pessoa::getId)
                .toList();
        System.out.println(listaIds);
        System.out.println();

        //7- criar uma nova classe Salario com ID e Salário, utilizando a função "map" do stream, retornar uma lista desse novo objeto
        List<Salario> novalista = lista.stream()
                .map(pessoa -> new Salario(pessoa.getId(), pessoa.getSalario()))
                .toList();
        System.out.println(novalista);
        System.out.println();

        //8- retornar um HashMap (estrutura de dados, e não uma função map) contendo os ids e os nomes dos colaboradores
        Map<Integer, String> hashmap = lista.stream()
                .collect(toMap(Pessoa::getId, Pessoa::getNome));
        System.out.println(hashmap);
        System.out.println();

        //9- com o mapa da 8, retornar o nome com o id=2
        System.out.println(hashmap.get(2));
        System.out.println();

        //10- verificar se tem alguém que contenha o nome "Paulo" (containsignorecase) na lista e retornar o primeiro elemento que encontrar (findFirst).
        //    Imprimir o nome e salário dessa pessoa
        Optional<Pessoa> BuscaPessoa = lista.stream()
                .filter(pessoa -> pessoa.getNome().toLowerCase().contains("paulo"))
                .findFirst();
        System.out.println(BuscaPessoa.get());
        Map<String, Double> Paulo = BuscaPessoa.stream()
                .collect(toMap(Pessoa::getNome, Pessoa::getSalario));
        System.out.println(Paulo);
    }

    static class Salario {

        private int id;
        private double salario;

        public Salario(int id, double salario) {
            this.id = id;
            this.salario = salario;
        }

        @Override
        public String toString() {
            return "Salario{" +
                    "id=" + id +
                    ", salario=" + salario +
                    '}';
        }
    }

    static class Pessoa {
        private int id;
        private String nome;
        private double salario;
        private String cargo;

        public Pessoa(int id, String nome, double salario, String cargo) {
            this.id = id;
            this.nome = nome;
            this.salario = salario;
            this.cargo = cargo;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", salario=" + salario +
                    ", cargo='" + cargo + '\'' +
                    '}';
        }
    }
}