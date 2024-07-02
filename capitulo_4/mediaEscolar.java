package capitulo_4;

import java.util.Scanner;

public class mediaEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

	    System.out.print("Digite a primeira nota: ");
	    double nota1 = sc.nextDouble();

	    System.out.print("Digite a segunda nota: ");
	    double nota2 = sc.nextDouble();

	    System.out.print("Digite a terceira nota: ");
	    double nota3 = sc.nextDouble();

	    double media = (nota1 + nota2 + nota3) / 3;
	    System.out.printf("A sua média sera: %.2f%n ", media);

	    sc.close();
	}

}
