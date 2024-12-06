package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioTresSet {

	public static void main(String[] args) {

		Set<Integer> setNumero = new HashSet<>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros (não repetidos):");

		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int numero = leia.nextInt();
			setNumero.add(numero);
		}

		System.out.println("Listar dados do Set:");
		for (int numero : setNumero) {
			System.out.println(numero);
		}

	}

}
