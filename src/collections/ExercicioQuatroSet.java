package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioQuatroSet {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<>();
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o número que deseja encontrar: ");
		int numeroProcurado = leia.nextInt();

		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);

		if (setNumeros.contains(numeroProcurado)) {
			System.out.println("O número " + numeroProcurado + " foi encontrado. ");
			return;
		}
		System.out.println("O número " + numeroProcurado + " não foi encontrado.");

	}
}