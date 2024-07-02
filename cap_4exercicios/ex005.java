package cap_4exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex005 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
			Locale.setDefault(Locale.US);   
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Digite o código do seu primeiro produto: ");
		    int codigoProduto1 = sc.nextInt();

		    System.out.print("Digite o número de peças do seu primeiro produto: ");
		    int numeroPecas1 = sc.nextInt();

		    System.out.print("Digite o valor da primeira peça: ");
		    double valorDasPecas1 = sc.nextDouble();

		    System.out.print("Digite o código do produto do seu segundo produto: ");
		    int codigoProduto2 = sc.nextInt();

		    System.out.print("Digite o número de peças do seu segundo produto: ");
		    int numeroPecas2 = sc.nextInt();

		    System.out.print("Digite o valor da segunda peça: ");
		    double valorDasPecas2 = sc.nextDouble();

		    double preco = (numeroPecas1 * valorDasPecas1) + (numeroPecas2 * valorDasPecas2);

		    System.out.printf("VALOR A PAGAR: R$ %.2f%n", preco);

		    sc.close();
	}

}
