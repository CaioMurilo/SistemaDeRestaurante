package br.com.restaurante.modelo;

//Classe Bebida que herda de Item (Herança)
public class Bebida extends Item {

	// Construtor que chama o construtor da classe pai (Item)
	public Bebida(String nome, double preco) {
		super(nome, preco);
	}

	// Sobrescrevendo o método toString (Polimorfismo)
	@Override
	public String toString() {
		return "Bebida: "+super.toString(); //Adiciona "Bebida" ao nome
	}
	
}