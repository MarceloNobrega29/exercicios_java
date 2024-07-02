package capitulo_5;

import java.util.Locale;
import java.util.Scanner;

public class Ex_aula37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double conta = 50.00;
		
		System.out.print("Digite a quantidade de minutos consumidos: ");
		double min = sc.nextDouble();
		
		if (min > 100.00) {
			conta = conta + (min - 100) * 2;	
			
			/* Também podemos fazer da seguinte forma
			conta += (min - 100) * 2;
			 Ambos estão certos */
		}
		System.out.printf("Valor a pagar: R$ %.2f%n" , conta);
		
		sc.close();
	}

}
