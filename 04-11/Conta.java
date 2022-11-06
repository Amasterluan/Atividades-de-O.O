import java.util.ArrayList;

public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private ArrayList<Cliente> clientes; //Coleção - Clara, Livia, ryan
	
	public Conta() {
		//Ao criar objeto, precisa instanciar a coleção!! 
		this.clientes = new ArrayList<Cliente>();
	}
	
	
	public void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		System.out.println("Cliente adicionado!");
	}
	
	public void listar() {
		for (Cliente cliente : this.clientes) {
			cliente.exibir();
		}
	}
	
	public void removerCliente(int cpf) {
		//porque foreach nao remove
		for (int i = 0; i < this.clientes.size(); i++) {
			if(clientes.get(i).getCpf()==cpf) {
				this.clientes.remove(i);
			}
		}
	}
	
	
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
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
}
