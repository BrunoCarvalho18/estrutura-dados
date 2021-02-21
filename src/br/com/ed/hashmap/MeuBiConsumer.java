package br.com.ed.hashmap;

import java.util.function.BiConsumer;

public class MeuBiConsumer implements BiConsumer<String, Integer> {

	@Override
	public void accept(String chave, Integer valor) {
		System.out.println("Chave: " + chave + "\tValor: " + valor);

		if ("for".equals(chave)) {
			System.out.println("Isto e " + "o maior valor\n");
		}

	}

}
