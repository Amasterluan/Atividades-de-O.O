package Q1;

public class Endereço {
	private String nome_rua;
	private int num;
	private String cidade;
	
	public Endereço() {
		super();
		this.nome_rua = nome_rua;
		this.num = num;
		this.cidade = cidade;
	}
		
	public String getNome_rua() {
		return nome_rua;
	}
	public void setNome_rua(String nome_rua) {
		this.nome_rua = nome_rua;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void exibirEnd() {
		
		System.out.println("====== ENDEREÇO ======");
		System.out.println("Nome da Rua: " + this.nome_rua);
		System.out.println("Nº da casa: "+this.num);
		System.out.println("Cidade: "+this.cidade);
		
		
	}
	
}
