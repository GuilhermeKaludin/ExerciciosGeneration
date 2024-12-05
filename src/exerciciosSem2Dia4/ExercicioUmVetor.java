package exerciciosSem2Dia4;

import java.util.Scanner;

public class ExercicioUmVetor {

	public static void main(String[] args) {

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o número que deseja encontrar: ");
		int numeroProcurado = leia.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numeroProcurado) {
				System.out.println("O número " + numeroProcurado + " está na posição " + i);
				return;
			}
		}

		System.out.println("O número " + numeroProcurado + " não foi encontrado.");
	}

}
