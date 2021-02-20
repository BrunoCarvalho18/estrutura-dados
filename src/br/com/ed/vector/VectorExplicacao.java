package br.com.ed.vector;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorExplicacao{
	
	//O vector ele é thread-safe o arraylist não
	//Threads são processos
	//A jvm cria thread para executar um programa java 
	//Quando dois processos ficam concorrentes na sua aplicação você pode usar thread
	public static void main(String[] args) {
		List<String> vectorvsarray = new Vector<String>();
		vectorvsarray.add("Bruno");
		vectorvsarray.add("Elton");
		vectorvsarray.add("Daniel");
		
		
		List<String> resultado = 
				vectorvsarray.stream().
				filter(linha -> !"Bruno".equals(linha)).collect(Collectors.toList());
		
		resultado.forEach(System.out::println);

		
	}

}
