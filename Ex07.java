package Lista_de_Vetor;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/* Fa�a um Programa que leia um vetor de 5 n�meros inteiros, mostre a 
		   soma, a multiplica��o e os n�meros. */
		
		Scanner s = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 n�meros inteiros:");

        for (int i = 0; i < 5; i++) {
         
        	System.out.print("N�mero " + (i + 1) + ": ");
            
        	numeros[i] = s.nextInt();
        }

        int soma = 0;
        int multiplicacao = 1;

        System.out.println("N�meros informados:");

        for (int i = 0; i < 5; i++) {
        
        	System.out.print(numeros[i] + " ");
            
        	soma += numeros[i];

        	multiplicacao *= numeros[i];
        }

        System.out.println("\nSoma dos n�meros: " + soma);
        System.out.println("Multiplica��o dos n�meros: " + multiplicacao);

        s.close();
		
	}

}
