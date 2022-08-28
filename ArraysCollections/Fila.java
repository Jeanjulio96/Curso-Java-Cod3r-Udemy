package ArraysCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila
		// Diferenca é o comportamento quando a fila está cheia!
		fila.add("Ana"); // Retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Gui");
		
		
		// Peek e Element -> Obter o proximo elemento da fila (sem remover)
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.element()); // Lança uma exceção
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();
		
		// Poll e Remove -> Obter o proximo elemento da fila e remove!
		// // Diferença é o comportamento ocorre quando a fila está vazia!
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}

}
