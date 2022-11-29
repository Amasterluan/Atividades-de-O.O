import java.util.ArrayList;

public class Sistema {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Livro> livros;
	
	public Sistema() {
		
		this.usuarios = new ArrayList<Usuario>();
		this.livros = new ArrayList<Livro>();
		
	}
	
	public void addLivro(Livro livros) {
		this.livros.add(livros);
		System.out.println("Livro adicionado!");		
	}
	
	public void addUsuario(Usuario usuarios) {
		this.usuarios.add(usuarios);
		System.out.println("Usuario adicionado!");		
	}
	
	public void removeLivro(int codigo) {
		for (int i =0; i < livros.size(); i++) {
			if(livros.get(i).getCod()==codigo) {
				this.livros.remove(i);
			}
		}	
	}
	
	public void removeUsuario(int matricula) {
		for (int i =0; i < usuarios.size(); i++) {
			if(usuarios.get(i).getMatricula()==matricula) {
				this.usuarios.remove(i);
			}
		}	
	}
	
	//Falta listar em ordem alfabetica e a quantidade de exemplares
	
	public void listLivro() {
		for(Livro livro : livros) {
			livro.exibirLivro();
		}
	}
	
	public void listUsuario() {
		for(Usuario usuario : usuarios) {
			usuario.exibirUsuario();
		}
	}
	
	public void listLivro(int codigo) {
		for (int i = 0; i < livros.size(); i++) {
			if(livros.get(i).getCod()== codigo) {
				livros.get(i).exibirLivro();
			}
		}
	}
	
	public void listUsuario(int matricula) {
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).getMatricula()== matricula) {
				usuarios.get(i).exibirUsuario();
			}
		}
	}
	
}
