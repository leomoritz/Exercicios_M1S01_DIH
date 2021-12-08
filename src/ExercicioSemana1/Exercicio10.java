package ExercicioSemana1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Crie um software q verifica se um num inserido pelo usuário é primo.

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número para saber se ele é primo: ");
		int numero = sc.nextInt();
		int qtdDivisor = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				qtdDivisor++;
			}
		}
		
		if (qtdDivisor == 2) {
			System.out.println("É primo");
		}else {
			System.out.println("É composto");
		}
		
		sc.close();

	}

}
