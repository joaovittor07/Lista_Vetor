package Lista_de_Vetor;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/* Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que 
		   determine quantos alunos com mais de 13 anos possuem altura inferior à 
		   média de altura desses alunos. */
		
		Scanner s = new Scanner(System.in);

        int numAlunos = 30;
        int countAlunosMaisDe13 = 0;
        double somaAlturas = 0;

        for (int i = 1; i <= numAlunos; i++) {
            
        	System.out.println("Aluno " + i);
            
        	System.out.print("Digite a idade: ");
            int idade = s.nextInt();
            
            System.out.print("Digite a altura: ");
            double altura = s.nextDouble();

            if (idade > 13) {
                
            	countAlunosMaisDe13++;
                
            	somaAlturas += altura;
            }
        }

        if (countAlunosMaisDe13 > 0) {
            
        	double mediaAlturas = somaAlturas / countAlunosMaisDe13;

            System.out.println("Média de altura dos alunos com mais de 13 anos: " + mediaAlturas);

            int countAlunosComAlturaInferior = 0;
            
            for (int i = 1; i <= numAlunos; i++) {
            
            	System.out.print("Digite a altura do aluno " + i + ": ");
                double altura = s.nextDouble();

                if (altura < mediaAlturas) {
                    
                	countAlunosComAlturaInferior++;
                
                }
            }

            System.out.println("Número de alunos com mais de 13 anos e altura inferior à média de altura: " + countAlunosComAlturaInferior);
       
        } else {
        
        	System.out.println("Não há alunos com mais de 13 anos.");
        
        }

        s.close();
		
	}

}
