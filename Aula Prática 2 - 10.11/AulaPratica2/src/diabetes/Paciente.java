package diabetes;

public class Paciente {
    private int tam;
    private String nome;
    private double exames[];
    private int cont;
    
    public Paciente(String nome, int tam){
        this.nome = nome;
        this.tam = tam;
        exames = new double[tam];
        this.cont = 0;
    }

    public String getNome() {
        return nome;
    }
    
    public double resultadoAnalise(int i){
        return exames[i];
    }
    
    public double mediaResultados(){
        double soma = 0;        
        for(int i=0; i < tam; i++){
            soma += exames[i];            
        }
        return (soma/tam);
    }
    
    public String diagnosticoPacientes(int i){
        if(exames[i] < 140.00)
        //if (mediaResultados() < 140.0)
            return "Glicemia Normal";
        //else if (mediaResultados() < 200.0)
        else if(exames[i] < 200.00)
            return "Risco de Diabetes";
        return "Diabetes Mellitus";    
    }
  
    public void inserirResultado(double i){
           exames[cont] = i;
           cont++;
    }
}