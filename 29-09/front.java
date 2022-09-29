package banco;

import java.util.Scanner;

public class front {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		conta e = new conta();
		conta a = new conta(002, "A", 10000, 5000);
		
		System.out.print("Digite o numero da conta: ");		
		e.setNumero(sc.nextInt());
		
		//System.out.print("Digite o limite: ");
		System.out.println("Seu limite é de 50,000!");
		e.setLimite(50000);
		
		//System.out.print("Digite o seu saldo: ");
		System.out.println("Seu saldo é de 10.000: ");
		e.setSaldo(10000);
		
		System.out.println("Você deseja fazer saque?");
		System.out.println("Digite S para Sim e N para não!");
		String escolhaSaq = sc.next();
		
		if (escolhaSaq.equals("S")) {
			System.out.println("Digite o valor do saque: ");
			e.Saque(sc.nextDouble());
		}
		
		//System.out.println("Digite o valor do deposito: ");
		
		System.out.println("Você deseja fazer Deposito?");
		System.out.println("Digite S para Sim e N para não!");
		String escolhaDep = sc.next();
		
		if (escolhaDep.equals("S")) {
			System.out.println("Digite o valor do deposito: ");
			e.Deposito(sc.nextDouble());
		}
		
		System.out.println("Você quer fazer um Pix?");
		System.out.println("Digite S para Sim e N para não!");
		String escolhaPix = sc.next();
		
		if (escolhaPix.equals("S")) {
			System.out.println("Digite o valor do Pix: ");
			double pixvalor = sc.nextDouble();
			e.pix(pixvalor, a);
			
			System.out.println("O valor transferido foi de R$" + pixvalor);
		}
		
		
		System.out.print("Digite o seu nome: ");
		e.setNome(sc.next());
		
		
		e.exibirDados();
		System.out.println("=================");
		a.exibirDados();
		
		sc.close();
		
	}
}
