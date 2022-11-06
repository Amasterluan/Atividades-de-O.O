package Q1;

public class Proprietario {

	private String CPF;
	private String nome;
	private String sobrenome;
	private Endereço endereco;
	
	public Proprietario() {
		super();
		CPF = CPF;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
	}
	
	Endereço e = new Endereço();
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Endereço getEndereço() {
		return endereco;
	}
	public void setEndereço(Endereço endereco) {
		this.endereco = endereco;
	}
	
	public void exibirProp() {
		
		System.out.println("====== PROPRIETÁRIO ======");
		System.out.println("Nome: ");
		System.out.println("Sobrenome: ");
		System.out.println("CPF: ");
		e.exibirEnd();
		
	}
	
	
}
