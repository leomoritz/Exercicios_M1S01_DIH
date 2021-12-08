package ExercicioSemana1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, 
		 * pe�a ao usu�rio para inserir as notas do semestre, e deve 
		 * retornar a m�dia final. O programa deve pedir 3 notas, 
		 * que devem ser n�meros reais, e retornar um n�mero real com 2 casas
		 * depois da v�rgula, com o texto �Sua m�dia final �:� 
		 * seguido do valor.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double mediaFinal = 0.0;
		double auxSomaNota = 0.0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Informe a " + (i + 1) + "� nota do semestre: ");
			double notaSemestre = sc.nextDouble();
			auxSomaNota += notaSemestre;
		}
		
		mediaFinal = auxSomaNota / 3;
		
		System.out.println("M�dia Final: " + mediaFinal);
		
		sc.close();

	}

}
