package Menu;

public class Doador {

	private String nomeDoador;
	private String telefone;
	private String documento;

	public Doador(String nomeDoador, String telefone, String documento) {
		this.nomeDoador = nomeDoador;
		this.telefone = telefone;
		this.documento = documento;
	}

	public String getNomeDoador() {
		return nomeDoador;
	}

	public void setNomeDoador(String nomeDoador) {
		this.nomeDoador = nomeDoador;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void exibir() {
		System.out.println("\nO nome do doador é " + nomeDoador + ", telefone de nº: " + telefone
				+ " e identidade de nº: " + documento);
	}

}