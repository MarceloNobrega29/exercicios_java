package cap_4exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        double raio, resultado; 

        System.out.print("Digite o raio de um circulo: ");
        raio  = sc.nextDouble();

        resultado  =  3.14159 * Math.pow(raio, 2);

        System.out.printf("A area será igual a : %.4f%n ", resultado);
        sc.close();
		
	}

}
