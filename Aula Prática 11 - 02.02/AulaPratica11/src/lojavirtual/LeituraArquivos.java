package lojavirtual;
import java.io.*;

public class LeituraArquivos {
    
    public HistoricoCompras leituraDadosTxt(String nomeArquivo){
        HistoricoCompras hc = new HistoricoCompras();
        
        try(BufferedReader arquivo = new BufferedReader(new FileReader(nomeArquivo))){
            String linha = arquivo.readLine();
            
            while(linha != null){
                String[] campos = linha.split(",");                
                Compra c = new Compra(campos[0], campos[1], campos[2], Double.parseDouble(campos[3]));
                
                hc.adicionarCompra(c);
                linha = arquivo.readLine();                
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Impossivel abrir o arquivo!");
        }
        catch(IOException e){
            System.out.println("Problema na leitura do arquivo!");
        }
        return hc;
    }
    
    public HistoricoCompras leituraDadosBin(String nomeArquivo){
        HistoricoCompras hc = null;
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo));
            hc = (HistoricoCompras)ois.readObject();
            ois.close();
        }
        catch(Exception e){
            System.out.println("Erro! Arquivo inexistente.");
        }
        return hc;
    }
    
    public void salvarDadosBin(HistoricoCompras compra, String nomeArquivo) {

        try(ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream(nomeArquivo + ".bin"))) {
            object.writeObject(compra);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
