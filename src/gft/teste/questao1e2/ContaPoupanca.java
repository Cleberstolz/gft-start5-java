package gft.teste.questao1e2;

public class ContaPoupanca extends Conta implements Imposto{

    @Override
    public double rendimento() {
        return this.getSaldo() * 0.05;
    }

    @Override
    public double calcularImposto() {
        // rendimento * 10%
        return (10 / 100f) * this.rendimento();
    }
}
