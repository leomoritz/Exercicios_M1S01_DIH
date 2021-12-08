package ExercicioSemana1;

import java.util.Scanner;

public class Exercicio02 {

	
	public static void main(String[] args) {

		/*
		 * Correlacione TODOS os tipos primitivos com suas respectivas descri��es e
		 * exemplos: Tipos primitivos em Java: (i) boolean; (ii) caracter; (iii)
		 * inteiro; (iv) real. Descri��es: (a) qualquer n�mero inteiro, seja ele
		 * negativo, nulo ou positivo; (b) qualquer conjunto de caracteres
		 * alfanum�ricos; (c) conjunto de valores falso ou verdadeiro. (d) qualquer
		 * n�mero real, seja ele negativo, nulo ou positivo.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tipo primitivo que deseja consultar: \n" 
		+ "(i) boolean;\n" 
		+ "(ii) caracter;\n"
		+ "(iii) inteiro;\n" 
		+ "(iv) real;");

		String tipoPrimitivo = sc.nextLine();

		switch (tipoPrimitivo) {
		case "i": {
			System.out.println("(c) Conjunto de valores falso ou verdadeiro;");
			break;
		}
		case "ii": {
			System.out.println("(b) Qualquer conjunto de caracteres " 
		+ "alfanum�ricos;");
			break;
		}
		case "iii": {
			System.out.println("(a) Qualquer n�mero inteiro, seja ele negativo," 
		+ "nulo ou positivo;");
			break;
		}
		case "iv": {
			System.out.println("(d) qualquer n�mero real, seja ele negativo, " 
		+ "nulo ou positivo.");
			break;
		}
		default:
			sc.close();
			throw new IllegalArgumentException("Valor inesperado: " 
		+ tipoPrimitivo);
		}
		
		sc.close(); /*por que tive que encerrar aqui fora do escopo do switch,
		sendo que qualquer op��o vai passar pelo switch?*/
	}

}
