package exercicioPOO1;

//Classe Cliente
public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private String telefone;
	private double limiteCredito;

	// Método construtor
	public Cliente(String nome, int idade, String endereco, String telefone, double limiteCredito) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.limiteCredito = limiteCredito;
	}

	// Métodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	// Método visualizar
	public void visualizar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Limite de crédito: " + this.limiteCredito);
	}
}