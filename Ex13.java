package Lista_de_Vetor;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/* Faça um Programa que leia dois vetores com 10 elementos cada. Gere um 
		   terceiro vetor de 20 elementos, cujos valores deverão ser compostos 
		   pelos elementos intercalados dos dois outros vetores. */
		
		Scanner s = new Scanner(System.in);

        int tamanho = 10;
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorIntercalado = new int[tamanho * 2];

        System.out.println("Digite os elementos do primeiro vetor:");
       
        for (int i = 0; i < tamanho; i++) {
        
        	System.out.print("Elemento " + (i + 1) + ": ");
            
        	vetor1[i] = s.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        
        for (int i = 0; i < tamanho; i++) {
       
        	System.out.print("Elemento " + (i + 1) + ": ");
            
        	vetor2[i] = s.nextInt();
        }

        int indexVetorIntercalado = 0;
        
        for (int i = 0; i < tamanho; i++) {
        
        	vetorIntercalado[indexVetorIntercalado++] = vetor1[i];
            
        	vetorIntercalado[indexVetorIntercalado++] = vetor2[i];
        }

        System.out.println("Vetor intercalado:");

        for (int i = 0; i < tamanho * 2; i++) {
        
        	System.out.print(vetorIntercalado[i] + " ");
        
        }

        s.close();

	}

}
