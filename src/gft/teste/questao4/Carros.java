package gft.teste.questao4;


public class Carros extends Carro{

    public String combustivel;

    public Carros(String modelo, String marca) {
        super(modelo, marca);
    }

    public String dados() {
        return "Modelo: " + this.modelo + ", Marca: " + this.marca + ", Combustivel: " + this.combustivel;
    }
}
