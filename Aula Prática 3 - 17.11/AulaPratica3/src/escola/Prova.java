package escola;
import java.util.Scanner;

public class Prova {
    private Questao questao;
    private Correcao colecao[];
    private int cont = 0;
    
    public Prova(){
        Questao[] questao = new Questao[5];
        colecao = new Correcao[5];
    }
    
    public void aplicar(){
        for (int i=0; i<5; i++){
            cont++;
            questao = new Questao();
            String tentat = null;
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("\nResponda: " + questao.getEnunciado());            
            int r = entrada.nextInt();
            int tentativas = 1;
            
            if (questao.acertou(r)){
                System.out.println("Muito bem, voce acertou! ");
                tentativas++;
            }else{
                if (tentativas < 3){
                    System.out.println("Voce ganhou mais uma chance! Digite outra resposta para a questao: ");
                    int s = entrada.nextInt();
                    tentativas++;
                    if (questao.acertou(s)){
                        System.out.println("Muito bem, voce acertou! ");
                        System.out.println("Voce tentou " + tentativas + " vezes e acertou a questao.");
                        
                    }else{
                        System.out.println("Infelizmente, voce errou! ");
                        System.out.println("Voce tentou " + tentativas + " vezes e errou a questao.");
                    }                
                }            
            }   
            Correcao c1 = new Correcao(cont, tentat, tentativas);
        }       
    }    
    
    
}
