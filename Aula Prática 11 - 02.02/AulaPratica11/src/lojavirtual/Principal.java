//package lojavirtual;
import java.util.Scanner;

public class Principal {

    private static Scanner entrada;
    private static LeituraArquivos dados;
    
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        int opcao = 0;
        
        while(opcao != 5){
            mostrarMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            executarOpcao(opcao);
        }
    }
    
    private static void mostrarMenu(){
        System.out.println("\n################## MENU ##################");
        System.out.println("1 - Carregar dados de arquivo texto");
        System.out.println("2 - Carregar dados de arquivo binario");
        System.out.println("3 - Gerar relatorio na tela");
        System.out.println("4 - Salvar relatorio em arquivo de texto");
        System.out.println("5 - Sair");
        System.out.println("Selecione a opcao desejada: ");       
    }
    
    private static void executarOpcao(int opcao){
        switch(opcao){
            case 1:
                carregarDadosTxt();
                break;
            case 2:
                carregarDadosBin();
                break;
            case 3:
                gerarRelatorioTela();
                break;
            case 4:
                salvarDadosTxt();
                break;
            case 5:
                break;
            default:
                System.out.println("Opcao invalida.");
        }
    }    
    
    private static void carregarDadosTxt(){
        System.out.println("Nome do arquivo texto: ");
        String nomeArquivo = entrada.nextLine();
        dados.leituraDadosTxt(nomeArquivo);
    }
    
    private static void carregarDadosBin(){
        System.out.println("Nome do arquivo binario: ");
        String nomeArquivo = entrada.nextLine();
        dados.leituraDadosBin(nomeArquivo);
    }
    
    private static void gerarRelatorioTela(){
        
    }
    
    private static void salvarDadosTxt(){
        System.out.println("");        
    }
}
