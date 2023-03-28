package exercicioPolimorfismo;

import java.sql.Date;

public class TestaIngresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ingresso ingresso1 = new Ingresso("Ana", 123456789.10, Date(), "Lana Del Rey","Rio de Janeiro - RJ");
		Ingresso ingresso2 = new Ingresso("Luiza", 123456789.11, Date(), "Foo Fighters", "São Paulo - SP");
		
		ingresso1.visualizar();
		ingresso2.visualizar();
	
	
	Vip ingressoVip = new Vip("Beatriz",123456789.12, Date(),"Coldplay" , "São Paulo - SP", 125);
	MeiaEntrada ingressoMeia = new MeiaEntrada("Sarah", 123456789.13, Date(),"RBD", "São Paulo - SP", 10);
	
	ingressoVip.visualizar();
	ingressoMeia.visualizarMeia();
	
	}

	public static Date Date() {
		// TODO Auto-generated method stub
		return null;
	}

}