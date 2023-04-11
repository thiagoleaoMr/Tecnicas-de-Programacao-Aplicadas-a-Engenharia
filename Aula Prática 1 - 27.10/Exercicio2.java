package exercicio2;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double valorJoao;
        double valorPedro;
        
        valorJoao = entrada.nextInt();
        valorPedro = entrada.nextInt();
        
        int meses = 0;        
        while(valorJoao < valorPedro){
            valorJoao = valorJoao * 1.025;
            valorPedro = valorPedro * 1.005;
            meses++;
        }
        
        System.out.println(meses);

    }
    
}
