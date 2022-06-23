package gft.teste.questao3;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Cleber", "Brasil", "4799900-0000");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Endereço: " + p.getEndereço());
        System.out.println("Telefone: " + p.getTelefone());
    }
}
