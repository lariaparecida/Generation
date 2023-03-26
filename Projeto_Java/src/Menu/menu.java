package Menu;

import java.util.Scanner;

public class menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		String nome,tel,doc,doacao;

			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("             Bem-vinde ao Projeto Vida.              ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("Digite seu nome:                                     ");
								nome = leia.nextLine();
            System.out.println("Digite o nº do documento de identidade:              ");
								doc = leia.nextLine();
			System.out.println("Digite o nº do telefone:                             ");
								tel = leia.nextLine();
								Doador doador1 = new Doador(nome,doc,tel);
								doador1.exibir();
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("            Digite a opção desejada:                 ");
			System.out.println("_____________________________________________________");
			
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("                      Bem-vinde!                     ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("            1 - OFERECER DOAÇÃO.                     ");
			System.out.println("            2 - SOLICITAR DOAÇÃO.                    ");
			System.out.println("            3 - INFORMAÇÕES ÚTEIS.                   ");
			System.out.println("            4 - ENCERRAR.                            ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("            Digite a opção desejada:                 ");
			System.out.println("_____________________________________________________");

			opcao = leia.nextInt();

			switch (opcao) {
				case 1:
					System.out.println("1 - OFERECER DOAÇÃO.");
					System.out.println("Ficamos felizes com sua atitude, ela pode salvar vidas.");
					
					break;
				case 2:
					System.out.println("2 - SOLICITAR DOAÇÃO.");

					break;
				case 3:
					System.out.println("3 - INFORMAÇÕES ÚTEIS.");
					
					break;
				case 4:
					System.out.println("\nSoftware finalizado.");
					leia.close();
					System.exit(4);
					break;
		
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
					
			}
		}
	}