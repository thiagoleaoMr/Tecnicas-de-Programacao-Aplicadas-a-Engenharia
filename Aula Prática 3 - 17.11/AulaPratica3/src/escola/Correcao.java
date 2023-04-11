package escola;

public class Correcao {
    private int questao[];
    private String situacao[];
    private int numTentativas[];

    public Correcao(int[] questao, String[] situacao, int[] numTentativas) {
        questao = new int [5];
        situacao = new String [5];
        numTentativas = new int [5];
    }
    
    public int getQuestao() {
        for (int i=0; i<5; i++){
            return questao[i];
        }
        return 0;
    }
    
    public String getSituacao() {
        for (int i=0; i<5; i++){
            return situacao[i];
        }
        return null;
    }
        
    public int getNumTentativas() {
        for (int i=0; i<5; i++){
            return numTentativas[i];
        }
        return 0;
    }
}
