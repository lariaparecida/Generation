package exercicio1Sequencial;

import java.util.Scanner;

public class Exercicio4 {
	
	 public static void main(String[] args) {
		 
		 float n1,n2,n3,n4,resultado;
		 
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("\nInsira um número: ");
		 n1 = leia.nextFloat();
		 System.out.println("\nInsira um número: ");
		 n2 = leia.nextFloat();
		 System.out.println("\nInsira um número: ");
		 n3 = leia.nextFloat();
		 System.out.println("\nInsira um número: ");
		 n4 = leia.nextFloat();
		 
		resultado=(n1*n2)-(n3*n4);
			
		System.out.printf("\nO resultado da diferença entre o n1 e n2 pelo produto entre o n3 e o n4 é %.2f",resultado);	
			
			
	 }
}