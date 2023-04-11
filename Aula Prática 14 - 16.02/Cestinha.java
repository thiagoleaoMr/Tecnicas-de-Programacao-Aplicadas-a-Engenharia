package decorator;

public class Cestinha extends Sorvete {
    
    public Cestinha (String descricao){
        setDescricao(descricao);
    }
    
    @Override
    public double preco(){
        return 3.2;
    }
}
