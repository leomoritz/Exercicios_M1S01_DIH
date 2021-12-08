package ExercicioSemana1;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * Crie um software que oferece ao usuário três sabores diferentes de pizza
		 * fixos (exemplo: mussarela, calabresa, portuguesa) identificadas por um
		 * número. Enquanto o usuário escolher um sabor válido, pergunte se ele deseja
		 * uma nova fatia. Caso contrário, exiba quantas fatias ele comeu e encerre o
		 * programa. Exemplo: “Você deseja uma pizza? Envie “1” para calabresa, “2” para
		 * mussarela, “3” para portuguesa ou “0” caso esteja satisfeito”
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int opcaoPizza;

		do {
			System.out.println("Você deseja uma pizza?\n" 
					+ "Digite 1 para calabresa\n"
					+ "Digite 2 para mussarela\n" 
					+ "Digite 3 para portuguesa\n" 
					+ "Digite 0 caso esteja satisfeito\n");

			opcaoPizza = sc.nextInt();

			switch (opcaoPizza) {
			case 1: {
				System.out.println("Você escolheu pizza de calabresa!\n");
				break;
			}
			case 2: {
				System.out.println("Você escolheu pizza de mussarela!\n");
				break;
			}
			case 3: {
				System.out.println("Você escolheu pizza de portuguesa!\n");
				break;
			}
			case 0: {
				System.out.println("Ficamos felizes pela preferência." 
						+ " Volte sempre!");
				break;
			}
			default:
				throw new IllegalArgumentException("Valor inválido: " 
						+ opcaoPizza);
			}
		} while (opcaoPizza != 0);

		sc.close();

	}

}
