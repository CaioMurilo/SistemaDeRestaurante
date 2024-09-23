package br.com.restaurante.main;

/*	Mensagens Gerais (Apagar na versão final)
 * 
 * -> Crie uma relação de herança entre as classes (extends);
 * -> Revise o código para encontrar possíveis erros;
 * -> Adicione mais itens no menu;
 * -> Revisão geral no código (Todos os 4 pilares de POO foram utilizados?).
 * 
 */

import java.util.Scanner;
import br.com.restaurante.modelo.Pedido;
import br.com.restaurante.servicos.SistemaDePedidos;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //para receber a entrada do usuário
        Pedido pedido = new Pedido(); //cria um novo pedido
        SistemaDePedidos sistema = new SistemaDePedidos(); //sistema de pedidos

        boolean continuar = true;

        //enquanto o usuário desejar continuar pedindo
        while (continuar) {
        	
            sistema.exibirMenu(); //exibe o menu
            System.out.print("Escolha um item do menu (1-3): ");
            
            int opcao = scanner.nextInt(); //recebe a escolha do usuário
            sistema.processarPedido(opcao, pedido); //processa o pedido com base na escolha

            System.out.print("Deseja adicionar mais itens ao pedido? (s/n): ");
            String resposta = scanner.next(); //recebe a resposta do usuário
            
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false; //para o loop se o usuário não quiser mais itens
            }
        }
        
        //exibe o pedido final e o total
        System.out.println("\nSeu pedido:");
        pedido.exibirPedido();
        System.out.println("Total: R$ "+ pedido.calcularTotal());

        scanner.close(); //fecha o scanner
		
	}

}
