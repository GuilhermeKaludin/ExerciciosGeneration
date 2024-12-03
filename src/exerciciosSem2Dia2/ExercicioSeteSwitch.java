package exerciciosSem2Dia2;

import java.util.Scanner;

public class ExercicioSeteSwitch {

	public static void main(String[] args) {

		float num1, num2, soma, subtracao, multiplicacao, divisao;
		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o 1° numero: ");
		num1 = leia.nextFloat();
		System.out.println("Digite o 2° numero: ");
		num2 = leia.nextFloat();
		System.out.println("Digite qual operacao deseja realizar: ");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			soma = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + soma);
			break;
		case 2:
			subtracao = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + subtracao);
			break;
		case 3:
			multiplicacao = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
			break;
		case 4:
			divisao = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + divisao);
			break;
		default:
			System.out.println("Opção inválida");
		}

	}

}
