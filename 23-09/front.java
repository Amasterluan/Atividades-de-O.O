package banco;

import java.util.Scanner;

public class front {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		conta e = new conta();
		
		System.out.print("Digite o numero da conta: ");		
		e.setNumero(sc.nextInt());
		
		System.out.print("Digite o limite: ");
		e.setLimite(sc.nextDouble());
		
		System.out.print("Digite o seu saldo: ");
		e.setSaldo(sc.nextInt());
		
		System.out.println("Digite o valor do saque: ");
		e.Saque(sc.nextDouble());
		
		System.out.println("Digite o valor do deposito: ");
		e.Deposito(sc.nextDouble());
		
		System.out.print("Digite o seu nome: ");
		e.setNome(sc.next());
		
		
		e.exibirDados();
		
		sc.close();
		
	}
}


