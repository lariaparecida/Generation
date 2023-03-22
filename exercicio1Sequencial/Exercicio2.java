package exercicio1Sequencial;

import java.util.Scanner;

public class Exercicio2 {
	
	 public static void main(String[] args) {
		 
		 float nota1,nota2,nota3,nota4,media;
		 
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("\nEntre com a primeira nota: ");
			nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
			nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
			nota3 = leia.nextFloat();
		System.out.println("\nEntre com a quarta nota: ");
			nota4 = leia.nextFloat();
		 
			media = (nota1+nota2+nota3+nota4)/4;
			
			System.out.printf("\nMédia aritmética foi de: %.2f",media);
			
	 }
}