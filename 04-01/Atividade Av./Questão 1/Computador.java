package Q1;

public class Computador {
	private String marca;
	private String rom;
	private int ram;
	private double vel_cpu;
	private int serial;
	
	public Computador() {
		super();
		this.marca = marca;
		this.rom = rom;
		this.ram = ram;
		this.vel_cpu = vel_cpu;
		this.serial = serial;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getVel_cpu() {
		return vel_cpu;
	}
	public void setVel_cpu(double vel_cpu) {
		this.vel_cpu = vel_cpu;
	}
	
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	
	public void exibirPC() {
		
		System.out.println("====== COMPUTADOR ======");
		System.out.println("Marca: "+ this.marca);
		System.out.println("Armazenamento: "+this.rom);
		System.out.println("Memória Ram: "+this.ram);
		System.out.println("Velocidade da CPU: "+this.vel_cpu);
		
	}
	
}
