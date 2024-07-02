package cap_4exercicios;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Digite um valor: " );
	    int valor1 = sc.nextInt();
	    

	    System.out.print("Digite outro valor: ");
	    int valor2 = sc.nextInt();
	    
	    
	    int soma = valor1 + valor2;
	    System.out.println("Soma = " +soma);


	    sc.close();
		
	}

}
