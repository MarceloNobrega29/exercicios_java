package cap_4exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);   
	    Scanner sc = new Scanner(System.in);
	    

	    System.out.print("Digite o número do funcionário: ");
	    int nfun = sc.nextInt();

	    System.out.print("Seu número de horas trabalhadas: ");
	    int horast = sc.nextInt();

	    System.out.print("O valor por horas trabalhadas: ");
	    double valorhoras = sc.nextDouble();

	    double salario = horast * valorhoras;
	    System.out.println("Number = " + nfun);
	    System.out.printf("Salary = %.2f%n  ", salario);

	    sc.close();
	}

}
