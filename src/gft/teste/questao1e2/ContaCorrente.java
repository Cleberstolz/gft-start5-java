package gft.teste.questao1e2;

public class ContaCorrente extends Conta implements Imposto{

    @Override
    public double rendimento() {
        return this.getSaldo() * 0.03;
    }

    @Override
    public double calcularImposto() {
        //rendimento * 25%
        return (25 / 100f) * this.rendimento();
    }
}
