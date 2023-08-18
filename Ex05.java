package Lista_de_Vetor;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* Fa�a um Programa que leia 20 n�meros inteiros e armazene-os num vetor. 
		   Armazene os n�meros pares no vetor PAR e os n�meros IMPARES no vetor 
		   impar. Imprima os tr�s vetores. */
		
		Scanner s = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] par = new int[20];   // Considerando que todos os n�meros podem ser pares
        int[] impar = new int[20]; // Considerando que todos os n�meros podem ser �mpares
        int countPar = 0;
        int countImpar = 0;

        System.out.println("Digite 20 n�meros inteiros:");

        for (int i = 0; i < 20; i++) {
        
        	System.out.print("N�mero " + (i + 1) + ": ");
            
        	numeros[i] = s.nextInt();

            if (numeros[i] % 2 == 0) {

            	par[countPar++] = numeros[i];
            
            } else {
            
            	impar[countImpar++] = numeros[i];
            
            }
        }

        System.out.println("N�meros digitados:");

        for (int i = 0; i < 20; i++) {
        
        	System.out.print(numeros[i] + " ");
        }

        System.out.println("\nN�meros pares:");

        for (int i = 0; i < countPar; i++) {
        
        	System.out.print(par[i] + " ");
        }

        System.out.println("\nN�meros �mpares:");

        for (int i = 0; i < countImpar; i++) {
        
        	System.out.print(impar[i] + " ");
        }

        s.close();

	}

}
