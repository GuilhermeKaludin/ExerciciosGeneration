package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n******************* Menu ******************* ");
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("\n******************************************** ");
			System.out.print("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nome = leia.next();
				fila.add(nome);
				System.out.println("Cliente adicionado à fila.");
				System.out.println("\nClientes na fila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}

				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String chamado = fila.poll();
					System.out.println("Cliente chamado: " + chamado);
					System.out.println("Clientes na fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (opcao != 0);
	}
}