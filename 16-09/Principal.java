package Front;

import java.util.Scanner;

import Inform.Funcionario;

public class Principal {
	public static void main(String[] args) {
		Funcionario e = new Funcionario();
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a matricula: ");		
		e.setMatricula(sc.nextInt());
		
		System.out.print("Digite o salário bruto: ");
		e.setSal_brut(sc.nextDouble());
		
		System.out.print("Digite o Nº de Dependente: ");
		e.setNum_dependente(sc.nextInt());
		
		System.out.print("Digite o nome do Funcionario: ");
		e.setNome(sc.next());

		e.exibirDados();
		
		sc.close();
		
		}

}
