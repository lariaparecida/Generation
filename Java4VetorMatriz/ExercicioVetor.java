package exercicio4VetorMatriz;
import java.util.Scanner;
public class ExercicioVetor {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		int x,soma=0;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		
		
		for(x=0;x<10;x++) {
			System.out.println("\nDigite o "+(x+1)+"º número: ");
			vetor[x] = leia.nextInt();
		}
		
		System.out.println("\nElementos de índices ímpares do vetor: ");
		for (x=1;x<10;x+=2) {
			System.out.println(vetor[x] +" ");
		}
		
		System.out.print("\nElementos pares do vetor: ");
		for (x=0;x<10;x++) {
			if (vetor[x] % 2 == 0) {
				System.out.println(vetor[x] + " ");
			}
			
		}
		for (x=0;x<10;x++) {
			soma+=vetor[x];
		}
		
		double media = (double) soma / 10;
		System.out.println("\nSoma de todos os elementos do vetor: " +soma);
		System.out.println("Média de todos os elementos do vetor: "+ media);
			
		
		
	}//main
}//class
