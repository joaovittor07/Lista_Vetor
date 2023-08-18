package Lista_de_Vetor;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/* Faça um Programa que peça a idade e a altura de 5 pessoas, armazene 
		   cada informação no seu respectivo vetor. Imprima a idade e a altura 
		   na ordem inversa a ordem lida. Mostrar também idade e altura do mais 
		   velho, mais novo, mais baixo e mais alto. Mostrar idade e altura de 
		   quem está abaixo e acima da média de idade e altura; */
		
		Scanner s = new Scanner(System.in);

        int numPessoas = 5;
        int[] idades = new int[numPessoas];
        double[] alturas = new double[numPessoas];
        int somaIdades = 0;
        double somaAlturas = 0;

        for (int i = 0; i < numPessoas; i++) {
            
        	System.out.println("Pessoa " + (i + 1));
            
        	System.out.print("Digite a idade: ");
            
        		idades[i] = s.nextInt();
            
        	System.out.print("Digite a altura: ");
            
        		alturas[i] = s.nextDouble();
            
        		somaIdades += idades[i];
            
        		somaAlturas += alturas[i];
        }

        System.out.println("\nIdades e alturas na ordem inversa:");

        for (int i = numPessoas - 1; i >= 0; i--) {
            
        	System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }

        int maisVelho = idades[0];
        int maisNovo = idades[0];
        double maisAlto = alturas[0];
        double maisBaixo = alturas[0];

        for (int i = 1; i < numPessoas; i++) {

        	if (idades[i] > maisVelho) {
            
        		maisVelho = idades[i];
            }
            if (idades[i] < maisNovo) {
             
            	maisNovo = idades[i];
            }
            if (alturas[i] > maisAlto) {
             
            	maisAlto = alturas[i];
            }
            if (alturas[i] < maisBaixo) {
             
            	maisBaixo = alturas[i];
            }
        }

        System.out.println("\nMais velho: " + maisVelho + " anos");
        System.out.println("Mais novo: " + maisNovo + " anos");
        System.out.println("Mais alto: " + maisAlto + " metros");
        System.out.println("Mais baixo: " + maisBaixo + " metros");

        double mediaIdades = (double) somaIdades / numPessoas;
        double mediaAlturas = somaAlturas / numPessoas;

        System.out.println("\nMédia de idade: " + mediaIdades + " anos");
        System.out.println("Média de altura: " + mediaAlturas + " metros");

        System.out.println("\nPessoas acima da média de idade:");

        for (int i = 0; i < numPessoas; i++) {
        
        	if (idades[i] > mediaIdades) {
            
        		System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\nPessoas acima da média de altura:");

        for (int i = 0; i < numPessoas; i++) {
        
        	if (alturas[i] > mediaAlturas) {
            
        		System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\nPessoas abaixo da média de idade:");

        for (int i = 0; i < numPessoas; i++) {
        
        	if (idades[i] < mediaIdades) {
            
        		System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\nPessoas abaixo da média de altura:");

        for (int i = 0; i < numPessoas; i++) {
        
        	if (alturas[i] < mediaAlturas) {
            
        		System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        s.close();
		
	}

}
