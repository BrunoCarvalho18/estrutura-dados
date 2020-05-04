package br.com.ed.fila;

import java.util.LinkedList;
import java.util.Queue;

//Fila o primeiro que entra,é o primeiro que sai
public class TesteDaFila {
	
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Bruno");
		fila.adiciona("Matheus");
		
		System.out.println(fila);
		
		String x1= fila.remove();
		System.out.println(x1);

		System.out.println(fila);
		
		Queue<String> filaDoJava = new LinkedList<String>();
		filaDoJava.add("Bruno");
		String x2= filaDoJava.poll();
		
		System.out.println(x2);
		
	}

}
