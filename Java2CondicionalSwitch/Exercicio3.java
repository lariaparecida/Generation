package exercicio2CondicionalSwitch;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;
        boolean primeiraDoacao;

        System.out.println("\nQual o nome do doador(a)?");
        nome = leia.nextLine();
        System.out.println("\nQual a idade do doador(a)?");
        idade = leia.nextInt();
        System.out.println("\nÉ a primeira doação, sim ou não?");
        primeiraDoacao = leia.nextBoolean();
        
        if(idade>=18 && idade <=60) {
        	System.out.println(nome+"\n pode doar sangue.");
        }else if(idade > 60 && idade <=69 && primeiraDoacao == true) {
        	System.out.println(nome+"\n pode doar sangue.");
        }else if(idade > 60 && idade <= 69 && primeiraDoacao == false) {
        	System.out.println(nome+"\n não pode doar sangue.");
        }else {
        	    System.out.println(nome+"\n não pode doar sangue.");
        }
        
        	
        

    }//
}//