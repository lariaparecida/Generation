package exercicio2CondicionalSwitch;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\nEntre com a o número A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com a o número B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com a o número C: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		if(soma>c) {
			System.out.println("\nA soma de A + B é maior que C!!!");
		}
		
		else if(soma<c){
			System.out.println("\nA soma de A + B é menor que C!!!");
		}
		
		else{
			System.out.println("\nA soma de A + B é igual a C!!!");
		}
		
		
	}//public static

}//public class

