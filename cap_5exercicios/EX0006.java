package cap_5exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EX0006 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double valor = sc.nextDouble();
				
		if (valor >= 0 & valor <= 25.00) {
			System.out.print("Intervalo  (0,25]");
		}
		
		else if (valor >= 25.01 & valor <= 50.00) {
			System.out.print("Intervalo 25,50]");
		}
		
		else if (valor >= 50.01 & valor <= 75.00) {
			System.out.print("Intervalo 50,75]");
		}
		else if (valor >= 75.01 & valor <= 100.01) {
			System.out.print("Intervalo 75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}

}
