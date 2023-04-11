package simulador;
import java.util.Random;

public class Cliente {
    private int tempoChegada;
    private int duracaoAtendimento;
    
    public Cliente(int tempoChegada, int duracaoAtendimento){
        this.tempoChegada = tempoChegada;
        this.duracaoAtendimento = duracaoAtendimento;
    }
    
    public int getTempoChegada() {
        return tempoChegada;
    }

    public int getDuracaoAtendimento() {
        return duracaoAtendimento;
    }
}
