package VetorAndMatriz;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int [10];
		int numero, encontrado,x;

		System.out.println("\nDigite um número: ");
		numero = leia.nextInt();
		
		for(x=0;x<10;x++) {
			System.out.println("\nEntre com um número do Array: ");
			num [x] = leia.nextInt();
			
			if(num[x] == numero) {
				System.out.println("\nA posição do número digitado é: "+x);
					
			}//if
				
		}//for
		
		if(cont == 0) {
			System.out.println("\nNão foi encontrado.")
		}
		
	}//

}//
