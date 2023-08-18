package Lista_de_Vetor;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Faça um Programa que leia um vetor de 10 caracteres, e diga quantas 
		   consoantes foram lidas. Imprima as consoantes. */
		   
		Scanner s = new Scanner(System.in);

        char[] caracteres = new char[10];
       
        int countConsoantes = 0;

        System.out.println("Digite 10 caracteres:");

        for (int i = 0; i < 10; i++) {

        	System.out.print("Caractere " + (i + 1) + ": ");
            
        	caracteres[i] = s.next().charAt(0);

            if (isConsoante(caracteres[i])) {

            	countConsoantes++;
            }
        }

        System.out.println("Consoantes lidas:");

        for (int i = 0; i < 10; i++) {
        
        	if (isConsoante(caracteres[i])) {
            
        		System.out.print(caracteres[i] + " ");
            }
        }

        System.out.println("\nTotal de consoantes: " + countConsoantes);

        s.close();
    }

    public static boolean isConsoante(char c) {

    	c = Character.toLowerCase(c);
        
    	return c >= 'a' && 
    		   c <= 'z' && 
    		   c != 'a' && 
    		   c != 'e' && 
    		   c != 'i' && 
    		   c != 'o' && 
    		   c != 'u';
		   
	}

}
