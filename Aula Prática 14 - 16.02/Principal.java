package decorator;

public class Principal {

    public static void main(String[] args) {
        
        Sorvete cest = new Cestinha("Sorvete na cestinha");
        cest = new Chocolate(cest);
        cest = new Chocolate(cest);
        cest = new Creme(cest);
        cest = new Morango(cest);   
        cest = new Morango(cest);
        gerarRelatorio(cest);
    }
    
    public static void gerarRelatorio(Sorvete s){
        System.out.printf("\nTipo do sorvete: %s\nQuantidade de bolas: %d\nPreco: R$%.2f\n", s.getDescricao(), s.qtdBolas(), s.preco());
    }
    
}
