package ExercicioSemana1;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, 
		 * calcule o fatorial de um número inteiro de 0 a 10. 
		 * O programa deve pedir para o usuário inserir um número inteiro,
		 * mas só deve aceitar valores de 0 a 10, e então deve calcular o 
		 * fatorial desse número e escrever o resultado na tela.
		 * */

		Scanner sc = new Scanner(System.in);

		int numero;
		int fatorial = 1;
		int aux;
		
		do {
			System.out.println("Informe um número inteiro de 0 a 10");
			numero = sc.nextInt();			
		} while (numero < 0 && numero > 10);
		
		aux = numero;
		
		for(int i = 1; i <= numero ; i++) {
			fatorial = fatorial * aux;
			aux--;
		}
		
		System.out.println("O fatorial de " + numero + " é : " + fatorial);
		
		sc.close();
		
		

	}

}
