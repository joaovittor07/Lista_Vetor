package Lista_de_Vetor;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/* Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene 
		   num vetor a média de cada aluno, imprima o número de alunos com média maior 
		   ou igual a 7.0 */
		
		 	Scanner s = new Scanner(System.in);

	        int numAlunos = 10;
	        double[] medias = new double[numAlunos];
	        int countAlunosAprovados = 0;

	        for (int i = 0; i < numAlunos; i++) {
	           
	        	System.out.println("Aluno " + (i + 1));
	            
	        	double somaNotas = 0;
	            
	        	for (int j = 0; j < 4; j++) {
	            
	        		System.out.print("Digite a nota " + (j + 1) + ": ");
	             
	        		somaNotas += s.nextDouble();
	            }
	            
	        	medias[i] = somaNotas / 4;
	            
	            if (medias[i] >= 7.0) {
	         
	            	countAlunosAprovados++;
	            }
	        }

	        System.out.println("Número de alunos com média maior ou igual a 7.0: " + countAlunosAprovados);

	        s.close();
		
	}

}
