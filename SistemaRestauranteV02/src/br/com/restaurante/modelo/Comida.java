package br.com.restaurante.modelo;

//Classe Comida que herda de Item (Herança)
public class Comida extends Item {

	// Construtor que chama o construtor da classe pai (Item)
	public Comida(String nome, double preco) {
		super(nome, preco);	//Usando o construtor da classe base (classe Pai)
	}

	// Sobrescrevendo o método toString (Polimorfismo)
	@Override
	public String toString() {
		return "Comida: "+super.toString(); //Adiciona "Comida" ao nome
	}
	
}