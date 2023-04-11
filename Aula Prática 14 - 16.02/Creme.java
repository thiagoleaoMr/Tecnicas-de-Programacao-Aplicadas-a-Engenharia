package decorator;

public class Creme extends Sabores{
    
    public Creme(Sorvete s){
        super(s);
    }
    
    @Override
    public double preco(){
        return 3.5 + getSorvete().preco();
    }
}
