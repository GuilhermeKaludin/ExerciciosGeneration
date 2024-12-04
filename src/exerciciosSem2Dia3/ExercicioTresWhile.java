package exerciciosSem2Dia3;

import java.util.Scanner;

public class ExercicioTresWhile {

	public static void main(String[] args) {

		int idade;
		int menores21 = 0, maiores50 = 0;

		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite as idades e para encerrar digite um numero negativo: ");
		idade = leia.nextInt();

		while (idade > 0) {
			if (idade < 21) {
				menores21++;
			} else if (idade > 50) {
				maiores50++;
			}

			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
		}
		System.out.println("O total de pessoas menores de 21 anos é: " + menores21);
		System.out.println("O total de pessoas menores de 50 anos é: " + maiores50);
	}

}
