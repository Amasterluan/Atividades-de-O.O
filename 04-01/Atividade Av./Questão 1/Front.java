package Q1;

import java.util.Scanner;

public class Front {

	private static void clearBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
		}
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		Loja a = new Loja();
		Proprietario prip = new Proprietario();
		Endereço cep = new Endereço();
		
		System.out.println("===== EMPRESA =====");
		
		System.out.println("Digite o CNPJ: ");
		a.setCNPJ(sc.next());
		
		System.out.println("Digite o nome da Loja: ");
		a.setNome(sc.nextLine());
		clearBuffer(sc);
		
		System.out.println("===== DADOS PESSOAIS =====");
		
		System.out.println("Digite o CPF: ");
		prip.setCPF(sc.next());
		
		System.out.println("Digite seu nome: ");
		prip.setNome(sc.next());
		
		System.out.println("Digite seu sobrenome: ");
		prip.setSobrenome(sc.nextLine());
		clearBuffer(sc);
		
		System.out.println("===== ENDEREÇO ======");
		System.out.println("Nome da rua: ");
		cep.setNome_rua(sc.nextLine());
		
		System.out.println("Nº da casa: ");
		cep.setNum(sc.nextInt());
		clearBuffer(sc);
		
		System.out.println("Cidade: ");
		cep.setCidade(sc.nextLine());
		
		System.out.println("==== PC ====");
		
		do {
			System.out.println("1 - Adicionar PC");
			System.out.println("2 - Remover PC");
			System.out.println("3 - Listar todos os PC");
			System.out.println("4 - Listar uma marca de PC");
			System.out.println("5 - SAIR");
			System.out.println("Digite sua opção: ");			
			opcao = sc.nextInt();
			
			if(opcao==1) {
				Computador pc = new Computador();
				
				System.out.println("Digite a marca: ");
				pc.setMarca(sc.next());
				
				System.out.println("Quantidade de armazenamento: ");
				pc.setRom(sc.next());
				
				System.out.println("Quantidade de Ram: ");
				pc.setRam(sc.nextInt());
				
				System.out.println("Velocidade do processador: ");
				pc.setVel_cpu(sc.nextDouble());
				
				System.out.println("Serial do PC: ");
				pc.setSerial(sc.nextInt());
				
				a.addPC(pc);
				
			}else if(opcao==2) {
				System.out.println("Digite o serial do PC:");
				int serial = sc.nextInt();
				a.removePC(serial);
				
			}else if(opcao==3) {
				System.out.println("===== LISTA DE TODOS OS PC =====");
				a.list();
				System.out.println("======================");
			}else if(opcao==4) {
				clearBuffer(sc);
				System.out.println("Digite a marca do PC para listar: ");
				String marca = sc.nextLine();
				a.listMarca(marca);
				
			}else if(opcao==5) {
				System.out.println("Saindo do sistema!");
				break;
			}else {
				System.out.println("Opção inválida! Digite novamente!");
			}
			
		}while(opcao!=5);
		
	}

}
