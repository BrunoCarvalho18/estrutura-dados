package br.com.ed.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExericicio {

	public static void main(String[] args) {
		Map<String, Integer> carros = new HashMap<>();

		carros.put("BMW i8", 800000);
		carros.put("Chevrolvet Onix", 30000);
		carros.put("Hyundai hb20", 31000);
		
		BiConsumer<String,Integer> acao = new MeuBiConsumer();
		
		carros.forEach(acao);

	}

}
