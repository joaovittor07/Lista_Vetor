package Lista_de_Vetor;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/* Faça um programa que tenha como entrada várias palavras separadas por;
		   (rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma 
		   em uma posição do vetor */
		
		    Scanner s = new Scanner(System.in);

	        System.out.print("Digite várias palavras separadas por ';': ");
	        String entrada = s.nextLine();

	        String[] palavras = entrada.split(";");

	        System.out.println("Palavras armazenadas no vetor:");
	       
	        for (String palavra : palavras) {
	        
	        	System.out.println(palavra);
	        
	        }

	        s.close();
		
	}

}
