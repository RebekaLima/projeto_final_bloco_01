package ecommerce;

import java.util.Scanner;
import ecommerce.model.Ecommerce;
import ecommerce.model.EcommerceLivroCompravel;
import ecommerce.model.EcommerceLivroAlugavel;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) { //o while vai repetir o menu na tela

			System.out.println(Cores.TEXT_BLUE_BOLD  + Cores.ANSI_WHITE_BACKGROUND
					+ "************************************************************");
			System.out.println("                                                            ");
			System.out.println("                           🦉Skoob🦉                         ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println("                                                            ");
			System.out.println("         1 - Buscar livros por ID.                          ");
			System.out.println("         2 - Listar todos os livros.                        ");
			System.out.println("         3 - Cadastrar novo livro.                          ");
			System.out.println("         4 - Atualizar dados.                               ");
			System.out.println("         5 - Apagar livros.                                 ");
			System.out.println("         6 - Comprar.                                       ");
			System.out.println("         7 - Alugar.                                        ");
			System.out.println("         8 - Finalizar.                                     ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println(" 'Quem lê um livro vive mil vidas; quem não lê vive só uma.'");
			System.out.println("                  -George R. R. Martin                      ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println(Cores.TEXT_GREEN_BOLD + "Digite a opção desejada:                                    ");
			System.out.println("                                                            " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt(); // recebe o npumero da opção do menu que será executado
			
			if (opcao == 8) { //para aparecer a mensagem de finalização
				System.out.println("\n'Os livros são pequenaos pedaços do incomensurável ");
				System.out.println("                - Stephan Zweig                      ");
				System.out.println("\nVolte sempre. 👋                                   ");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
			case 1:
				System.out.println("Buscar livros por ID.\n\n");
				
				break;
			case 2:
				System.out.println("Listar todos os livros.\n\n");
				
				break;
			case 3:
				System.out.println("Cadastrar novo livro.\n\n");
				
				break;
			case 4:
				System.out.println("Atualizar dados.\n\n");
				
				break;
			case 5:
				System.out.println("Comprar.\n\n");
				
			case 6:
				System.out.println("Buscar livros por ID.\n\n");
				
				break;
			case 7:
				System.out.println("Alugar.\n\n");
				
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida. :/ " + Cores.TEXT_RESET);
				break;
			}
		}
	}




	}
