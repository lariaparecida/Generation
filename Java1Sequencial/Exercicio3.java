package exercicio1Sequencial;

import java.util.Scanner;

public class Exercicio3 {
	
	 public static void main(String[] args) {
		 
		 float salarioBruto,adicionalNoturno,horaExtra,valorHoraExtra,desconto,salarioLiquido;
		 
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("\nInsira o salário bruto: ");
		 salarioBruto = leia.nextFloat();
		System.out.println("\nInsira o valor de adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("\nInsira o valor pago por 1 hora extra: ");
		horaExtra = leia.nextFloat();
		System.out.println("\nInsira o número de horas extras trabalhadas: ");
		valorHoraExtra = leia.nextFloat();
		System.out.println("\nInsira o valor de descontos totais: ");
		desconto = leia.nextFloat();
		 
		salarioLiquido = (salarioBruto+adicionalNoturno+(horaExtra*valorHoraExtra))-desconto;
			
			System.out.printf("\nO salário líquido é de R$: %.2f",salarioLiquido);
			
			
			
	 }
}