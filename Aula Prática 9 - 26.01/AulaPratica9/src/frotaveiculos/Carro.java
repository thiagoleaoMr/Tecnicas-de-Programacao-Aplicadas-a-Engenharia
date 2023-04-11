package frotaveiculos;

public class Carro extends Veiculo implements Tributavel{
    private String categoria;


    public Carro(String marca, String modelo, int anoFabricacao, String categoria) {
        super(marca, modelo, anoFabricacao);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public double calcularIPVA(){
        if (categoria.equals("passeio"))
            return 1500.0/(2024 - getAnoFabricacao());
        else if (categoria.equals("utilitario"))
            return 1000.0/(2024 - getAnoFabricacao());
        return 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCategoria: " + getCategoria() + "\nIPVA: " + String.format("%.2f", calcularIPVA());
    }    
    
    
}
