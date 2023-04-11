package strategy;

public class Investimento {
    private TipoInvestidor tipoInvestidor;
    
    public Investimento (TipoInvestidor tipoInvestidor){
        this.tipoInvestidor = tipoInvestidor;
    }
    
    public double calcularRetornoInvestimento(double valor, int tempo){
        return tipoInvestidor.calcularRetorno(valor, tempo);
    }
    
}
