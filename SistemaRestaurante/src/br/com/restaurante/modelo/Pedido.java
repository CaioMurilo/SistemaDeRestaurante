package br.com.restaurante.modelo;

/*	Mensagens Gerais (Apagar na versão final)
 * 
 * -> Crie uma relação de herança entre as classes (extends);
 * -> Revise o código para encontrar possíveis erros;
 * -> Adicione mais itens no menu;
 * -> Revisão geral no código (Todos os 4 pilares de POO foram utilizados?).
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<Item> itens; //uma lista de itens no pedido

    //construtor
    public Pedido() {
        this.itens = new ArrayList<>();
    }

    //adiciona um item ao pedido
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    //calcula o valor total do pedido
    public double calcularTotal() {
        double total = 0;
        
        for (Item item : itens) {
            total += item.getPreco();
        }
        
        return total;
    }

    //exibe os itens do pedido
    public void exibirPedido() {
    	
        for (Item item : itens) {
            System.out.println(item);
        }
        
    }
	
}