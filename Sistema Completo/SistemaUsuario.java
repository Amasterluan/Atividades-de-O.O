package Sistema;
import java.util.ArrayList;

public class SistemaUsuario {

	private ArrayList<Usuario> usuarios;
	
	public SistemaUsuario() {
		
		this.usuarios = new ArrayList<Usuario>();
		
	}
	
	public void addUsuario(Usuario usuarios) {
		this.usuarios.add(usuarios);
		System.out.println("Usuario adicionado!");		
	}
	
	public void removeUsuario(int matricula) {
		for (int i =0; i < usuarios.size(); i++) {
			if(usuarios.get(i).getMatricula()==matricula) {
				this.usuarios.remove(i);
			}
		}	
	}
	
	public void listUsuario() {
		for(Usuario usuario : usuarios) {
			usuario.exibirUsuario();
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
