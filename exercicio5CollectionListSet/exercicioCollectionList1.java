package exercicioCollectionListSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicioCollectionList1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();

        for (int x = 0; x < 5; x++) {
            System.out.print("Digite a cor " + (x+1) + ": ");
            String cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println("Cores adicionadas: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);
        System.out.println("\nCores ordenadas em ordem crescente: ");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }//
}//