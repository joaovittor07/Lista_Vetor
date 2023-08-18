package Lista_de_Vetor;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		/* Fa�a um programa que use um vetor de tamanho N (constante), pe�a ao usu�rio 
		   para informar os valores que devem ser validados, somente devem ser aceitos 
		   valores entre 0 e 20 (inclusive 0 e 20). Ap�s isto deve ser gerado um gr�fico 
		   com cada um dos valores conforme o exemplo abaixo (levando em considera��o que 
		   os valores informados no vetor foram 4, 2 e 1) */
		
		Scanner s = new Scanner(System.in);

        final int N = 5; // Tamanho constante do vetor
        int[] valores = new int[N];

        System.out.println("Digite " + N + " valores entre 0 e 20:");

        for (int i = 0; i < N; i++) {
            
        	System.out.print("Valor " + (i + 1) + ": ");
            
        	int valor = s.nextInt();

            if (valor >= 0 && valor <= 20) {

            	valores[i] = valor;
            
            } else {
            
            	System.out.println("Valor fora do intervalo permitido. Digite novamente.");
                
            	i--; // Para repetir a leitura do mesmo �ndice
         
            }
        }

        System.out.println("\nGr�fico de barras:");

        for (int i = 0; i < N; i++) {

        	System.out.print(i + " (" + valores[i] + "): ");
            
        	for (int j = 0; j < valores[i]; j++) {
            
        		System.out.print("#");
            
        	}
            
        	System.out.println();
        
        }

        s.close();
		
	}

}