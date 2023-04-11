package empresa;

public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    @Override
    public String toString() {
        return "Nome: "+ getNome()+"\nCPF: "+getCpf()+"\nSalario: "+calcularSalario();
    }
    
    public double calcularSalario(){
        return 0;
    }    
}