package aulapratica;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String[] tipo = {"Americano", "Expresso", "Sem Cafeina"};
        int codigo;
                
        double valorCafe[] = {7.50, 4.30, 10.00};        
        double valorComp[] = {5.00, 8.00, 2.00};
        
        System.out.print("Digite o codigo do tipo do cafe (0: Americano/1: Expresso/2: Sem Cafeina): ");
        codigo = entrada.nextInt();   
        Cafe cafe = new Cafe (tipo[codigo]);        
    
        int cont = 1;
        double valorCompl = 0.00;
        System.out.print("Deseja adicionar algum complemento? (0: nao ou 1: sim): ");
        int opcao = entrada.nextInt();
        
        while (opcao == 1){
            System.out.println("Insira o codigo do " + cont + "o complemento desejado (0: leite, 1: chocolate, 2: canela): ");
            int qualComp = entrada.nextInt();
            cafe.inserirComp(qualComp);
            valorCompl += valorComp[qualComp];
            
            System.out.println("Deseja adicionar outro complemento? (0: nao ou 1: sim): ");
            opcao = entrada.nextInt();
            cont++;
        }
        
        double total = valorCafe[codigo] + valorCompl;
        
        System.out.println("\n\n############### NOTA FISCAL ###############");
        System.out.println("Cafe: " + tipo[codigo]);
        System.out.println("Preco do cafe: " + valorCafe[codigo]);
        System.out.println("Preco dos complementos: " + valorCompl);
        System.out.println("Total: " + total);
        
    }              
}
