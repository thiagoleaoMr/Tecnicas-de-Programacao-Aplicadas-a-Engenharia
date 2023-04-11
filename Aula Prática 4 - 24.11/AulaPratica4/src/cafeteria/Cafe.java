package aulapratica;
import java.util.ArrayList;

public class Cafe {
    
    private String tipoCafe;
    private ArrayList<Integer> complementos;
        
    public Cafe (String tipoCafe){
        this.tipoCafe = tipoCafe;
        complementos = new ArrayList<>();
    }
    
    public String getCafe(){
        return tipoCafe;
    }
    
    public int qtdComplementos(){
        return complementos.size();        
    }
        
    public int codigoComplemento(int p){
        return complementos.get(p);
    }
    
    public void inserirComp(int i){
        complementos.add(i);
    }
    

    
    
    
}
