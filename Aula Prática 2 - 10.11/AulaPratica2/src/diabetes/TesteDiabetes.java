package diabetes;

import java.util.Scanner;

public class TesteDiabetes{    
    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);  
        
        System.out.print("Digite o nome do paciente: ");
        String nome = entrada.nextLine();         
        
        System.out.print("Entre com a quantidade de amostras coletadas: ");        
        int qtd = entrada.nextInt();
        paciente = new Paciente(nome, qtd);        
        
        //int i=0;
        for (int i = 0; i<(qtd-1); i++){
            System.out.printf("Insira o resultado do teste " + i + ": ");
            double teste = entrada.nextDouble();
            paciente.inserirResultado(teste);
        }
        
        double resultadoMedio = paciente.mediaResultados();
        String diagnostico = paciente.diagnosticoPacientes(qtd);
        
        System.out.println("############### RELATORIO FINAL ###############");
        System.out.printf("Resultado medio: %2f", resultadoMedio);
        System.out.printf("Diagnostico: %s", diagnostico);
    }
}