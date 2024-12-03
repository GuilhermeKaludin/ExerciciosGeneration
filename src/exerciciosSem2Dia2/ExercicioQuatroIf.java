package exerciciosSem2Dia2;

import java.util.Scanner;

public class ExercicioQuatroIf {

	public static void main(String[] args) {

		String caracteristica1, caracteristica2, caracteristica3;
		String animal = "";

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a primeira caracteristica: ");
		caracteristica1 = leia.nextLine();

		System.out.println("Digite a segunda caracteristica: ");
		caracteristica2 = leia.nextLine();

		System.out.println("Digite a terceira caracteristica: ");
		caracteristica3 = leia.nextLine();

		if (caracteristica1.equals("vertebrado")) {
			if (caracteristica2.equals("ave")) {
				if (caracteristica3.equals("carnivoro")) {
					animal = "Águia";
				} else if (caracteristica3.equals("onivoro")) {
					animal = "Pomba";
				}
			} else if (caracteristica2.equals("mamifero")) {
				if (caracteristica3.equals("onivoro")) {
					animal = "Homem";
				} else if (caracteristica3.equals("herbivoro")) {
					animal = "Vaca";
				}
			}
		} else if (caracteristica1.equals("invertebrado")) {
			if (caracteristica2.equals("inseto")) {
				if (caracteristica3.equals("hematofago")) {
					animal = "Pulga";
				} else if (caracteristica3.equals("herbivoro")) {
					animal = "Lagarta";
				}
			} else if (caracteristica2.equals("anelideo")) {
				if (caracteristica3.equals("hematofago")) {
					animal = "Sanguessuga";
				} else if (caracteristica3.equals("onivoro")) {
					animal = "Minhoca";
				}
			}
		}

		if (animal.isEmpty()) {
			System.out.println("Caracteristicas invalidas!");

		} else {
			System.out.println("O animal identificado é: " + animal);
		}
	}

}
