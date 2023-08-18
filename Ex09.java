package Lista_de_Vetor;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/* Faça um programa que peça um texto e coloque-o em um vetor onde cada 
		   carácter ocupará uma posição do vetor. */
		
		Scanner s = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = s.nextLine();

        char[] vetorTexto = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
       
        	vetorTexto[i] = texto.charAt(i);
        }

        System.out.println("Texto armazenado no vetor:");
        
        for (char c : vetorTexto) {
       
        	System.out.print(c + " ");
        }

        s.close();
		
	}

}
