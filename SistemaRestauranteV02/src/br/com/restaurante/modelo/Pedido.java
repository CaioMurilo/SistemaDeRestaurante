package br.com.restaurante.modelo;

import java.util.ArrayList;
import java.util.List;

//Classe que representa um Pedido
public class Pedido {

	private List<Item> itens; //Uma lista de itens no pedido

	//Construtor
	public Pedido() {
		this.itens = new ArrayList<>();
	}
	
	// Adiciona um item ao pedido
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    // Calcula o valor total do pedido
    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        
        return total;
    }

    // Exibe os itens do pedido
    public void exibirPedido() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }
	
}