package cap_5exercicios;

import java.util.Scanner;

public class EX0005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double  preco = 0;
		double produto1 = 4.00, produto2 = 4.50, produto3 = 5.00, produto4 = 2.00, produto5 = 1.50;
				
		System.out.print("Digite o codigo do produto: ");
		double codigo = sc.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		double quantidade = sc.nextDouble();
		
		if (codigo == 1) {
			preco = quantidade * produto1;			
		}
		else if (codigo == 2) {
			preco = quantidade * produto2;			
		}
		else if (codigo == 3) {
			preco = quantidade * produto3;		
		}
		else if (codigo == 4) {
			preco = quantidade * produto4;
		}
		else if(codigo == 5) {
			preco = quantidade * produto5;			
		}
		System.out.printf("Total: R$ %.2f%n", preco);
		sc.close();
	}
		
}
