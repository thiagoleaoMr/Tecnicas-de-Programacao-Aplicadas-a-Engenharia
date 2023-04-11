package diarioclasse;

import java.util.ArrayList;
import java.util.Comparator;

public class Diario {

    private String codigo;
    private ArrayList<Aluno> alunos;

    public Diario(String codigo) {
        this.codigo = codigo;
        alunos = new ArrayList<>();
    }

    public String getCodigo(){
        return codigo;
    }
    
    public boolean estaMatriculado(Aluno id) {
        if (alunos.contains(id) == true)
            return true;
        return false;
    }

    public void adicionarAluno(Aluno id) {
        if (!estaMatriculado(id) == true)
            alunos.add(id);
    }

    public void gerarDiarioTurma() {        
        alunos.sort(getComparador());
        
        System.out.printf("\nDISCIPLINA: " + getCodigo());        
        System.out.printf("\n%-8s %-10s %-12s %-10s", "NOME", "NOTA", "FALTAS", "SITUACAO");
        for (Aluno a : alunos) {
            System.out.printf("\n%-8s %-10d %-12d %-10s", a.getNome(), a.getNota(), a.getFalta(), a.getSituacao());            
        }
        System.out.println("\n");
    }

    public Comparator<Aluno> getComparador() {

        Comparator<Aluno> comparador = new Comparator<>() {
            @Override
            public int compare(Aluno a1, Aluno a2) {
                return (a1.getNota() - a2.getNota()) * (-1); //-1 para inverter a ordem
            }
        };
        return comparador;
    }

}
