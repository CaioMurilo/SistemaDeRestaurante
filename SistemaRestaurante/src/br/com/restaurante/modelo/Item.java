package br.com.restaurante.modelo;

/*	Mensagens Gerais (Apagar na versão final)
 * 
 * -> Crie uma relação de herança entre as classes (extends);
 * -> Revise o código para encontrar possíveis erros;
 * -> Adicione mais itens no menu;
 * -> Revisão geral no código (Todos os 4 pilares de POO foram utilizados?).
 * 
 */

public class Item {

	//atributos (caracteristicas)
	private String nome;
    private double preco;
    
    //construtor
	public Item(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	//getters e setters (Encapsulamento)
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
    
	//sobrescreve o método toString (Polimorfismo)
    @Override
    public String toString() {
        return nome +" - R$ "+ preco;
    }
	
}