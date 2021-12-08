package ExercicioSemana1;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, 
		 * peça ao usuário que digite um nome qualquer, e em seguida 
		 * escreva na tela o tamanho de letras que o nome possui.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um nome qualquer: ");
		String nomeQualquer = sc.nextLine();
		
		System.out.println("A quantidade de letras é: " 
		+ nomeQualquer.length());
		
		sc.close();

	}

}
