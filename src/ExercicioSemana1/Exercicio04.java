package ExercicioSemana1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, 
		 * pe�a ao usu�rio que digite um n�mero com 2 ou mais casas 
		 * depois da v�rgula, converta esse n�mero para um inteiro e escreva 
		 * o resultado na tela.
		 */
		Locale.setDefault(Locale.US); //para aceitar reais separado por ponto. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero real: ");
		double numeroReal = sc.nextDouble();
		int numeroConvertido = (int) numeroReal;
				
		System.out.println("Voc� digitou: " + numeroReal);
		
		System.out.println("N�mero convertido para inteiro: " + numeroConvertido);
		
		sc.close();

	}

}
