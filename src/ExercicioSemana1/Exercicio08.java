package ExercicioSemana1;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * Analise as afirmações a seguir e responda se são verdadeiras ou 
		 * falsas: 
			A.	O comando “continue” dentro de um loop “while” faz com que 
			o controle seja passado para o próximo bloco de código após o loop. 
			B.	O comando return pode ser utilizado dentro de loops. 
			C.	O comando “break” dentro de um loop “while” faz com que 
			o controle seja passado para a próxima iteração do loop.
		 * 
		 */
		
		/*A - verdadeiro: código abaixo ficará em loop infinito.
		int i = 1;
		while (i < 10) {
			System.out.println(i + "º loop");
			if (i<10) {
				continue;
			}
			i++;
		}*/
		
		/*B - Falso: laços não são métodos que podem retornar algum valor.
		int i = 1;
		while (i < 10) {
			System.out.println(i + "º loop");
			i++;
			return i; //void methods cannot return a value
		}*/
		
		/*C - Falso: código abaixo saíra do laçõ while ao encontrar o break.
		int i = 1;
		while (i < 10) {
			System.out.println(i + "º loop");
			if (i<10) {
				break;
			}
			i++;
		}
		
		System.out.println("Laço while finalizado no " + i + "º loop");*/
		
	}

}
