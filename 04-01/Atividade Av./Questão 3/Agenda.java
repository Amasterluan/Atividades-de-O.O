package Q3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private int codigo;
	private String nom_medico;
	private int ano;
	private int mes;
	private int dia;
	private int hora;
	private int min;

	public Agenda() {
		super();
		this.codigo = codigo;
		this.nom_medico = nom_medico;
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
		this.min = min;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNom_medico() {
		return nom_medico;
	}

	public void setNom_medico(String nom_medico) {
		this.nom_medico = nom_medico;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	
	
	public void exibirConsul() {

		LocalDate data = LocalDate.of(this.getAno(), this.getMes(), this.getDia());
		LocalTime horario = LocalTime.of(this.getHora(), this.getMin());
		
		System.out.println("====== CONSULTA ======");
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Médico (a): " + this.nom_medico);
		System.out.println("Data da Consulta: " + data);
		System.out.println("Horario da Consulta: " + horario);
	}

}
