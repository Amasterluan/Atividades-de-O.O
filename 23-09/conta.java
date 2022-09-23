package banco;

public class conta {

	private int numero;
	private String nome;
	private double saldo;
	private double limite;
	
	
//	public conta(int numero, String nome) {
//		this.numero = numero;
//		this.nome = nome;
//	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double Saque(double saque){
		
		if (saque < this.saldo){
			this.saldo = this.saldo - saque;
			System.out.println("Saque realizado com sucesso!");
		}else{
			System.out.println("Saldo indisponivel!");
		}
		
		return saque;
	}
	
	public double Deposito(double deposito){
		
		this.saldo = this.saldo + deposito;
		
		System.out.println("Deposito realizado com sucesso!");
		return deposito;
	}
	
	
	 public void exibirDados() {
		System.out.println("======= DADOS DA PESSOA =======");
	 	System.out.println("NOME            : "+ this.nome);
	 	System.out.println("NÚMERO          : "+ this.numero);
	 	System.out.println("LIMITE          : "+ this.limite);
	 	System.out.println("SALDO           : "+ this.saldo);
	 }

	
	
}
