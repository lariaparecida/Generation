package exercicio2CondicionalSwitch;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int codigo, quantidade;
        double precoUnitario, valorTotal;
        String produto;

        System.out.println("Entre com o código do produto (1 a 6):");
        codigo = ler.nextInt();

        System.out.println("Entre com a quantidade comprada:");
        quantidade = ler.nextInt();

        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                precoUnitario = 10.0;
                break;
            case 2:
                produto = "X-Salada";
                precoUnitario = 15.0;
                break;
            case 3:
                produto = "X-Bacon";
                precoUnitario = 18.0;
                break;
            case 4:
                produto = "Bauru";
                precoUnitario = 12.0;
                break;
            case 5:
                produto = "Refrigerante";
                precoUnitario = 8.0;
                break;
            case 6:
                produto = "Suco de laranja";
                precoUnitario = 13.0;
                break;
            default:
                System.out.println("Código inválido");
                return;
        }

        valorTotal = quantidade * precoUnitario;
        System.out.println("Produto comprado: " + produto);
        System.out.printf("Valor total da conta: R$ %.2f\n", valorTotal);
    }
}