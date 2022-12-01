import java.util.Scanner;
public class Front {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Sistema s = new Sistema();
		
	int opcao = 0;
		 
		
		
		do {
			System.out.println("XYZ comercio de produtos LTDA. \nSistema de Controle de Biblioteca.");
			System.out.println("\nMenu Principal");
			System.out.println("\n1-Cadastro de Usuário");
			System.out.println("2-Cadastro de publicações");
			System.out.println("3-Movimentações");
			System.out.println("4-Relatórios");
			System.out.println("0-Finalizar");
			
			opcao = sc.nextInt();
			
			if(opcao==1) {
				int op1=0;
						
				do {
				System.out.println("XYZ comercio de produtos LTDA. \nSistema de Controle de Biblioteca.");
				System.out.println("\nMenu Principal");
				System.out.println("1- Incluir");
				System.out.println("2- Listar");
				System.out.println("3- Consultar");
				System.out.println("4- Excluir");
				System.out.println("0- Retornar");
				
				
				
				Usuario us= new Usuario();
			
			switch (op1) {
			
			
			case 1:
				
				System.out.println("Digite a Matricula: ");
				us.setMatricula(sc.nextInt());
				
				System.out.println("Digite o nome: ");
				us.setNome(sc.nextLine());
				
				s.addUsuario(us);
				
				break;

			case 2:
	
				s.listUsuario();
				
				break;

			case 3:
				System.out.println("Informe a matricula que deseja consultar.");
				int mat=sc.nextInt();
				s.listUsuario(mat);
				
				break;
   
			case 4:
				System.out.println("informe quem deseja Excluir");
				int mat=sc.nextInt();
				s.removeUsuario(mat);
				System.out.println("\nExcluído");
				break;
			
			default:
				
				break;
				
			}
				}while(op1!=5); 
			
			}else if(opcao==2) {
				System.out.println("Digite o serial do PC:");
				int serial = sc.nextInt();
				a.removePC(serial);
				
			}else if(opcao==3) {
				System.out.println("===== LISTA DE TODOS OS PC =====");
				a.list();
				System.out.println("======================");
			}else if(opcao==4) {
				clearBuffer(sc);
				System.out.println("Digite a marca do PC para listar: ");
				String marca = sc.nextLine();
				a.listMarca(marca);
				
			}else if(opcao==5) {
				System.out.println("Saindo do sistema!");
				break;
			}else {
				System.out.println("Opção inválida! Digite novamente!");
			}
			
		}while(opcao!=0);
	}

}
