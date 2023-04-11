package frotaveiculos;

public class Veiculo {
    
    private String marca;
    private String modelo;
    private int anoFabricacao;
    
    public Veiculo(String marca, String modelo, int anoFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    
    @Override
    public String toString(){
        return "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno de Fabricacao: " + getAnoFabricacao();
    }
}