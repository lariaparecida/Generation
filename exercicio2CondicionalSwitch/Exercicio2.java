package exercicio2CondicionalSwitch;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("\nEntre com um número inteiro:");
		int numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("\nNúmero digitado é par ");	
		} else {
			System.out.printf("\nNúmero digitado é ímpar ");
		}
		
		if(numero >= 0) {
			System.out.printf("e positivo. ");	
		} else {
			System.out.printf("e negativo. ");
		}
		
		
	}//main

}//class
