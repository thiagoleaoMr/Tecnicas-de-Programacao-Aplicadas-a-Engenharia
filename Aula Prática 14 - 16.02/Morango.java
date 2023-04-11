package decorator;

public class Morango extends Sabores{
    
    public Morango(Sorvete s){
        super(s);
    }
    
    @Override
    public double preco(){
        return 1.5 + getSorvete().preco();
    }
}
