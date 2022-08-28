package Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro salario: ");
		String salario1 = sc.next().replace(",", ".");
		System.out.println("Digite o segundo salario: ");
		String salario2 = sc.next().replace(",", ".");
		System.out.println("Digite o terceiro salario: ");
		String salario3 = sc.next().replace(",", ".");

		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);

		double media = sal1 + sal2 + sal3 / 3;

		System.out.println("A média dos salários é: " + media);

		sc.close();

	}

}
