package agendacontatos;
import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Pessoa> listaContatos; //list
    
    public Agenda(){
        listaContatos = new ArrayList <>();
    }
    
    public Pessoa buscarPessoa (String s){
        for (Pessoa p: listaContatos){
            if(p instanceof PessoaFisica){ //p é Contato
                PessoaFisica pFisica = (PessoaFisica)p; //casting de Pessoa p para PessoaFisica pFisica
                if(pFisica.getCpf().equals(s)) //pFisica é PessoaFisica
                    return pFisica;
            }else{
                PessoaJuridica pJuridica = (PessoaJuridica)p;
                if(pJuridica.getCnpj().equals(s))
                    return pJuridica;
            }
        }
        return null;
    }
    
    public void adicionarContato(Pessoa p){
        listaContatos.add(p);        
    }
    
    public boolean removerContato(String s){
        Pessoa p = buscarPessoa(s);
        if(buscarPessoa(s) != null){
            listaContatos.remove(p);
            return true;
        }
        return false;
    }
    
    public void listarContatos() {
        for (Pessoa p: listaContatos) 
            System.out.println(p);
    }
}