package exercicio3;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
              
        Scanner entrada = new Scanner(System.in); 
        
        int qtdPalavras;
        qtdPalavras = entrada.nextInt();        
        
        String frase;
        String[] palavras = new String[qtdPalavras];
        frase = entrada.nextLine();              
        palavras = frase.split(" ");
        
        int vogal = 0;
        char c;
        for(int i=0; i<qtdPalavras; i++){
            for(int j=0; j<palavras[i].length(); j++){ 
                c = palavras[i].charAt(j);
                if ('a' || 'e' || 'i' || 'o' || 'u' == c)
                    vogal++;                               
            }
        }     
        
        
        
        System.out.print("");
        
    }
    
}
