package Media;

public class back {

	private double matricula;
	private double n1;
	private double n2;
	private double n3;
	private String nome;
	
	
	 public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}


	public double getN2() {
		return n2;
	}


	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public double Media() {
		double media = 0;
		
		media = ((n1*2.5)+(n2*2.5)+(n3*2)/7);
		
		return media;
	}
	
	public void exibirDados() {
		System.out.println("======= DADOS DO DISCENTE =======");
	 	System.out.println("NOME            : "+ this.nome);
	 	System.out.println("MATRICULA       : "+ this.matricula);
	 	System.out.println("MÉDIA DA NOTA   : "+ this.Media());
	 }
	
}
