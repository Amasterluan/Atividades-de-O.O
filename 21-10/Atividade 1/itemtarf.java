package ativ1;

public class itemtarf {

	private String descrição;
	private String dataexc;
	
	
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public String getDataexc() {
		return dataexc;
	}
	public void setDataexc(String dataexc) {
		this.dataexc = dataexc;
	}
	
	public void exibirDados2(){
		
		System.out.println("Descrição do item: " + this.getDescrição());
		System.out.println("Data de execução: "+ this.getDataexc());		
		
	}
	
}
