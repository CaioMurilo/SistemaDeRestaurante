package br.com.restaurante.main;

import java.util.Scanner;
import br.com.restaurante.modelo.Pedido;
import br.com.restaurante.servicos.SistemaDePedidos;

//Classe principal que executa o programa
public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); //Para receber a entrada do usuário
	        Pedido pedido = new Pedido(); //Cria um novo pedido
	        SistemaDePedidos sistema = new SistemaDePedidos(); //Sistema de pedidos

	        boolean continuar = true;

	        //Enquanto o usuário desejar continuar pedindo
	        while (continuar) {
	            sistema.exibirMenu(); //Exibe o menu
	            System.out.print("Escolha um item do menu (1-3): ");
	            int opcao = scanner.nextInt(); //Recebe a escolha do usuário
	            sistema.processarPedido(opcao, pedido); //Processa o pedido com base na escolha

	            System.out.print("Deseja adicionar mais itens ao pedido? (s/n): ");
	            String resposta = scanner.next(); //Recebe a resposta do usuário
	            if (resposta.equalsIgnoreCase("n")) {
	                continuar = false; //Para o loop se o usuário não quiser mais itens
	            }
	        }

	        //Exibe o pedido final e o total
	        System.out.println("\nSeu pedido:");
	        pedido.exibirPedido(); //Exibe o pedido usando polimorfismo
	        System.out.println("Total: R$ "+pedido.calcularTotal());

	        scanner.close(); //Fecha o scanner
	}

}