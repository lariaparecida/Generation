package exercicioPolimorfismo;

import java.sql.Date;

public class Ingresso {
	
	private String Nome;
	private Double RG;
	private Date dataCompra;
	private String Artista;
	private String local;
	
	public Ingresso(String nome, Double rG, Date dataCompra, String artista, String local) {
		super();
		this.Nome = nome;
		this.RG = rG;
		this.dataCompra = dataCompra;
		this.Artista = artista;
		this.local = local;
	}
	
	public void visualizar() {
		System.out.println("\n Dados do comprador:");
		System.out.println("Nome do cliente: "+Nome);
		System.out.println("RG: "+RG);
		System.out.println("Data da compra: "+dataCompra);
		System.out.println("Artista do espetaculo: "+Artista);
		System.out.println("Localização do espetaculo: "+local);
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getRG() {
		return RG;
	}

	public void setRG(Double rG) {
		RG = rG;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getArtista() {
		return Artista;
	}

	public void setArtista(String artista) {
		Artista = artista;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	
	

}