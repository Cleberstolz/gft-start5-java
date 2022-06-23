package gft.teste.questao1e2;

public class Main {
    public static void main(String[] args) {
        //conta Corrente
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(111);
        cc.setTitular("Vanessa");
        cc.setSaldo(1000);

        //Conta poupança
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(222);
        cp.setTitular("Joao");
        cp.setSaldo(1000);

        System.out.println("Número da conta: " + cc.getNumero());
        System.out.println("Titular: " + cc.getTitular());
        System.out.println("Saldo: " + cc.getSaldo());
        System.out.println("Rendimento: " + String.format("%.2f", cc.rendimento()));
        System.out.println("Imposto: " + String.format("%.2f", cc.calcularImposto()));
        System.out.println("Total do saldo + rendimento: " + String.format("%.2f", (cc.getSaldo() + cc.rendimento())));

        System.out.println("----------------------");

        System.out.println("Número da conta: " + cp.getNumero());
        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Saldo: " + cp.getSaldo());
        System.out.println("Rendimento: " + String.format("%.2f", cp.rendimento()));
        System.out.println("Imposto: " + String.format("%.2f", cp.calcularImposto()));
        System.out.println("Total do saldo + rendimento: " + String.format("%.2f", (cp.getSaldo() + cp.rendimento())));
    }
}
