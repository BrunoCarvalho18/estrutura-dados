package br.com.ed.listalig;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Bruno");
		nomes.add("Daniel");
		nomes.add("Elton");
		// lambda
		nomes.forEach(nome -> System.out.println("Todos os nomes: " + nome));

		for (String nome : nomes) {
			if (nome == "Daniel") {
				System.out.println(nome);
			}
		}

	}

}
