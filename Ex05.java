package Lista_de_Vetor;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* Faça um Programa que leia 20 números inteiros e armazene-os num vetor. 
		   Armazene os números pares no vetor PAR e os números IMPARES no vetor 
		   impar. Imprima os três vetores. */
		
		Scanner s = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] par = new int[20];   // Considerando que todos os números podem ser pares
        int[] impar = new int[20]; // Considerando que todos os números podem ser ímpares
        int countPar = 0;
        int countImpar = 0;

        System.out.println("Digite 20 números inteiros:");

        for (int i = 0; i < 20; i++) {
        
        	System.out.print("Número " + (i + 1) + ": ");
            
        	numeros[i] = s.nextInt();

            if (numeros[i] % 2 == 0) {

            	par[countPar++] = numeros[i];
            
            } else {
            
            	impar[countImpar++] = numeros[i];
            
            }
        }

        System.out.println("Números digitados:");

        for (int i = 0; i < 20; i++) {
        
        	System.out.print(numeros[i] + " ");
        }

        System.out.println("\nNúmeros pares:");

        for (int i = 0; i < countPar; i++) {
        
        	System.out.print(par[i] + " ");
        }

        System.out.println("\nNúmeros ímpares:");

        for (int i = 0; i < countImpar; i++) {
        
        	System.out.print(impar[i] + " ");
        }

        s.close();

	}

}
