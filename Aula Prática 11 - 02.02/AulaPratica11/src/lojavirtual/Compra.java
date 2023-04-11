package lojavirtual;

public class Compra {
    private String cpf;
    private String data;
    private String produto;
    private double preco;

    public Compra(String cpf, String data, String produto, double preco) {
        this.cpf = cpf;
        this.data = data;
        this.produto = produto;
        this.preco = preco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getData() {
        return data;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }
    
    public int compareTo(Compra comparar) {
        if (this.getPreco() > comparar.getPreco()) {
            return 1;
        }else if (this.getPreco() < comparar.getPreco()) {
            return -1;
        }
        return 0;
    }
    
    public String toString() {
        return getData() + "," + getProduto() + "," + getPreco() + "\n";
    }   
}