package Sistema;

public class Emprestimo {
	private int codigo_emprestimo;
	private Usuario usuarios;
	private Livro livros;
	
	public int getCodigo_emprestimo() {
		return codigo_emprestimo;
	}

	public void setCodigo_emprestimo(int codigo_emprestimo) {
		this.codigo_emprestimo = codigo_emprestimo;
	}

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public Livro getLivros() {
		return livros;
	}

	public void setLivros(Livro livros) {
		this.livros = livros;
	}

	public void exibirDadosEmprestimo() {
		this.usuarios.exibirUsuario();
		this.livros.exibirLivro();
	}

}
