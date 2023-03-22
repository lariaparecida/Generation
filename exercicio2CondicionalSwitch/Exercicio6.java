package exercicio2CondicionalSwitch;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario, novoSalario, reajuste = 0;
		
		System.out.println("\nDigite o nome do colaborador: ");
		nome = ler.nextLine();
		
		System.out.println("\nDigite o código do cargo: ");
		codigo = ler.nextInt();
		
		System.out.println("\nDigite o salário: ");
		salario = ler.nextFloat();
		
		switch(codigo) {
			case 1:
				reajuste = 0.1f;
				System.out.println("\nCargo: Gerente");
				break;
			case 2:
				reajuste = 0.07f;
				System.out.println("\nCargo: Vendedor");
				break;
			case 3:
				reajuste = 0.09f;
				System.out.println("\nCargo: Supervisor");
				break;
			case 4:
				reajuste = 0.06f;
				System.out.println("\nCargo: Motorista");
				break;
			case 5:
				reajuste = 0.05f;
				System.out.println("\nCargo: Estoquista");
				break;
			case 6:
				reajuste = 0.08f;
				System.out.println("\nCargo: Técnico de TI");
				break;
			default:
				System.out.println("\nCódigo de cargo inválido!");
				break;
		}
		
		novoSalario = salario + (reajuste * salario);
		System.out.println("\nNome do colaborador: " + nome);
		System.out.printf("\nSalário atual: R$ %.2f", salario);
		System.out.printf("\nNovo salário: R$ %.2f", novoSalario);

	}

}