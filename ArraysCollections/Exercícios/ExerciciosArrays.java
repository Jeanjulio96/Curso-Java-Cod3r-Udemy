package ArraysCollections.Exercícios;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosArrays {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas serão calculadas?");
		int n = sc.nextInt();
		
		double [] notas = new double [n];
		
		for (int i=0; i<notas.length; i++) {
			System.out.printf("Digite o valor da %d nota:\n", i + 1);
			notas[i] = sc.nextDouble();
		}
		
		double total = 0;
		
		for (double nota: notas) {
			total += nota;
		}
		
		System.out.println("Média de notas: " + String.format("%.2f", total / notas.length));
		
		sc.close();
	}

}
