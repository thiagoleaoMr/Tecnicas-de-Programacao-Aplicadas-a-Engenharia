package strategy;
import java.util.Random;

public class Arrojado implements TipoInvestidor{
    
    @Override
    public double calcularRetorno(double valor, int tempo){
        double s;
        
        //for(int i=0; i<tempo; i++){
            s = new Random().nextDouble();
            if (s <= 0.65)
                return valor * Math.pow(1.003, tempo);
            else if(s <= 0.25)
                return valor * Math.pow(1.02, tempo);
            else
                return valor * Math.pow(1.05, tempo);
        //}
        //return 0;
    }
}
