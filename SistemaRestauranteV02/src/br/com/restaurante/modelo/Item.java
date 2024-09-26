package br.com.restaurante.modelo;

//Classe base Item (Abstração)
public class Item {

	//Atributos (Caracteristicas)
	private String nome;
    private double preco;
    
    //Construtor
	public Item(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	//Getters e Setters (Encapsulamento)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
    
	// Sobrescrevendo o método toString (Polimorfismo)
	@Override
	public String toString() {
		return nome+" R$ "+preco;
	}
	
}