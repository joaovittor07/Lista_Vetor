package Lista_de_Vetor;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/* Faça um programa que peça uma data no padrão dd/mm/aaaa, valide esta data 
		   e coloque cada item em uma posição de um vetor de inteiros de tamanho 3. */
		
		Scanner s = new Scanner(System.in);

        System.out.print("Digite uma data no padrão dd/mm/aaaa: ");
        String dataInput = s.nextLine();

        String[] partesData = dataInput.split("/");

        if (partesData.length == 3) {
            int dia = Integer.parseInt(partesData[0]);
            int mes = Integer.parseInt(partesData[1]);
            int ano = Integer.parseInt(partesData[2]);

            if (validarData(dia, mes, ano)) {
             
            	int[] vetorData = {dia, mes, ano};
                
            	System.out.println("Data armazenada no vetor: [" + vetorData[0] + ", " + vetorData[1] + ", " + vetorData[2] + "]");
            
            } else {
           
            	System.out.println("Data inválida.");
           
            }
        
        } else {
        
        	System.out.println("Formato de data inválido.");
        
        }

        s.close();
    }

    public static boolean validarData(int dia, int mes, int ano) {

    	if (ano >= 1 && ano <= 9999 && mes >= 1 && mes <= 12) {
        
    		int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            
    		if (mes == 2 && anoBissexto(ano)) {
            
    			diasPorMes[2] = 29;
            }
         
    		return dia >= 1 && dia <= diasPorMes[mes];
        }
     
    	return false;
    }

    public static boolean anoBissexto(int ano) {

    	return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
		
	}

}
