package exercicios;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		float salBruto, adcNoturno, hrExtra, desconto, salLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto: ");
		salBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adcNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor da sua hora extra: ");
		hrExtra = leia.nextFloat();
		
		System.out.println("Digite o desconto: ");
		desconto = leia.nextFloat();

		
		salLiquido = salBruto + adcNoturno + (hrExtra * 5) - desconto;
		
		System.out.printf("Salário Liquído: %.1f ", salLiquido);

	}

}
