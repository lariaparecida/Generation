package exercicio3LacoRepeticao;
import java.util.Scanner;
public class LacoRepeticaoFor {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int par = 0;
	int impar = 0;
	
	
	for (int i=1; i<=10; i++) {
		 System.out.println("Digite um número: ");
		 int numero = leia.nextInt();
		 
		 if (numero % 2 == 0) {
			 par++;
	}else{
		impar++;
	}
		
}//for
	
	System.out.println("Quantidade de números pares: "+par);
	System.out.println("Quantidade de números ímpares: "+impar);
	
	


	}//
}//