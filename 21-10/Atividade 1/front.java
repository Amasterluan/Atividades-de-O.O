package ativ1;

import java.util.Scanner;

public class front {
	private static void clearBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		tarefa t = new tarefa();
		itemtarf i = new itemtarf();
		
		
			System.out.println("Digite o nome da  tarefa: ");
			t.setTitulotaf(sc.nextLine());
			
			System.out.println("Digite o status da tarefa: ");
			t.setStatus(sc.nextLine());
			
			System.out.println("Digite a data limte da tarefa: ");
			t.setDatalimit(sc.nextLine());
			
			System.out.println("Digite o porcentual da tarefa: ");
			t.setPorc(sc.nextDouble());
			clearBuffer(sc);
			
			System.out.println("Digite a descrição do item: ");
			i.setDescrição(sc.nextLine());
			
			System.out.println("Digite a data de execução: ");
			i.setDataexc(sc.nextLine());
			
			t.setItemtarf(i);
			
			t.exibirDados();
			
			
			sc.close();
			
	}

}
