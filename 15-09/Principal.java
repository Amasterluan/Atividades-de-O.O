package front;
import java.util.Scanner;
import cadastros.Aluno;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		Aluno nome = new Aluno();
		
		System.out.print("Digite o seu nome: ");
		nome.nome = sc.nextLine();
		
		System.out.print("Digite a matricula: ");
		nome.matricula = sc.nextInt();
		
		System.out.print("Digite o seu CPF: ");
		nome.cpf = sc.next();
		
		nome.exibirDados();
		
		sc.close();
	}
}
