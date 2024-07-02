package cap_5exercicios;

import java.util.Scanner;
public class Ex0003 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
			
	int n1, n2;
	
	System.out.print("Digite um número: ");
	n1 = sc.nextInt();
	
	System.out.print("Digite outro número: ");
	n2= sc.nextInt();
	
	if (n1 % n2 == 0 || n2 % n1 == 0) {
		System.out.print("São multiplos! ");
	}
	else {
		System.out.print("Não são multiplos! ");
	}
	sc.close();
	}
}
