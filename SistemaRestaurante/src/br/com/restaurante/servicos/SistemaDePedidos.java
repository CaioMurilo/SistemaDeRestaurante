package br.com.restaurante.servicos;

/*	Mensagens Gerais (Apagar na versão final)
 * 
 * -> Crie uma relação de herança entre as classes (extends);
 * -> Revise o código para encontrar possíveis erros;
 * -> Adicione mais itens no menu;
 * -> Revisão geral no código (Todos os 4 pilares de POO foram utilizados?).
 * 
 */

import br.com.restaurante.modelo.Item;
import br.com.restaurante.modelo.Pedido;

public class SistemaDePedidos {

	//exemplo de menu (pode ser melhorado)
    public void exibirMenu() {	// Cainan, tenta adicionar mais 3 opções (Apagar depois o comentario)
    	
        System.out.println("Menu:");
        System.out.println("1. Hambúrguer - R$ 15.00");
        System.out.println("2. Batata Frita - R$ 8.00");
        System.out.println("3. Refrigerante - R$ 5.00");
        
    }

    //processa o pedido (polimorfismo por sobrecarga de método)
    public void processarPedido(int opcao, Pedido pedido) {
    	
        switch (opcao) {
            case 1:
                pedido.adicionarItem(new Item("Hambúrguer", 15.00));
                break;
            case 2:
                pedido.adicionarItem(new Item("Batata Frita", 8.00));
                break;
            case 3:
                pedido.adicionarItem(new Item("Refrigerante", 5.00));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        
    }
	
}