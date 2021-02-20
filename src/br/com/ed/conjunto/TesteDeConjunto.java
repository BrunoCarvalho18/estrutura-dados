package br.com.ed.conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteDeConjunto {
	
	public static void main(String[] args) {
	
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Bruno");
		System.out.println(conjunto);
		
		conjunto.adiciona("Bruno");
		System.out.println(conjunto);
		
		conjunto.adiciona("Bruno");
		conjunto.adiciona("Matheus");
		
		conjunto.remover("Mauricio");
		System.out.println(conjunto);
		
		Set<String> conjuntoDoJava = new HashSet<String>();
		conjuntoDoJava.add("Bruno");
		conjuntoDoJava.add("Paulo");
		conjuntoDoJava.add("Bruno");
		conjuntoDoJava.add("Daniel");
		conjuntoDoJava.add("Elton");
		
		System.out.println(conjuntoDoJava);
		
		String x = "Guilherme";
		x.hashCode();
		
		String y = "Bruno";
		y.hashCode();
		
		System.out.println("Guilherme".hashCode());
		System.out.println("Guilherme".hashCode());
		System.out.println("Bruno".hashCode());
		System.out.println("Bruno".hashCode());
	}

}
