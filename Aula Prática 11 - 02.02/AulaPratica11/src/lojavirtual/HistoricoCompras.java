package lojavirtual;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class HistoricoCompras {
    
    private ArrayList<Compra> listaCompras;
    
    public HistoricoCompras(){
        listaCompras = new ArrayList<>();
    }
    
    public void adicionarCompra(Compra c) {
        listaCompras.add(c);
    }
    
    public void salvarDadosTxt(String dadosTexto) {
        try (FileWriter arquivo = new FileWriter(dadosTexto + ".txt")) {
            for (Compra c: listaCompras) 
                if (c.getCpf().equals(dadosTexto))                     
                    arquivo.write(c.toString());
        }
        catch(Exception e) {
            System.out.println("Falha ao salvar no arquivo " + dadosTexto);
        }
    }           
            
    public void gerarRelatorio(String cpf) {        
        Collections.sort(listaCompras);
        for (Compra c: listaCompras) {
            if (c.getCpf().equals(cpf))             
                System.out.println(c);
        }
    }         
    //metodo gerar relatorio arquivo
    //metodo ordenação comparator
}