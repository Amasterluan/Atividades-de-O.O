package ativ1;

public class tarefa {

	private String status;
	private String titulotaf;
	private String datalimit;
	private double porc;
	private itemtarf Itemtarf;
	
		
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitulotaf() {
		return titulotaf;
	}
	public void setTitulotaf(String titulotaf) {
		this.titulotaf = titulotaf;
	}
	public String getDatalimit() {
		return datalimit;
	}
	public void setDatalimit(String datalimit) {
		this.datalimit = datalimit;
	}
	public double getPorc() {
		return porc;
	}
	public void setPorc(double porc) {
		this.porc = porc;
	}
	public itemtarf getItemtarf() {
		return Itemtarf;
	}
	public void setItemtarf(itemtarf itemtarf) {
		Itemtarf = itemtarf;
	}
	
	
	public void exibirDados(){
		
		System.out.println("==========TAREFAS==========");
		System.out.println("Nome da Tarefa: "+ this.getTitulotaf());
		System.out.println("Data limite: "+this.getDatalimit());
		System.out.println("Porcentual concluido:" +this.getPorc()+ "%");
		System.out.println("Prioridade da Tarefa: "+this.getStatus());
		this.Itemtarf.exibirDados2();
		
		
	}
	
	
}
