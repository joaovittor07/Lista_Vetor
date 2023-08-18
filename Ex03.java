package Lista_de_Vetor;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
		
		Scanner s = new Scanner(System.in);

        double[] notas = new double[4];

        System.out.println("Digite as 4 notas:");

        for (int i = 0; i < 4; i++) {
       
        	System.out.print("Nota " + (i + 1) + ": ");
            
        	notas[i] = s.nextDouble();
        }

        double somaNotas = 0;

        for (int i = 0; i < 4; i++) {
        
        	somaNotas += notas[i];
        }

        double media = somaNotas / 4;

        System.out.println("Notas informadas:");

        for (int i = 0; i < 4; i++) {
        
        	System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Média: " + media);

        s.close();

	}

}
