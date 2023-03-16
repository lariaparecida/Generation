package LacoRepeticao;
import java.util.Scanner;
public class LacoRepeticaoWhile {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int idade,contMenor21 = 0, contMaior50 = 0;
	
	System.out.print("Digite a idade: ");
	idade = leia.nextInt();
	
	while(idade>=0) {
		if(idade<21) {
			contMenor21++;
		} else if (idade>50) {
			contMaior50++;
		}
			
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();

	}
	
	System.out.println("Total de pessoas menores de 21 anos: "+contMenor21);
	System.out.println("Total de pessoas maiores de 50 anos: "+contMaior50);
	
	}//main
}//class