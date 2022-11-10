package Q1;

import java.util.ArrayList;

public class Loja {

	private String CNPJ;
	private String nome;
	private Proprietario proprietario;
	private int telefone;
	private ArrayList<Computador> computadores;
	
	public Loja() {
		this.computadores = new ArrayList<Computador>();		
	}
	
	
	public void addPC(Computador computadores) {
		this.computadores.add(computadores);
		System.out.println("Computador adicionado!");
	}
	
	public void removePC(int serial) {
		for (int i = 0; i < computadores.size(); i++) {
			if(computadores.get(i).getSerial()==serial) {
				this.computadores.remove(i);
			}
		}
	}
	
	public void list() {
		for (Computador computador : computadores) {
			computador.exibirPC();
		}
	}
	
	public void listMarca(String marca) {
		for (int i = 0; i < computadores.size(); i++) {
			if(computadores.get(i).getMarca().equals(marca)) {
				computadores.get(i).exibirPC();
			}
		}
	}
	
	
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	
	
	
}
