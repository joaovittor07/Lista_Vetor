package Lista_de_Vetor;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia um vetor de 5 n�meros inteiros e mostre-os.
		
		Scanner s = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 n�meros inteiros:");

        for (int i = 0; i < 5; i++) {
           
        	System.out.print("N�mero " + (i + 1) + ": ");
            
        	numeros[i] = s.nextInt();
        }

        System.out.println("N�meros informados:");

        for (int i = 0; i < 5; i++) {

        	System.out.println(numeros[i]);
        }

        s.close();
		
	}

}
