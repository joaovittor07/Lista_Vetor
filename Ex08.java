package Lista_de_Vetor;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* Dado um vetor contendo todas as letras do nosso alfabeto (minúsculas) gere 
		   uma senha para o usuário. Para isto o usuário deve informar o tamanho da 
		   senha que deseja, este tamanho deve ser menor que a quantidade de letras no 
		   vetor. A senha gerada deve seguir o padrão consoante+vogal para tamanhos 
		   pares e consoante+vogal e terminada em consoante para tamanhos ímpares. */
		
		Scanner s = new Scanner(System.in);

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        System.out.print("Digite o tamanho da senha (deve ser menor que 26): ");
        int tamanhoSenha = s.nextInt();

        if (tamanhoSenha >= 1 && tamanhoSenha < alfabeto.length) {
            
        	String senha = gerarSenha(alfabeto, tamanhoSenha);
            
        	System.out.println("Senha gerada: " + senha);
        
        } else {
        
        	System.out.println("Tamanho da senha inválido.");
        }

        s.close();
    }

    public static String gerarSenha(char[] alfabeto, int tamanho) {
        
    	StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            
        	if (i % 2 == 0) { // índices pares - consoantes
               
        		senha.append(getConsoante(alfabeto));
            
        	} else { // índices ímpares - vogais
            
        		senha.append(getVogal(alfabeto));
            }
        }

        if (tamanho % 2 != 0) { // Tamanho ímpar - adicionar consoante ao final
            
        	senha.append(getConsoante(alfabeto));
        }

        return senha.toString();
    }

    public static char getConsoante(char[] alfabeto) {
        
    	char consoante;
        
    	do {
        
    		consoante = alfabeto[(int) (Math.random() * alfabeto.length)];
        
    	} while (consoante == 'a' || consoante == 'e' || consoante == 'i' || consoante == 'o' || consoante == 'u');
        
    	return consoante;
    }

    public static char getVogal(char[] alfabeto) {
        
    	char vogal;
        
    	do {
        
    		vogal = alfabeto[(int) (Math.random() * alfabeto.length)];
        
    	} while (vogal != 'a' && vogal != 'e' && vogal != 'i' && vogal != 'o' && vogal != 'u');
        
    	return vogal;

	}

}
