package At3;

import java.util.Scanner;

public class front {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		back e = new back();
		
		System.out.println("ESCOLHA O TIPO DO POLIGONO:");
		System.out.println("1- Quadrado");
		System.out.println("2- Triângulo");
		System.out.println("3- Retângulo");
		System.out.println("4- Círculo");
		e.setTipo(sc.nextInt());
		
		System.out.println("==================");
		
		System.out.println("ESCOLHA UMA DAS OPÇÕES:");
		System.out.println("1- Calcular área do poligono");
		System.out.println("2- Calcular Perímetro do poligono");
		e.setTipo2(sc.nextInt());
		
		System.out.println("==================");
		System.out.println("Digite o número da Base:");
		e.setLado(sc.nextDouble());
		
		System.out.println("Digite o número do Raio:");
		e.setRaio(sc.nextDouble());
		
		System.out.println("Digite o número da Altura:");
		e.setAlt(sc.nextDouble());

		System.out.println("==================");
		
		e.poligono();
		
		sc.close();
		
	}
}
