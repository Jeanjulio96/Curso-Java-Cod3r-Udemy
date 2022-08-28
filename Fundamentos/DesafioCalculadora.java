package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double num2 = sc.nextDouble();

		System.out.println("Qual operacao aritmetica deseja fazer?: ");
		String op = sc.next();

		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

		sc.close();
	}

}
