package Lista_de_Vetor;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pe�a as quatro notas de 10 alunos, calcule e armazene 
		   num vetor a m�dia de cada aluno, imprima o n�mero de alunos com m�dia maior 
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

	        System.out.println("N�mero de alunos com m�dia maior ou igual a 7.0: " + countAlunosAprovados);

	        s.close();
		
	}

}
