package Lista_de_Vetor;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* Faça um Programa que leia um vetor de 10 números reais e mostre-os na 
		   ordem inversa a ordem lida. */

		Scanner s = new Scanner(System.in);

        double[] numeros = new double[10];

        System.out.println("Digite 10 números reais:");

        for (int i = 0; i < 10; i++) {
         
        	System.out.print("Número " + (i + 1) + ": ");
            
        	numeros[i] = s.nextDouble();
        }

        System.out.println("Números na ordem inversa:");

        for (int i = 9; i >= 0; i--) {

        	System.out.println(numeros[i]);
        }

        s.close();
		
	}

}
