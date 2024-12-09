package collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<>();
		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n******************* Menu ******************* ");
			System.out.println("1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("\n******************************************** ");
			System.out.print("\nEntre com a opção desejada: ");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				leia.nextLine();
				String livro = leia.nextLine();
				pilhaLivros.push(livro);
				System.out.println("Livro adicionado.");
				System.out.println("\nPilha: ");
				for (String listaLivros : pilhaLivros) {
					System.out.println(listaLivros);
				}
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("\nPilha: ");
					for (String listaLivros : pilhaLivros) {
						System.out.println(listaLivros);
					}
				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String livroRemovido = pilhaLivros.pop();
					System.out.println("Livro removido: " + livroRemovido);
					System.out.println("\nPilha: ");
					for (String listaLivros : pilhaLivros) {
						System.out.println(listaLivros);
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
