package cap_4exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex_video {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);

	    
	    System.out.print("Digite a largura: ");
	    double largura = sc.nextDouble();
	   
	    System.out.print("Digite o comprimento: ");
	    double comprimento = sc.nextDouble();

	    System.out.print("Digite o metro quadrado: ");
	    double metroQuadrado = sc.nextDouble();

	    double area = comprimento * largura;
	    System.out.printf("A Ârea será igual a %.2f%n", area);

	    double preco = metroQuadrado * area;
	    System.out.printf("O Preço será igual a %.2f%n", preco);

	    sc.close();
	}

}
