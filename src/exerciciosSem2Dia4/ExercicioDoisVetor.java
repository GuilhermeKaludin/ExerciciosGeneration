package exerciciosSem2Dia4;

import java.util.Scanner;

public class ExercicioDoisVetor {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int soma = 0;
		float media;
		int indicesImpares[] = new int[10];
		int indicesPares[] = new int[10];
		int qtdImpares = 0;
		int qtdPares = 0;

		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "º elemento: ");
			numeros[i] = leia.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (numeros[i] % 2 == 0) {
				indicesPares[qtdPares] = numeros[i];
				qtdPares++;
			} else {
				indicesImpares[qtdImpares] = numeros[i];
				qtdImpares++;
			}
			soma = soma + numeros[i];
		}

		media = (float)soma / 10;

		System.out.println("Elementos nos indices impares: ");
		for (int i = 0; i < qtdImpares; i++) {
			System.out.println(indicesImpares[i]);
		}

		System.out.println("Elementos nos indices pares: ");
		for (int i = 0; i < qtdPares; i++) {
			System.out.println(indicesPares[i]);
		}

		System.out.println("Soma: " + soma);
		System.out.printf("Média: %.2f%n", media);
	}
}
