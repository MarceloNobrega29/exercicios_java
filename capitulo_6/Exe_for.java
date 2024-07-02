package capitulo_6;

import java.util.Scanner;

public class Exe_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			soma = soma + X;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
