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
		int opcao;
		
		Sistema s = new Sistema();
		Agenda a = new Agenda();
		
		System.out.println("Olá, seja bem vindo (a) ao Sistema da Viver Bem Unicorns!");
		System.out.println(" ");
		do {
			System.out.println("===== ESCOLHA UMA OPÇÃO =====");
			System.out.println(" ");
			System.out.println("1 - Adicionar Consulta");
			System.out.println("2 - Remover Consulta");
			System.out.println("3 - Listar todas as Consultas");
			System.out.println("4 - Listar Consultas de Determinadas Data");
			System.out.println("5 - SAIR");
			System.out.println(" ");
			System.out.println("Digite sua opção: ");			
			opcao = sc.nextInt();
			
			if(opcao==1) {
				
				System.out.println("Digite o codigo da Consulta: ");
				a.setCodigo(sc.nextInt());
				
				System.out.println("Digite o nome do Médico (a): ");
				a.setNom_medico(sc.nextLine());
				clearBuffer(sc);
				
				System.out.println("===== Data da Consulta ===== ");
				System.out.println("Dia: ");
				a.setDia(sc.nextInt());
				System.out.println("Mês: ");
				a.setMes(sc.nextInt());
				System.out.println("Ano: ");
				a.setAno(sc.nextInt());
				
				System.out.println("===== Horário da Consulta ===== ");
				System.out.println("Hora: ");
				a.setHora(sc.nextInt());
				System.out.println("Minuto: ");
				a.setMin(sc.nextInt());
				
				s.addConsul(a);
				
			}else if(opcao==2) {
				System.out.println("Digite o codigo da Consulta:");
				int codigo = sc.nextInt();
				s.removeConsul(codigo);
				
			}else if(opcao==3) {
				System.out.println("===== LISTA DE TODAS AS CONSULTAS =====");
				s.list();
				System.out.println("======================");
			}else if(opcao==4) {
				clearBuffer(sc);
				System.out.println("Digite a data da Consulta: ");
				String data = sc.nextLine();

				
			}else if(opcao==5) {
				System.out.println("Saindo do sistema!");
				break;
			}else {
				System.out.println("Opção inválida! Digite novamente!");
			}
			
			
		} while (opcao!=5);
		
		

	}

}
