package capitulo_5;
import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	int a, b, c;
	
	System.out.print("Digite um número: ");
	a = sc.nextInt();
	
	System.out.print("Digite outro número: ");
	b = sc.nextInt();
	
	System.out.print("Digite outro número: ");
	c = sc.nextInt();
			
	if (a <= b & a <= c) {
		System.out.println("MENOR = " + a);
	}
	else if (b <= a && b <= c) {
		System.out.println("MENOR = " + b);
	}
	else {
		System.out.println("MENOR = " + c);
	}
	sc.close();
	}
}