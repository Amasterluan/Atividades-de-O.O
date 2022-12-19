package Sistema;

import java.util.Scanner;

public class Front {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Usuario s = new Usuario();
		SistemaUsuario su = new SistemaUsuario();

		Livro l = new Livro();
		SistemaLivro sl = new SistemaLivro();

		int opPrincipal = 0;
		Emprestimo e = new Emprestimo();
		EmprestarLivro eL = new EmprestarLivro();
		do {
			// MENU PRÍNCIPAL
			System.out.println("MENU PRINCIPAL: ");
			System.out.println("\n1- Cadastro de Usuários");
			System.out.println("2- Cadatro de Publicações");
			System.out.println("3- Movimentações");
			System.out.println("0- Finalizar");
			opPrincipal = sc.nextInt();

			// CADASTROS DE USUÁRIOS SE OP==1
			if (opPrincipal == 1) {
				int opCadastroUsuario = 0;
				System.out.println("\nCADASTROS DE USUÁRIO: ");
				System.out.println("MENU: ");
				do {

					System.out.println("1-Incluir");
					System.out.println("2-Listar");
					System.out.println("3-Consultar");
					System.out.println("4-Excluir");
					System.out.println("0-Retornar");
					opCadastroUsuario = sc.nextInt();

					if (opCadastroUsuario == 1) {

						System.out.println("\nINCLUINDO... ");
						System.out.println("\nInforme o nome do novo usuário:");
						s.setNome(sc.next());
						System.out.println("\nInforme a matrícula do novo usuário:");
						s.setMatricula(sc.nextInt());
						System.out.println("Deseja realmente incluir?");
						System.out.println("1-Sim\n2-Não");
						int confirm1 = sc.nextInt();
						if (confirm1 == 1) {
							su.addUsuario(s);
						} else if (confirm1 == 2) {
							System.out.println("\nInclusão cancelada!");

						}

					}
					if (opCadastroUsuario == 2) {
						System.out.println("\nLISTANDO...");
						su.listUsuario();

					}
					if (opCadastroUsuario == 3) {
						System.out.println("\nCONSULTANDO...");
						System.out.println("\nInforme a matrícula do usuário que precisa consultar:");
						int matricula = sc.nextInt();
						su.listUsuario(matricula);
						System.out.println("Retornando ao menu de usuario...");
					}
					if (opCadastroUsuario == 4) {
						System.out.println("\nEXCLUÍNDO.");
						System.out.println("\nInforme a matrícula do usuário que deseja excluir:");
						int matricula = sc.nextInt();
						su.removeUsuario(matricula);

					}
				} while (opCadastroUsuario != 0);

			}
			// CADASTRO DE LIVROS SE OP==2
			if (opPrincipal == 2) {

				
				int opCadastroPublica = 0;

				do {
					System.out.println("\nCADASTRO DE PUBLICAÇÕES");
					System.out.println("MENU: ");
					System.out.println("1-Incluir");
					System.out.println("2-Listar");
					System.out.println("3-Consultar");
					System.out.println("4-Excluir");
					System.out.println("0-Retornar");
					opCadastroPublica = sc.nextInt();

					if (opCadastroPublica == 1) {

						System.out.println("\nINCLUÍNDO... ");
						System.out.println("\nInforme o titúlo da nova publicação:");
						l.setTitulo(sc.next());
						
						System.out.println("\nInforme a Código da nova publicação:");
						l.setCod(sc.nextInt());
						
						System.out.println("\nIforme o autor da nova publicação: ");
						l.setAutor(sc.next());
						
						System.out.println("\nDeseja realmente adicionar? ");
						System.out.println("1-Sim\n2-Não");
						int confirm2 = sc.nextInt();
						if (confirm2 == 1) {
							sl.addLivro(l);
						} else if (confirm2 == 2) {
							System.out.println("\nInclusão cancelada!");
						}

					}
					if (opCadastroPublica == 2) {
						System.out.println("\nLISTANDO...");
						sl.ListAllLivros(null);

					}
					if (opCadastroPublica == 3) {
						System.out.println("\nCONSULTANDO...");
						System.out.println("\nInforme o código da publicação que precisa consultar:");
						int codigo = sc.nextInt();
						sl.listLivroEspefico(codigo);

					}
					if (opCadastroPublica == 4) {
						System.out.println("\nEXCLUÍNDO...");
						System.out.println("\nInforme o código da publicação que deseja excluir:");
						int codigo = sc.nextInt();
						
						sl.removeLivro(codigo);

					}
				} while (opCadastroPublica != 0);
			}
			// MOVIMENTAÇÕES SE OP==3
			if (opPrincipal == 3) {
				System.out.println("MOVIMENTAÇÃO:");
				System.out.println("MENU:");
				int opMovimento = 0;
				do {
					System.out.println("1-Empréstimo");
					System.out.println("2-Devolução");
					System.out.println("0-Retornar");
					opMovimento = sc.nextInt();

					if (opMovimento == 1) {
						System.out.println("\nEMPRESTANDO...");
						System.out.println("\ninformação do livro.");
						
						System.out.println("\nCódigo:");
						int codigoLiv = sc.nextInt();
						
						System.out.println("\n\nIdentificação.");

						System.out.println("\nMatrícula:");
						int matricula = sc.nextInt();
						
						//System.out.println("\nPeríodo.");
						//String periodo = sc.next();
						
						System.out.println("Deseja realmente emprestar?\n1-Sim\n2-Não");
						int confirmaçãoEnprestimo = 0;
						
						if (confirmaçãoEnprestimo == 1) {
							eL.AddEmprestimo(e);
						} else if (confirmaçãoEnprestimo == 2) {
							System.out.println("\n Emprestimo cancelado!");
						} else {
							System.out.println("\nError");
						}

					}
					if (opMovimento == 2) {
						System.out.println("DEVOLVENDO...");
						System.out.println("\ninformação do livro.");
						System.out.println("\nCódigo:");
						int codigoLiv = sc.nextInt();

						System.out.println("\n\nIdentificação.");

						System.out.println("\nMatrícula:");
						int matricula = sc.nextInt();

						//System.out.println("\nPeríodo.");
						//String periodo = sc.next();

						System.out.println("Deseja realmente devolver?\n1-Sim\n2-Não");
						int confirmaçãodevolucao = 0;

						if (confirmaçãodevolucao == 1) {
							eL.RemoveEmprestimo(codigoLiv);
						} else if (confirmaçãodevolucao == 2) {
							System.out.println("\n Emprestimo cancelado!");
						} else {
							System.out.println("\nError");
						}
					}
				} while (opMovimento != 0);
			}
		} while (opPrincipal != 0);

		sc.close();
	}

}
