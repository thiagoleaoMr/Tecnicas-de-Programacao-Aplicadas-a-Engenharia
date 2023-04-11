package estoque;

public class Principal {
    
    public static void main(String[] args) {
        
        Estoque estoque = new Estoque("fluxo");
        Produto p;
        
        p = new Produto ("Sabonete","Dove", 50);
        estoque.cadastrarProduto(p);
        
        p = new Produto ("Sabonete","Palmolive", 40);
        estoque.cadastrarProduto(p);
        
        p = new Produto ("Arroz","Tio Joao", 125);
        estoque.cadastrarProduto(p);
        
        p = new Produto ("Arroz","Prato Fino", 250);
        estoque.cadastrarProduto(p);
        
        p = new Produto ("Sabonete","Nive", 25);
        estoque.cadastrarProduto(p);
        
        estoque.gerarRelatorio();
        
    }
    
}
