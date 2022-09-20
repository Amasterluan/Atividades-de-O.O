package Inform;

public class Funcionario {

	private int matricula;
	private String nome;
	private double sal_brut;
	private int num_dependente;
	private double aux_dependente;
	private double IRPF;
	private double INSS;
	
	
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


	

	public double getSal_brut() {
		return sal_brut;
	}

	public void setSal_brut(double sal_brut) {
		this.sal_brut = sal_brut;
	}


	

	public int getNum_dependente() {
		return num_dependente;
	}

	public void setNum_dependente(int num_dependente) {
		this.num_dependente = num_dependente;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", sal_brut=" + sal_brut + ", num_dependente="
				+ num_dependente + "]";
	}

	

	
	public void setauxDependente(double aux_dependente){
		this.aux_dependente = aux_dependente;
		
		if (this.sal_brut < 2000 ){
			aux_dependente = 75;
		}else{
			aux_dependente = 93.50;			
		}

	}
	
	public void setIRPF(double IRFP){
		this.IRPF = IRPF;
		
		if (this.sal_brut <= 1200 ){
			IRPF = 0;
		}else if (this.sal_brut > 1201 ){
			IRPF = 7.5;		
		}else if (this.sal_brut > 2801 ){
			IRPF = 11;		
		}else if (this.sal_brut > 5501 ){
			IRPF = 17.5;			
		}
		

	}
	
	/*
	public void exibirDados() {
		System.out.println("======= DADOS DO FUNCIONARIO =======");
		System.out.println("MATRICULA      : "+ this.matricula);
		System.out.println("NOME           : "+ this.nome);
		System.out.println("SALARIO BRUTO  : "+ this.sal_brut);
		System.out.println("SALARIO LIQUIDO: "+ this);
		System.out.println("Nº DEPENDENTE  : "+ this.num_dependente);
		
	}
*/
}
