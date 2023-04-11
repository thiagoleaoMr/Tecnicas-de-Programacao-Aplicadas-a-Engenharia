package escola;
import java.util.Random;

public class Questao {
    private String enunciado;
    private int resposta;
    private static int numQuestao = 0;
    
    public Questao(){
        numQuestao++;
        Random r = new Random();
        int n1 = r.nextInt(10); //0 a 9
        int n2 = r.nextInt(10);       
        enunciado = "QUESTAO " + numQuestao + " \nQuanto eh " + n1 + " x " + n2 + " ?";
        resposta = n1*n2;
    }
    
    public String getEnunciado(){
        return enunciado;
    }
    
    public boolean acertou(int resp){
        if (resp == resposta)
            return true;
        return false;
    }    
}