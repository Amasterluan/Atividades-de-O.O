package At2;

import java.util.Scanner;

public class front {
    
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		back e = new back();
		
				
		System.out.println("Digite o dia de seu nascimento: ");
		e.setDia_nasc(sc.nextInt());
		
		System.out.println("Digite o ano de seu nascimento: ");
		e.setAno_nasc(sc.nextInt());

		System.out.println("Digite a sua altura: ");
		e.setAltura(sc.nextDouble());
		
		System.out.println("Digite o seu peso: ");
		e.setPeso(sc.nextDouble());
		
		System.out.print("Digite o CPF: ");		
		e.setCpf(sc.next());
		clearBuffer(sc);
		
		System.out.print("Digite o nome: ");		
		e.setNome(sc.nextLine());
		
		
		System.out.println("=================");
		
		e.exibirDados();
		
		sc.close();
		
	}
}
