package ExercicioSemana1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, 
		 * pergunte ao usu�rio seu sobrenome, depois seu nome, e ent�o 
		 * escreva na tela, em uma �nica �string�, o nome completo do usu�rio.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = sc.nextLine() + " ";
		System.out.println("Informe o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		String nomeCompleto = nome + sobrenome;
		System.out.println("Nome Completo: " + nomeCompleto);
		
		sc.close();

	}

}
