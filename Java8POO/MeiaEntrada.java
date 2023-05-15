package exercicioPolimorfismo;

import java.sql.Date;

public class MeiaEntrada extends Ingresso {

	private double ValorMeia;

	public MeiaEntrada(String nome, Double rG, Date dataCompra, String artista, String local, double valorMeia) {
		super(nome, rG, dataCompra, artista, local);
		this.ValorMeia = valorMeia;
	}
	
	public void visualizarMeia() {
		super.visualizar();
		System.out.println ("Valor da meia entrada: "+ValorMeia);
	}

	public double getValorMeia() {
		return ValorMeia;
	}

	public void setValorMeia(double valorMeia) {
		ValorMeia = valorMeia;
	}
		
	
	
}