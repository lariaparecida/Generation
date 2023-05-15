package exercicio2CondicionalSwitch;

import java.util.Scanner;

public class LacoCondicional5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo, qtd;
		double resultado, valor;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\n Produtos");
		System.out.println("\n 1 - Cachorro Quente \t R$ 10.00");
		System.out.println("\n 2 - X-Salada \t R$ 15.00");
	    System.out.println("\n 3 - X-Bacon \t R$ 18.00");
	    System.out.println("\n 4 - Bauru \t R$ 12.00 ");
	    System.out.println("\n 5 - Refrigerante \t R$ 8.00 ");
	    System.out.println("\n 6 - Suco de Laranja \t R$ 13.00");
	    
		System.out.println("\n Código do Produto: ");
		codigo = leia.nextInt();
		System.out.println("\n Quantidade: ");
		qtd = leia.nextInt();
		
		
		switch(codigo) {
		
		case 1:
            valor = 10.00;
            resultado = qtd * valor;
            System.out.println("\nO valor total é " +resultado);
            break;
		
		case 2: 
			
			valor = 15.00;
            resultado = qtd * valor;
            System.out.println("\nO valor total é " +resultado);
            break;
		
		case 3:
			valor = 18.00;
            resultado = qtd * valor;
            System.out.println("\nO valor total é " +resultado);
            break;
            
		case 4:
			valor = 12.00;
            resultado = qtd * valor;
            System.out.println("\nO valor total é " +resultado);
            break;
            
		case 5:
			valor = 8.00;
            resultado = qtd * valor;
            System.out.println("\nO valor total é " +resultado);
            break;
            
		case 6:
			valor = 13.00;
            resultado = qtd * valor;
            System.out.println("\nO valor total é " +resultado);
            break;
		
		}
		
	    
	}

}

