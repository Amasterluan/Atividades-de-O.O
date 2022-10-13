package At3;

public class back {
	
	private int tipo;
	private double alt;
	private double lado;
	private double raio;
	private int tipo2;
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getAlt() {
		return alt;
	}


	public void setAlt(double alt) {
		this.alt = alt;
	}


	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	public int getTipo2() {
		return tipo2;
	}

	public void setTipo2(int tipo2) {
		this.tipo2 = tipo2;
	}

	
	
	public int TipoCal() {
		int tipocal = 0; 
		
		tipocal = this.getTipo2();
		return tipocal;
	}

	public double poligono() { 
		int poligono = 0;
		poligono = this.getTipo();
		

		
		if (poligono == 1) {
			if(this.TipoCal() == 1) {
				double area = 0;
				
				area = (lado*lado);
				
				System.out.println("O valor do área é "+ area);
				
			} else if(this.TipoCal() == 2) {
				double peri = 0;
				
				peri = 4*(lado);
				
				System.out.println("O valor do perimetro é "+ peri);
			
			}else {
				System.out.println("Opção Inválida!");
			}
			
		} else if (poligono == 2) {
			if(this.TipoCal() == 1) {
				double area = 0;
				
				area = ((lado*alt)/2);
				
				System.out.println("O valor do área é "+ area);
				
			} else if(this.TipoCal() == 2) {
				double peri = 0;
				
				peri = 3*(lado);
				
				System.out.println("O valor do perimetro é "+ peri);
			
			}else {
				System.out.println("Opção Inválida!");
			}
			
		}else if (poligono == 3) {
			if(this.TipoCal() == 1) {
				double area = 0;
				
				area = lado*alt;
				
				System.out.println("O valor do área é "+ area);
				
			} else if(this.TipoCal() == 2) {
				double peri = 0;
				
				peri = 2*(lado+alt);
				
				System.out.println("O valor do perimetro é "+ peri);
			}else {
				System.out.println("Opção Inválida!");
			}
			
		}else if (poligono == 4) {
			if(this.TipoCal() == 1) {
				double area = 0;
				double pi = 3.14;
				
				
				area = pi*(raio*raio);
				
				System.out.println("O valor do área é "+ area);				
				
			} else if(this.TipoCal() == 2) {
				double peri = 0;
				double pi = 3.14;
				
				peri = (pi*2)*raio;
				
				System.out.println("O valor do perimetro é "+ peri);
			}else {
				System.out.println("Opção Inválida!");
			}
			
		}else {
			System.out.println("Opção Inválida!");
		}		
		
		return poligono;
	}
		
	
}
