package exerciciosSem2Dia3;

import java.util.Scanner;

public class ExercicioCincoDoWhile {

	public static void main(String[] args) {
		int numero;
		int soma = 0;

		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite os numeros e para encerrar digite o numero zero: ");
		numero = leia.nextInt();

		do {

			if (numero > 0) {

				soma = soma + numero;
			}
			System.out.println("\nDigite um numero: ");
			numero = leia.nextInt();

		} while (numero != 0);

		System.out.println("A soma dos numeros positivos é: " + soma);
	}

}
