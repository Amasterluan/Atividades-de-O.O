package Media;

import java.util.Scanner;

public class front {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		back e = new back();
		
		System.out.print("Digite a Matricula: ");		
		e.setMatricula(sc.nextDouble());
		
		System.out.println("Digite a nota 1: ");
		e.setN1(sc.nextDouble());
		
		System.out.println("Digite a nota 2: ");
		e.setN2(sc.nextDouble());

		System.out.println("Digite a nota do Trabalho: ");
		e.setN3(sc.nextDouble());
		
		System.out.print("Digite o nome: ");		
		e.setNome(sc.next());
		
		
		System.out.println("=================");
		e.exibirDados();
		
		sc.close();
		
	}
}
