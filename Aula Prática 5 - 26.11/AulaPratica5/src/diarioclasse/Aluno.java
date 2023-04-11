package diarioclasse;

public class Aluno {
    
    private String nome;
    private int nota;
    private int falta;
    
    public Aluno(String nome, int nota, int falta){
        this.nome = nome;
        this.nota = nota;
        this.falta = falta;        
    }
    
    public int getNota(){
        return nota;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getFalta(){
        return falta;
    }
    
    public String getSituacao(){
        if(getNota() >= 60 && getFalta() < 19)
            return "Aprovado";
        else 
            return "Reprovado";        
    }
}
