package ecommerce;

import java.util.Scanner;

import loja.util.Cores;

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
			System.out.println("         1 - Listar os livros disponíveis.                  ");
			System.out.println("         2 - Cadastrar novo livro.                          ");
			System.out.println("         3 - Atualizar dados.                               ");
			System.out.println("         4 - Apagar livros.                                 ");
			System.out.println("         5 - Busca por autor.                               ");
			System.out.println("         6 - Finalizar.                                     ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println(" 'Quem lê um livro vive mil vidas; quem não lê vive só uma.'");
			System.out.println("                  -George R. R. Martin                      ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println(Cores.TEXT_GREEN_BOLD + "Digite a opção desejada:                                    ");
			System.out.println("                                                            " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt(); // recebe o npumero da opção do menu que será executado
			
			if (opcao == 6) { //para aparecer a mensagem de finalização
				System.out.println("\n'Os livros são pequenaos pedaçoes do incomensurável");
				System.out.println("                - Stephan Zweig                      ");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
			case 1:
				System.out.println("Listar os livros disponíveis\n\n");
				
				break;
			case 2:
				System.out.println("Cadastrar novo livro.\n\n");
				
				break;
			case 3:
				System.out.println("Atualizar dados\n\n");
				
				break;
			case 4:
				System.out.println("Apagar livros\n\n");
				
				break;
			case 5:
				System.out.println("Buscar por autor\n\n");
				
				break;
			default:
				System.out.println("\nOpção Inválida. :/ ");
				break;
			}
		}
	}




	}
