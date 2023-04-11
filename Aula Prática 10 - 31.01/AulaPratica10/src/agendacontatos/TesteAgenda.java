package agendacontatos;
import java.util.Scanner;

public class TesteAgenda {
    
    private static Scanner ent; 
    private static Agenda ag; 
    //Contato cont??
        
    public static void main(String[] args){
        
        ent = new Scanner(System.in);
        ag = new Agenda();
        
    	int opcao = 0;
        while(opcao != 5){
            mostrarMenu();
            opcao = ent.nextInt();
            ent.nextLine(); //sempre que ler o inteiro le a quebra de linha automaticamente
            executarOpcao(opcao);
        }
    }
        
        private static void mostrarMenu() {
            System.out.println("\n###################  AGENDA DE CONTATOS  ###################");
            System.out.println("1 - Cadastrar Pessoa Fisica");
            System.out.println("2 - Cadastrar Pessoa Juridica");
            System.out.println("3 - Remover contato");
            System.out.println("4 - Listar todos os contatos");
            System.out.println("5 - Sair");
            System.out.printf("Digite sua opcao: ");
        }
        
        private static void executarOpcao (int opcao) {            
            switch (opcao) {
		case 1:
                    adicionarPessoaFisica();
                    break;
		case 2:
                    adicionarPessoaJuridica();
                    break;
		case 3:
                    removerContato();
                    break;
		case 4:
                    listarContatos();
                    break;
		case 5:
                    break;
		}
        }

	private static void adicionarPessoaFisica() {
		
            System.out.printf("Nome: ");
            String nome = ent.nextLine();
            
            System.out.printf("Endereco: ");
            String endereco = ent.nextLine();
            
            System.out.printf("Email: ");
            String email = ent.nextLine();
            
            System.out.printf("CPF: ");
            String cpf = ent.nextLine();
            
            System.out.printf("Estado Civil: ");
            String estadoCivil = ent.nextLine();
            System.out.println("");
            
            Pessoa novoContato = new PessoaFisica(nome, endereco, email, cpf, estadoCivil);
            ag.adicionarContato(novoContato);
        }
    
	private static void adicionarPessoaJuridica() {
		
            System.out.printf("Nome: ");
            String nome = ent.nextLine();
            
            System.out.printf("Endereco: ");
            String endereco = ent.nextLine();
            
            System.out.printf("Email: ");
            String email = ent.nextLine();
            
            System.out.printf("CNPJ: ");
            String cnpj = ent.nextLine();
            
            System.out.printf("Inscricao Estadual: ");
            int inscricaoEstadual = ent.nextInt();            
            System.out.println("");
            
            Pessoa novaPessoa = new PessoaJuridica(nome, endereco, email, cnpj, inscricaoEstadual);
            ag.adicionarContato(novaPessoa);        
	}
    
	private static void removerContato() {
            System.out.printf("CPF ou CNPJ: ");
            String id = ent.nextLine();
            ag.removerContato(id);
       	}
    
	private static void listarContatos() {        
            ag.listarContatos();
        }
}