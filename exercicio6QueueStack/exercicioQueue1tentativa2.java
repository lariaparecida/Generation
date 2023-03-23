package exercicio6QueueStack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioQueue1tentativa2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String>fila = new LinkedList<String>();
		
		int opcao;
		
		while (true) {
			System.out.println("********************************************************");
			System.out.println("\nMENU\n"); 
			System.out.println("\n1. Adicionar um novo cliente na fila (nome): ");
			System.out.println("\n2. Listar todos os clientes na fila: ");
			System.out.println("\n3. Chamar (remover) uma pessoa da fila: ");
			System.out.println("\n0. Encerrar o sistema.\n");
			
			System.out.println("********************************************************");

			System.out.println("\nDigite sua opção: ");
			opcao = leia.nextInt();
			leia.nextLine(); //consumir linha
			
			System.out.println("\n********************************************************\n");
			
			if (opcao == 0) {
				System.out.println("\nSistema encerrado. Até breve.");
				leia.close();
				System.exit(0);
			}
						
			switch(opcao) {
			
			case 1:
				
				System.out.println("\nDigite o nome do cliente: ");
				leia.nextLine(); // consumir a quebra de linha deixada no buffer de entrada
				String nome = leia.nextLine();
				fila.add(nome);
				break;
			
			case 2:
				
				if(fila.isEmpty()) {
				    System.out.println("\nFila vazia.\n");
				} else {
				    System.out.println("Exibindo todos os clientes na fila: "+fila);
				
				    }
				
				break;
				
			case 3:
				
				if(fila.isEmpty()) {
				    System.out.println("\nFila vazia. Impossível remover.\n");
				} else {
					System.out.println("\nDigite o nome do cliente a ser removido da fila: "+fila.peek());
					fila.remove();
					System.out.println("\nRemovido.");
					System.out.println("\nExibindo todos os clientes na fila: "+fila);
					break;
				}
				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;

			}//switch
		
		}//while
		
	}//main
	
}//class