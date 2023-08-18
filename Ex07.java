package Lista_de_Vetor;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/* Faça um Programa que leia um vetor de 5 números inteiros, mostre a 
		   soma, a multiplicação e os números. */
		
		Scanner s = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
         
        	System.out.print("Número " + (i + 1) + ": ");
            
        	numeros[i] = s.nextInt();
        }

        int soma = 0;
        int multiplicacao = 1;

        System.out.println("Números informados:");

        for (int i = 0; i < 5; i++) {
        
        	System.out.print(numeros[i] + " ");
            
        	soma += numeros[i];

        	multiplicacao *= numeros[i];
        }

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);

        s.close();
		
	}

}
