package cap_4exercicios;

import java.util.Scanner;

public class ex0006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);

	        int numero;

	        System.out.print("Digite um número: ");
	        numero = sc.nextInt();

	        if (numero > -1 ) {
	            System.out.println("Não negativo"); 
	        }
	        else {
	            System.out.println("Negativo");
	        }

	        sc.close();
	    }
	
	}