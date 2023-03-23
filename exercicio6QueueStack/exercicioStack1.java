package exercicio6QueueStack;

import java.util.Scanner;
import java.util.Stack;

public class exercicioStack1 {

	public static void main(String[] args) {
		        
		 Scanner leia = new Scanner(System.in);
		 
	        Stack<String> pilhaDeLivros = new Stack<String>();
	        
	        int opcao;
	        
	        while (true) {
	            System.out.println("********************************************************");
	            System.out.println("\nMENU\n"); 
	            System.out.println("\n1. Adicionar um novo livro na pilha.");
	            System.out.println("\n2. Listar todos os livros da pilha.");
	            System.out.println("\n3. Retirar um livro da pilha.");
	            System.out.println("\n0. Encerrar.\n");
	            
	            System.out.println("********************************************************");

	            System.out.println("\nDigite sua opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine();
	            
	            System.out.println("\n********************************************************\n");
	            
	            switch(opcao) {
	            
	            case 0:
	                
	                System.out.println("\nSistema encerrado. Até breve.");
	                leia.close();
	                System.exit(0);
	                
	                break;
	            
	            case 1:
	                
	                System.out.println("\nDigite o nome do livro: ");
	                String livro = leia.nextLine();
	                pilhaDeLivros.push(livro);
	                System.out.println("\nLivro adicionado à pilha.");
	                
	                break;
	            
	            case 2:
	                
	                if(pilhaDeLivros.isEmpty()) {
	                    System.out.println("\nPilha vazia.\n");
	                } else {
	                    System.out.println("Exibindo todos os livros na pilha: "+pilhaDeLivros);
	                }
	                
	                break;
	            
	            case 3:
	                
	                if(pilhaDeLivros.isEmpty()) {
	                    System.out.println("\nPilha vazia. Impossível retirar.\n");
	                } else {
	                	
	                	String livroRetirado = pilhaDeLivros.pop();
          			
	                    System.out.println("\nLivro retirado da pilha: "+livroRetirado); 
	                }
	                
	            }//switch
	            
	        }//while
		
	}//main

}//class