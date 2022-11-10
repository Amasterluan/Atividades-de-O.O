package Q2;

import java.util.Scanner;


public class Front {

	private static void clearBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		Empresa e = new Empresa();
		
		System.out.println("===== EMPRESA =====");
		
		System.out.println("Digite o CNPJ: ");
		e.setCNPJ(sc.next());
		
		System.out.println("Digite o nome da Loja: ");
		e.setNome(sc.nextLine());
		clearBuffer(sc);
		
		System.out.println("Digite o endereço da Loja: ");
		e.setEndereco(sc.nextLine());
		
		
		do {
			System.out.println("1 - Contratar Funcionario");
			System.out.println("2 - Demitir Funcionario");
			System.out.println("3 - Listar todos os Funcionarios");
			System.out.println("4 - Listar funcionarios com menos de uma salario min.");
			System.out.println("5 - SAIR");
			System.out.println("Digite sua opção: ");			
			opcao = sc.nextInt();
			
			if(opcao==1) {
				Funcionario f = new Funcionario();
				
				System.out.println("Digite a matricula: ");
				f.setMatricula(sc.nextInt());
				
				System.out.println("Digite o nome: ");
				f.setNome(sc.next());
				clearBuffer(sc);
				
				System.out.println("Digite o email: ");
				f.setEmail(sc.nextLine());
				
				System.out.println("Digite o salario: ");
				f.setSal(sc.nextDouble());
				
				e.addFunc(f);
				
			}else if(opcao==2) {
				System.out.println("Digite a matricula do funcionario: ");
				int matricula = sc.nextInt();
				e.removeFunc(matricula);
				
			}else if(opcao==3) {
				System.out.println("===== LISTA DE TODOS OS FUNCIONARIOS =====");
				e.list();
				System.out.println("======================");
			}else if(opcao==4) {
				clearBuffer(sc);
				e.listMinSal();
				
				
			}else if(opcao==5) {
				System.out.println("Saindo do sistema!");
				break;
			}else {
				System.out.println("Opção inválida! Digite novamente!");
			}
			
		}while(opcao!=5);
		
	}

}
