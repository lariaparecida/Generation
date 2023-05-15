package exercicioPOO1;

import poo.Automovel;

public class testeCurso {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setNomeDoCurso("Design de moda");
		curso1.setNivelDeEnsino("Bacharel");
		curso1.setModalidade("Presencial");
		curso1.setNumeroDeSemestres(10);
		curso1.setValorDaMensalidade(1500.00f);
		
		System.out.println("Curso: "+curso1.getNomeDoCurso());
		System.out.println("Nível: "+curso1.getNivelDeEnsino());
		System.out.println("Modalidade: "+curso1.getModalidade());
		System.out.println("Nº de semestres : "+curso1.getNumeroDeSemestres());
		System.out.println("Mensalidade R$: "+curso1.getValorDaMensalidade());
			
			Curso curso2 = new Curso();
			
			curso2.setNomeDoCurso("Gestão de recursos humanos");
			curso2.setNivelDeEnsino("Graduação");
			curso2.setModalidade("Ensino à distância");
			curso2.setNumeroDeSemestres(10);
			curso2.setValorDaMensalidade(700.00f);
			
			System.out.println("Curso: "+curso2.getNomeDoCurso());
			System.out.println("Nível: "+curso2.getNivelDeEnsino());
			System.out.println("Modalidade: "+curso2.getModalidade());
			System.out.println("Nº de semestres : "+curso2.getNumeroDeSemestres());
			System.out.println("Mensalidade R$: "+curso2.getValorDaMensalidade());

			
			
	}
		
}