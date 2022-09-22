package Inform;

public class Funcionario {

	private int matricula;
	private String nome;
	private double sal_brut;
	private int num_dependente;

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		if (matricula <=0) {
			System.out.println("Erro na Matricula, digite um valor positivo!");
		this.matricula = 00;
		}else{
		this.matricula = matricula;
		}
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


	
	public double CalculoauxDependente() {
		double aux_dependente = 0;

		if (this.sal_brut <= 2000) {
			aux_dependente = this.num_dependente * 75;
		} else {
			aux_dependente = this.num_dependente * 93.50;
		}
		
		return aux_dependente;

	}
	

	public double CalculoIRPF() {
		double IRPF = 0;
		
		if (this.sal_brut > 1201) {
			IRPF = (7.5/100)* this.getSal_brut();
		} else if (this.sal_brut > 2801) {
			IRPF = (11/100)* this.getSal_brut();
		} else if (this.sal_brut > 5501) {
			IRPF = (17.5/100)* this.getSal_brut();
		}
		
	return IRPF;	
// 
	}
	
	public double CalcularINSS () {
		double INSS = 0;
		
		if (this.sal_brut > 1200) {
			INSS = (8/100)*this.getSal_brut();
		} 
		
		return INSS;
	}
	
	public double SalarioLiquido() {
		double sal_liquido = 0;
		
		sal_liquido = this.getSal_brut() + this.CalculoauxDependente() - this.CalculoIRPF() - this.CalcularINSS(); 
		
		return sal_liquido;
	}


	 public void exibirDados() {
		System.out.println("======= DADOS DO FUNCIONARIO =======");
	 	System.out.println("MATRICULA      : "+ this.matricula);
	 	System.out.println("NOME           : "+ this.nome);
	 	System.out.println("SALARIO BRUTO  : "+ this.sal_brut);
	 	System.out.println("Nº DEPENDENTE  : "+ this.num_dependente);
	 	System.out.println("AUX. DEPENDENTE: "+ this.CalculoauxDependente());
	 	System.out.println("IRPF           : "+ this.CalculoIRPF());
	 	System.out.println("INSS           : "+ this.CalcularINSS());
	 	System.out.println("SALARIO LIQUIDO: "+ this.SalarioLiquido());
	 	
	 	
	 }

}
