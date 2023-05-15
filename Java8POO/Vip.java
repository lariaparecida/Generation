package exercicioPolimorfismo;

import java.sql.Date;

public class Vip extends Ingresso {

	private double valorVip;	
	
	public Vip(String nome, Double rG, Date dataCompra, String artista, String local, double valorVip) {
		super(nome, rG, dataCompra, artista, local);
		this.valorVip=valorVip;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Valor do ingresso VIP: "+valorVip);
		
	}
	
	public double getValorVip() {
		return valorVip;
	}

	public void setValorVip(double valorVip) {
		this.valorVip = valorVip;
	}

	
}