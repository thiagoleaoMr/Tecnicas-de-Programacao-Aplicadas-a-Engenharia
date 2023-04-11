package strategy;

public class Conservador implements TipoInvestidor{
    
    @Override
    public double calcularRetorno(double valor, int tempo){
        return valor * Math.pow(1.008, tempo);
    }
    
}
