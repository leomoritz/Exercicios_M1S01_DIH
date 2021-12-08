package ExercicioSemana1;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*[M1S01] - Ex 1 - Questão aleatória
		Crie um programa em Java que, ao executar, escreve na tela um 
		número aleatório entre 0 e 1.
		*/
		
		Random random = new Random();
		
		System.out.printf("%.2f", random.nextDouble());	

	}

}
