package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioUmArray {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 5 cores:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Cor " + (i + 1) + ": ");
			String cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println("\nOrdenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

	}

}
