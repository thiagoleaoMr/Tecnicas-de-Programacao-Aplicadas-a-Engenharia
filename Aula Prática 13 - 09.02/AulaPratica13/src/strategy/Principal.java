package strategy;
//import java.io.PipedInputStream;
import java.util.Scanner;

public class Principal {
 
    private static Scanner entrada;
    private static Investimento novoInvestimento;
    private static int tempo = 0;
    private static double valor = 0;
    
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        int opcao = 0;  
        //double valor = 0;
        //int tempo = 0;
        
        while(opcao != 4){
            exibirMenu1();
            exibirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            executarOpcao(opcao);
        }
    }

    public static void exibirMenu1(){        
        System.out.println("\nEntre com o valor inicial do investimento: ");
        valor = entrada.nextDouble();
        //valor = entrada;
        
        System.out.println("Entre com o tempo (meses) da aplicação: ");
        tempo = entrada.nextInt();
        //tempo = entrada;
    }
    
    public static void exibirMenu(){
        System.out.println("\nSelecione o Tipo de Investimento desejado:");
        System.out.println("1 - Conservador");
        System.out.println("2 - Moderado");
        System.out.println("3 - Arrojado");
        System.out.println("4 - Sair");
        System.out.println("Digite sua opcao: ");        
    }
    
    public static void executarOpcao(int opcao){
        double resultado = 0;
        
        switch(opcao){
            case 1:
                //System.out.println();
                novoInvestimento = new Investimento(new Conservador());
                resultado = novoInvestimento.calcularRetornoInvestimento(valor, tempo);
                System.out.println("Valor final esperado: " + resultado);
                break;
            case 2:
                novoInvestimento = new Investimento(new Moderado());
                resultado = novoInvestimento.calcularRetornoInvestimento(valor, tempo);
                System.out.println("Valor final esperado: " + resultado);
                break;
            case 3:
                novoInvestimento = new Investimento(new Conservador());
                resultado = novoInvestimento.calcularRetornoInvestimento(valor, tempo);
                System.out.println("Valor final esperado: " + resultado);
                break;
            case 4:
                break;
            default:
                System.out.println("Erro! Comando inválido.");                
        }
    }
        
    
}
