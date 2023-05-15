package exercicioCollectionListSet;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class exercicioCollectionSet1 {

	public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = leia.nextInt();
        
        if (numeros.contains(numero)) {
            System.out.printf("Número %02d encontrado!\n", numero);
        } else {
            System.out.printf("O número %02d não foi encontrado!\n", numero);
        }
    }//
}//