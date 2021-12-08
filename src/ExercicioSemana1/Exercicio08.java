package ExercicioSemana1;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * Analise as afirma��es a seguir e responda se s�o verdadeiras ou 
		 * falsas: 
			A.	O comando �continue� dentro de um loop �while� faz com que 
			o controle seja passado para o pr�ximo bloco de c�digo ap�s o loop. 
			B.	O comando return pode ser utilizado dentro de loops. 
			C.	O comando �break� dentro de um loop �while� faz com que 
			o controle seja passado para a pr�xima itera��o do loop.
		 * 
		 */
		
		/*A - verdadeiro: c�digo abaixo ficar� em loop infinito.
		int i = 1;
		while (i < 10) {
			System.out.println(i + "� loop");
			if (i<10) {
				continue;
			}
			i++;
		}*/
		
		/*B - Falso: la�os n�o s�o m�todos que podem retornar algum valor.
		int i = 1;
		while (i < 10) {
			System.out.println(i + "� loop");
			i++;
			return i; //void methods cannot return a value
		}*/
		
		/*C - Falso: c�digo abaixo sa�ra do la�� while ao encontrar o break.
		int i = 1;
		while (i < 10) {
			System.out.println(i + "� loop");
			if (i<10) {
				break;
			}
			i++;
		}
		
		System.out.println("La�o while finalizado no " + i + "� loop");*/
		
	}

}
