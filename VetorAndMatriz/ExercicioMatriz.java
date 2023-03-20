package VetorAndMatriz;
import java.util.Scanner;
public class ExercicioMatriz {
	
	public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    double[][] notas = new double[10][4];
    double[] medias = new double[10];
    int x, y;
    
    for (x = 0; x < notas.length; x++) {
        System.out.println("Notas do participante " + (x + 1) + ":");
        for (y = 0; y < notas[0].length; y++) {
            System.out.print("Digite a nota do " + (y + 1) + "º bimestre: ");
            notas[x][y] = leia.nextDouble();
        }
    }


    for (x = 0; x < notas.length; x++) {
        double soma = 0;
        for (y = 0; y < notas[0].length; y++) {
            soma += notas[x][y];
        }
        medias[x] = soma / notas[0].length;
    }

    System.out.println("Médias dos participantes:");
    for (x = 0; x < medias.length; x++) {
        System.out.println("Participante " + (x + 1) + ": " + medias[x]);
    	
    	}
	}
}