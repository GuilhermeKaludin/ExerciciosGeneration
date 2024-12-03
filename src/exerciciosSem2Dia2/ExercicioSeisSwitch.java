package exerciciosSem2Dia2;

import java.util.Scanner;

public class ExercicioSeisSwitch {

	public static void main(String[] args) {

		int codigo;
		String nome;
		float salario, novoSalario;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite seu nome: ");
		nome = leia.next();
		System.out.println("Digite o código do seu cargo: ");
		codigo = leia.nextInt();
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();

		
		switch (codigo) {
		case 1:
			novoSalario = salario + (0.10f * salario);
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário: R$ %.2f%n", novoSalario);
			break;
		case 2:
			novoSalario = salario + (0.07f * salario);
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário: R$ %.2f%n", novoSalario);
			break;
		case 3:
			novoSalario = salario + (0.09f * salario);
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Supervisor" );
			System.out.printf("Salário: R$ %.2f%n", novoSalario);
			break;
		case 4:
			novoSalario = salario + (0.06f * salario);
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário: R$ %.2f%n", novoSalario);
			break;
		case 5:
			novoSalario = salario + (0.05f * salario);
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário: R$ %.2f%n", novoSalario);
			break;
		case 6:
			novoSalario = salario + (0.08f * salario);
			System.out.println("Nome: " + nome);
			System.out.println("Cargo: Tecnico de TI");
			System.out.printf("Salário: R$ %.2f%n", novoSalario);
			break;
		default:
			System.out.println("Opção inválida");
		}

	}

}
