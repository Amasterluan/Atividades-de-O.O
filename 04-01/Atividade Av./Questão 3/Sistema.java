package Q3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {

	private ArrayList<Agenda> agendas;
	
	public Sistema() {
		this.agendas = new ArrayList<Agenda>();
	}
	
	public void addConsul(Agenda agendas) {
		this.agendas.add(agendas);
		System.out.println("Consulta adicionada!");		
	}
	
	public void removeConsul(int codigo) {
		for (int i =0; i < agendas.size(); i++) {
			if(agendas.get(i).getCodigo()==codigo) {
				this.agendas.remove(i);
			}
		}	
	}
	
	public void list() {
		for(Agenda agenda : agendas) {
			agenda.exibirConsul();
		}
	}
	
	
	
	public void listData(int dia, int mes, int ano) {
		for (int i = 0; i < agendas.size(); i++) {
			if(agendas.get(i).equals(LocalDate.of(ano, dia, mes))) {
				agendas.get(i).exibirConsul();
			}
		}
	}
	
	
}
