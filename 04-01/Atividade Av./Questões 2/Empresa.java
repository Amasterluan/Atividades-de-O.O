package Q2;

import java.util.ArrayList;

public class Empresa {

	private String nome;
	private String CNPJ;
	private String endereco;
	private ArrayList<Funcionario> funcionarios;
	
	public Empresa(){
		this.funcionarios = new ArrayList<Funcionario>();		
	}
	
	public void addFunc(Funcionario funcionarios) {
		this.funcionarios.add(funcionarios);
		System.out.println("Funcionario adicionado!");
	}
	
	public void removeFunc(int matricula) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getMatricula()==matricula) {
				this.funcionarios.remove(i);
			}
		}
	}
	
	public void list() {
		for (Funcionario funcionarios : funcionarios) {
			funcionarios.exibirFun();
		}
	}
	
	public void listMinSal() {
		for (int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getSal()<1200) {
				funcionarios.get(i).exibirFun();
			}
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
}
