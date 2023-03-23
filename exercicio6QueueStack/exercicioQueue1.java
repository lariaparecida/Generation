package exercicio6QueueStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicioQueue1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String>filaClientes = new LinkedList<String>();
		
		int opcao;
		
		do {
			System.out.println("--------------------------------------------------------");
          
			System.out.println("\nMENU");
			
            System.out.println("1. Adicionar um novo cliente na fila.");
            System.out.println("2. Listar todos os clientes na fila.");
            System.out.println("3. Chamar (retirar) um cliente da fila.");
            System.out.println("0. Encerrar.");

            System.out.println("--------------------------------------------------------");

            System.out.print("\nDigite sua opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            
            System.out.println("--------------------------------------------------------\n");

            switch (opcao) {
            case 0:
                System.out.println("Programa finalizado.");
                break;
            case 1:
                System.out.print("Digite o nome do Cliente para adicionar na fila: ");
                String nomeCliente = leia.nextLine();
                filaClientes.add(nomeCliente);
                System.out.println("Cliente adicionado na fila com sucesso.");
                break;
            case 2:
                if (filaClientes.isEmpty()) {
                    System.out.println("Fila vazia.");
                } else {
                    System.out.println("Clientes na fila: " + filaClientes);
                }
                break;
            case 3:
                if (filaClientes.isEmpty()) {
                    System.out.println("Fila vazia. Impossível retirar um Cliente.");
                } else {
                    String clienteRetirado = filaClientes.poll();
                    System.out.println("Cliente " + clienteRetirado + " retirado da fila.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    } while (opcao != 0);

    leia.close();
		
	}//main
	
}//class