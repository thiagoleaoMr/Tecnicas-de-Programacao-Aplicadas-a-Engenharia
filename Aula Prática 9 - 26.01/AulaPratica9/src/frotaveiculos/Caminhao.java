package frotaveiculos;

public class Caminhao extends Veiculo implements Tributavel{
    private int numEixos;

    public Caminhao(String marca, String modelo, int anoFabricacao, int numEixos) {
        super(marca, modelo, anoFabricacao);
        this.numEixos = numEixos;
    }
    
    public double calcularIPVA(){
        return 200.0 * numEixos/(2024 - getAnoFabricacao());
    }

    public int getNumEixos() {
        return numEixos;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nNumero de Eixos: " + getNumEixos() + "\nIPVA: " + String.format("%.2f", calcularIPVA());    
    }
    
    
    
}
