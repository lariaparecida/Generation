package exercicio1Sequencial;

import java.util.Scanner;

public class Exercicio1 {
	
	 public static void main(String[] args) {
		 float salario;
		 float abono;
		 float novoSalario;
		 
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("\nEntre com o valor salário: ");
		salario = leia.nextFloat();
		System.out.println("\nEntre com o valor abono: ");
		abono = leia.nextFloat();
		 
		novoSalario = salario+abono;
		
		System.out.println("\nSeu novo salário é R$ "+novoSalario);

		 
	 }
}

