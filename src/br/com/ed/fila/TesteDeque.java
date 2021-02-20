package br.com.ed.fila;

import java.util.Deque;
import java.util.LinkedList;

public class TesteDeque {

	public static void main(String[] args) {

		Deque<String> deque = new LinkedList<String>();
		deque.addFirst("Bruno");
		deque.addLast("Daniel");

		System.out.println(deque);

		Deque<String> outraDeque = new LinkedList<String>();

		outraDeque.addLast("Elton");
		outraDeque.addFirst("Daniel");

		System.out.println(outraDeque);

		//for each com lamba
		deque.forEach(s -> System.out.println("for each deque com o lambda: " + s));
		outraDeque.forEach(s -> System.out.println("for each outradeque com o lambda: " + s));
		outraDeque.forEach((String s) -> System.out.println("exemplificando não inferencia do tipos: " +s));
		
		
		for( String item: deque) {
			System.out.println("forma tradicional: " + item);
		}

	    deque.clear();
	    outraDeque.clear();

		if (deque.isEmpty()) {
			System.out.println("deque está vazia");
		}
		if(outraDeque.isEmpty()) {
			System.out.println("outra deque está fazia");
		}
		else {
			System.out.println("a lista não está vazia");

		}
		
		System.out.println("============================================");
		System.out.println("Finalizou");

	}
	

}
