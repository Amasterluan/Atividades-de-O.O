package Q2;

public class Funcionario {

	private int matricula;
	private String nome;
	private String email;
	private double sal;
	
	public Funcionario() {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.sal = sal;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void exibirFun(){
		
		System.out.println("======= FUNCIONARIOS ========");
		System.out.println("Matricula: "+this.matricula);
		System.out.println("Nome: "+this.nome);
		System.out.println("Email: "+this.email);
		System.out.println("Salário: "+this.sal);
	}
	
}
