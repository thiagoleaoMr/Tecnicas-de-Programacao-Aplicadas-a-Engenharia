package exercicio1;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int codigo;
        codigo = entrada.nextInt();
        
        int qtd;
        qtd = entrada.nextInt();
        
        
        double precoUnit;
        if (codigo > 0 && codigo <= 10)
            precoUnit = 10.00;
        else if (codigo <= 20)
            precoUnit = 15.00;
        else if (codigo <= 30)
            precoUnit = 20.00;
        else 
            precoUnit = 30.00;        
        System.out.println(precoUnit);
        
        
        double valorTot;
        valorTot = qtd * precoUnit;
        System.out.println(valorTot);
        
        
        double desconto;
        if (valorTot < 250.00)
            desconto = valorTot * 0.05;
        else if (valorTot <= 500.00)
            desconto = valorTot * 0.10;
        else 
            desconto = valorTot * 0.15;        
        System.out.println(desconto);
            
        
        double precoFinal;
        precoFinal = valorTot - desconto;
        System.out.println(precoFinal);
        
    }
    
}
