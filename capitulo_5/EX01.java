package capitulo_5;

import java.util.Locale;
import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double not1, not2, notaFinal;
		
		System.out.print("Digite a primeira nota: ");
		not1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		not2 = sc.nextDouble();
		
		notaFinal = not1 + not2;
		
		if (notaFinal >= 60.0) {
			System.out.print("NOTA FINAL = " + notaFinal + " APROVADO!");
		}
		else if(notaFinal < 60.0) {
			System.out.println("NOTA FINAL = " + notaFinal + " REPROVADO");
		}
		sc.close();
	}

}
