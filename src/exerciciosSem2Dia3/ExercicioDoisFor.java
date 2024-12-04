package exerciciosSem2Dia3;

import java.util.Scanner;

public class ExercicioDoisFor {

	public static void main(String[] args) {

		int numero, contador;
		int pares = 0, impares = 0;

		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "º numero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("\nTotal de numeros pares: " + pares);
		System.out.println("Total de numeros ímpares: " + impares);
	}

}
