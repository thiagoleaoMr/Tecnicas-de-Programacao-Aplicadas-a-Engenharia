package decorator;

public class Cone extends Sorvete {
    
    public Cone (String descricao){
        setDescricao(descricao);
    }
    
    @Override
    public double preco(){
        return 2.5;
    }
}