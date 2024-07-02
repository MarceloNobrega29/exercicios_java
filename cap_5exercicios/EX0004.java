package cap_5exercicios;

import java.util.Scanner;

public class EX0004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	int duracao;
	
	System.out.println("Digite a hora inicial: ");
	int horaInicial = sc.nextInt();
	
	System.out.println("Digite a hora Final: ");
	int horaFinal = sc.nextInt();
	
	if (horaInicial < horaFinal) {
		duracao = horaFinal - horaInicial;
	}
	else {
		duracao = 24 - horaInicial + horaFinal;
	}
	
	System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	
	sc.close();
	}
}
