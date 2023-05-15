package exercicio3LacoRepeticao;

import java.util.Scanner;

public class LacoRepeticaoFor2 {

    public static void main(String[] args) {

        int x, n1, n2;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número do intervalo (menor que o próximo): ");
        n1 = leia.nextInt();

        System.out.println("Digite o segundo número do intervalo(maior que o próximo): ");
        n2 = leia.nextInt();

        if (n1 >= n2) {
            System.out.println("Valores inválidos! O primeiro número deve ser menor que o segundo.");
        } else {
            System.out.print("Múltiplos de 3 e 5 entre " + n1 + " e " + n2 + ": ");
            for (x = n1; x <= n2; x++) {
                if (x % 3 == 0 && x % 5 == 0) {
                    System.out.print(x + " ");
                }
            }
            System.out.println(); // Quebra de linha após o laço for
        }

        leia.close(); // Fechando o Scanner

    }
}