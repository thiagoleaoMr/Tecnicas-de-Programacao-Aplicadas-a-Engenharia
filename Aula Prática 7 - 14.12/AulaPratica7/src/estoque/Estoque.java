package estoque;
import java.util.Comparator;
import java.util.ArrayList;

public class Estoque {
    private String tipoEstoque;
    private ArrayList<Produto> produtos;
    
    public Estoque(String tipoEstoque){
        this.tipoEstoque = tipoEstoque;
        produtos = new ArrayList<>();
    }
    
    public void cadastrarProduto(Produto p){
        produtos.add(p);                
    }
    
    public void gerarRelatorio(){              
        produtos.sort(getComparador());
        
        System.out.println("\nTIPO DO ESTOQUE: fluxo");
        System.out.printf("\n%-15s %-15s %-15s", "NOME", "MARCA", "QUANTIDADE");
        for (Produto p : produtos)     
            System.out.printf("\n%-15s %-15s %-15s", p.getNome(), p.getMarca(), p.getQtd());
    }
    
    public Comparator<Produto> getComparador() {
        Comparator<Produto> comparador = new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                int resultado = p1.getNome().compareTo(p2.getNome());

                if(resultado != 0)
                    return resultado;
                else
                    return p1.getMarca().compareTo(p2.getMarca());
            }
        };
        return comparador;
    }
}