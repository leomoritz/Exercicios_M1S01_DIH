package ExercicioSemana1;

import java.util.Scanner;

public class ExercicioAulaSextaFeira {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int numeroEntrada = 0;
		int maior = 0;
		/*int menor = Integer.MAX_VALUE; n�o preciso dessa vari�vel, porque o 
		valor negativo j� ser� o menor valor informado consequentemente.*/
		
		do {
			
			System.out.println("Digite um n�mero de entrada");
			numeroEntrada = sc.nextInt();
			
			if(numeroEntrada > maior) {
				maior = numeroEntrada;
			}
			
		}while (numeroEntrada >= 0);
		
		System.out.println("O maior valor informado foi: " + maior);
		
		System.out.println("O n�mero negativo informado foi: " + numeroEntrada);
		
		sc.close();

	}

}
