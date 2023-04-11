package simulador;
import java.util.Scanner;

public class Principal {  

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero de atendentes da agencia bancaria:  ");
        int numeroAt = entrada.nextInt();
        System.out.print("Digite a duracao da simulacao:  ");
        int duracao = entrada.nextInt();
        Simulador s = new Simulador(duracao, numeroAt);
        s.simular();

        entrada.close();    
    }
}
