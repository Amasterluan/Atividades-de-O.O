import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c = new Conta();
		int opcao;
		
		do {
			System.out.println("1 - adicionar cliente");
			System.out.println("2 - remover cliente");
			System.out.println("3 - listar todos os clientes");
			System.out.println("4 - SAIR");
			System.out.println("Digite sua opção: ");			
			opcao = sc.nextInt();
			
			if(opcao==1) {
				System.out.println("Digite o nome do cliente");
				String nome = sc.next();
				
				System.out.println("Digite o cpf do cliente");
				int cpf = sc.nextInt();
				
				Cliente cli = new Cliente(nome, cpf);
				c.adicionarCliente(cli);
				
			}else if(opcao==2) {
				System.out.println("Digite o CPF do cliente:");
				int cpf = sc.nextInt();
				c.removerCliente(cpf);
			}else if(opcao==3) {
				System.out.println("LISTA DE CLIENTES INSCRITOS");
				c.listar();
				System.out.println("--------------");
			}else if(opcao==4) {
				System.out.println("Saindo do sistema!");
				break;
			}else {
				System.out.println("Opção inválida! Digite novamente!");
			}
			
		}while(opcao!=4);
		
		

	}

}
