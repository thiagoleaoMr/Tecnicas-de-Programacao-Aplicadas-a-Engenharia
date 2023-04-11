package diarioclasse;

public class Principal {
    
    public static void main(String[] args){
        
        Diario diario = new Diario("GAC111");
        Aluno a;
        
        a = new Aluno("Jose",85,12);
        diario.adicionarAluno(a);
        
        a = new Aluno("Pedro",45,10);
        diario.adicionarAluno(a);
        
        a = new Aluno("Regina",75,15);
        diario.adicionarAluno(a);
        
        a = new Aluno("Carou",70,8);
        diario.adicionarAluno(a);
        
        a = new Aluno("Dudu",90,20);
        diario.adicionarAluno(a);
        
        diario.gerarDiarioTurma();
    }
}