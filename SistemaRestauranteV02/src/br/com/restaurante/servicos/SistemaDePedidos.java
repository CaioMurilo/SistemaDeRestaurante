package br.com.restaurante.servicos;

import br.com.restaurante.modelo.Bebida;
import br.com.restaurante.modelo.Comida;
import br.com.restaurante.modelo.Pedido;

//Classe que gerencia o sistema de pedidos
public class SistemaDePedidos {

	//Exemplo de menu (pode ser melhorado)
    public void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Hambúrguer (Comida) - R$ 15.00");
        System.out.println("2. Batata Frita (Comida) - R$ 8.00");
        System.out.println("3. Refrigerante (Bebida) - R$ 5.00");
    }

    //Processa o pedido com base na escolha (Polimorfismo e Herança)
    public void processarPedido(int opcao, Pedido pedido) {
        switch (opcao) {
            case 1:
                pedido.adicionarItem(new Comida("Hambúrguer", 15.00)); //Adiciona Comida
                break;
            case 2:
                pedido.adicionarItem(new Comida("Batata Frita", 8.00)); //Adiciona Comida
                break;
            case 3:
                pedido.adicionarItem(new Bebida("Refrigerante", 5.00)); //Adiciona Bebida
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
	
}