package simulador;

public class Atendente {
    private int tempoProximaLiberacao; //depende do tempo de atendimento de cada um
    
    public boolean estaDisponivel(int tempoDaSimulacao){
        return (tempoDaSimulacao >= tempoProximaLiberacao);   
    }
    
    public void atenderCliente(int tempoDaSimulacao, int duracaoAtendimento){
        tempoProximaLiberacao = tempoDaSimulacao + duracaoAtendimento;
    }
    
}
