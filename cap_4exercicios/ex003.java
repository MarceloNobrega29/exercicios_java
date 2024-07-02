package cap_4exercicios;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Digite o valor de A: ");
	    int A = sc.nextInt();

	    System.out.print("Digite o valor de B: ");
	    int B = sc.nextInt();

	    System.out.print("Digite o valor de C: ");
	    int C = sc.nextInt();

	    System.out.print("Digite o valor de D: ");
	    int D = sc.nextInt();

	    int diferenca = (A * B - C * D);
	    System.out.print("Diferença = " + diferenca);

	    sc.close();
		
	}

}
