public class Cliente {
	private String nome;
	private int cpf;
	
	public Cliente(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void exibir() {
		System.out.println(" + + + + + + + + ");
		System.out.println("Nome = " + this.nome);
		System.out.println("CPF = " + this.cpf);
		System.out.println(" + + + + + + + + ");
		
	}
	
	

}
