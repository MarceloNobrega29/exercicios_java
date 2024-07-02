package capitulo_5;

public class Ex_aula39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preco = 19.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.printf("%.4f%n" ,desconto);
	}

}
