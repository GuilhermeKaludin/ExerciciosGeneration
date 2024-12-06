package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioDoisArray {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o número que deseja encontrar: ");
		int numeroProcurado = leia.nextInt();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		int indice = 0;
		for (Integer numero : numeros) {
			if (numero == numeroProcurado) {
				System.out.println("O número " + numeroProcurado + " está na posição " + indice);
				return;
			}
			indice++;
		}

		System.out.println("O número " + numeroProcurado + " não foi encontrado.");
	}

}
