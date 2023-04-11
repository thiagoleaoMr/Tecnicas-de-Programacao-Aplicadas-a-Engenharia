package strategy;
import java.util.Random;

public class Moderado implements TipoInvestidor{
    
    @Override
    public double calcularRetorno(double valor, int tempo){       
        double s;
        
        //for(int i=0; i<tempo; i++){
            s = new Random().nextDouble();
            if (s <= 0.8)
                return valor * Math.pow(1.006, tempo);
            else
                return valor * Math.pow(1.02, tempo);
        //}
        //return 0;
    }
}