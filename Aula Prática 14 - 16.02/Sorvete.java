package decorator;

public abstract class Sorvete {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public abstract double preco();
    
    public int qtdBolas(){
        return 0;
    }  
}
