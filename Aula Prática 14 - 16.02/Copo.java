package decorator;

public class Copo extends Sorvete {
    
    public Copo (String descricao){
        setDescricao(descricao);
    }
    
    @Override
    public double preco(){
        return 1.7;
    }
}