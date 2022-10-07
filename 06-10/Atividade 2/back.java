package Pack;

public class back {
	private String cpf;
	private int dia_nasc;
	private int ano_nasc;
	private double altura;
	private double peso;
	private String nome;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDia_nasc() {
		return dia_nasc;
	}

	public void setDia_nasc(int dia_nasc) {
		this.dia_nasc = dia_nasc;
	}

	public int getAno_nasc() {
		return ano_nasc;
	}

	public void setAno_nasc(int ano_nasc) {
		this.ano_nasc = ano_nasc;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int Idade() {
		int idade = 0;
		idade = (2022 - this.ano_nasc);
		return idade;
	}

	public void IMC() {
		double imc = 0;
		imc = peso / (altura * altura);
		if (imc <= 18.5) {
			System.out.println("IMC: Sua Classificação é de Magreza - " + imc);
		} else if (imc > 18.5 && imc <= 24.9){
			System.out.println("IMC: Sua Classificação Está Dentro do Normal - " + imc);
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("IMC: Sua Classificação é de Sobrepeso I - " + imc);
		} else if (imc >= 30.0 && imc <= 39.9) {
			System.out.println("IMC: Sua Classificação é Obesidade II - " + imc);
		} else if (imc >= 40.0) {
			System.out.println("IMC: Sua Classificação é Obesidade Grave III - " + imc);
		}
	}

	public String NomeAo() {
		char [] nomeaoc = new char [nome.length()];

		for (int i = nome.length() - 1, j=0; i >= 0; i--, j++){
			nomeaoc[j] =  nome.charAt(i);
		}
		
		String naoc = String.valueOf(nomeaoc);
		return naoc;
	
	}
	
	
	public int NumSorte() {
		String sorte = nome;
		String[] Vetor = sorte.split(" ");
		int cont = 0;
		int sort2 = 0;
		for (int i = 0; i < Vetor.length; i++) {
			cont = cont + Vetor.length;
		}
		sort2 = cont / 10 + cont % 10;
		return sort2;
	}

	public void exibirDados() {
		System.out.println("======= DADOS DA PESSOA =======");
		System.out.println("NOME : " + this.nome);
		System.out.println("CPF : " + this.cpf);
		System.out.println("IDADE : " + this.Idade());
		System.out.println("ALTURA : " + this.altura);
		System.out.println("PESO : " + this.peso);
		IMC();
		System.out.println("NOME AO CONTRARIO : " + this.NomeAo());
		System.out.println("NÚMERO DA SORTE : " + this.NumSorte());
	}
}
