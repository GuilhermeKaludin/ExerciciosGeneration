package exerciciosSem2Dia2;

import java.util.Scanner;

public class ExercicioUmIf {

	public static void main(String[] args) {

		int num1, num2, num3, soma;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		num1 = leia.nextInt();

		System.out.println("Digite o número B: ");
		num2 = leia.nextInt();

		System.out.println("Digite o número C: ");
		num3 = leia.nextInt();

		soma = num1 + num2;

		if (soma > num3) {
			System.out.println(num1 + " + " + num2 + " = " + soma + " > " + num3);
			System.out.println("A soma de A + B é maior que C");
		} else if (soma < num3) {
			System.out.println(num1 + " + " + num2 + " = " + soma + " < " + num3);
			System.out.println("A soma de A + B é menor que C");
		} else {
			System.out.println(num1 + " + " + num2 + " = " + soma + " = " + num3);
			System.out.println("A soma de A + B é igual a C");
		}

	}

}
