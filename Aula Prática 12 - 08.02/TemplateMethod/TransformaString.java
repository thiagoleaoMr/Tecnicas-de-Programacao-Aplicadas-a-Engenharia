import java.util.Scanner;

public abstract class TransformaString {
    private String s;

    public final void transformarString(){ //metodo principal     
        s = lerString(s); //parte fixa
        s = modificarString(s); //parte variavel
        imprimirString(s); //parte fixa
    }

    public String lerString(String s){ //parte fixa
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a String: ");
        return entrada.nextLine();
    }

    public abstract String modificarString(String s); //parte variavel

    public void imprimirString(String s){ //parte fixa
        System.out.println(s +"\n");
    }

}
