package br.com.ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila2 {
	
	public static void main(String[] args) {
		
		Queue<Integer> filaDoJava = new LinkedList<Integer>();
		filaDoJava.add(1);
	    filaDoJava.add(2);
	    filaDoJava.add(3);
		System.out.println(filaDoJava);
		
		filaDoJava.forEach(numero->System.out.println("este sao os numeros da fila: " + numero));
		
		System.out.println(filaDoJava);
		
	}

}
