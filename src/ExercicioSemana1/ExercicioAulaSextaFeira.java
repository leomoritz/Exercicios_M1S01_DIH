package ExercicioSemana1;

import java.util.Scanner;

public class ExercicioAulaSextaFeira {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int numeroEntrada = 0;
		int maior = 0;
		/*int menor = Integer.MAX_VALUE; não preciso dessa variável, porque o 
		valor negativo já será o menor valor informado consequentemente.*/
		
		do {
			
			System.out.println("Digite um número de entrada");
			numeroEntrada = sc.nextInt();
			
			if(numeroEntrada > maior) {
				maior = numeroEntrada;
			}
			
		}while (numeroEntrada >= 0);
		
		System.out.println("O maior valor informado foi: " + maior);
		
		System.out.println("O número negativo informado foi: " + numeroEntrada);
		
		sc.close();

	}

}
