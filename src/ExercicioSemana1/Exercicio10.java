package ExercicioSemana1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Crie um software q verifica se um num inserido pelo usu�rio � primo.

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um n�mero para saber se ele � primo: ");
		int numero = sc.nextInt();
		int qtdDivisor = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				qtdDivisor++;
			}
		}
		
		if (qtdDivisor == 2) {
			System.out.println("� primo");
		}else {
			System.out.println("� composto");
		}
		
		sc.close();

	}

}
