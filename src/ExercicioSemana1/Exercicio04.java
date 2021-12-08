package ExercicioSemana1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, 
		 * peça ao usuário que digite um número com 2 ou mais casas 
		 * depois da vírgula, converta esse número para um inteiro e escreva 
		 * o resultado na tela.
		 */
		Locale.setDefault(Locale.US); //para aceitar reais separado por ponto. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número real: ");
		double numeroReal = sc.nextDouble();
		int numeroConvertido = (int) numeroReal;
				
		System.out.println("Você digitou: " + numeroReal);
		
		System.out.println("Número convertido para inteiro: " + numeroConvertido);
		
		sc.close();

	}

}
