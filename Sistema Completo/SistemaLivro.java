package Sistema;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaLivro {

	private ArrayList<Usuario> usuarios;
	private List<Livro> livros;
	
	public SistemaLivro() {
		
		this.livros = new List<Livro>();
		
	}
	
	public void addLivro(Livro livros) {
		this.livros.add(livros);
		System.out.println("Livro adicionado!");		
	}
	
	
	public void removeLivro(int codigo) {
		for (int i =0; i < livros.size(); i++) {
			if(livros.get(i).getCod()==codigo) {
				this.livros.remove(i);
			}
		}	
	}
	
	
	//Falta listar em ordem alfabetica e a quantidade de exemplares
	
	public void listLivro() {
		ArrayList<Livro> emp = Collections.sort(livros , Livro.getComparatorLivroCresc());
		
		for(Livro livro : emp) {
			livro.exibirLivro();
		}
	}
	
	
	public void listLivro(int codigo) {
		for (int i = 0; i < livros.size(); i++) {
			if(livros.get(i).getCod()== codigo) {
				livros.get(i).exibirLivro();
			}
		}
	}
	

	
}
