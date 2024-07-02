package cap_5exercicios;

import java.util.Scanner;
public class Ex0002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero  % 2 == 0) {
			System.out.println("Par");
		}
		else  {
			System.out.print("Impar");
		}
		
		sc.close();
	}

}
