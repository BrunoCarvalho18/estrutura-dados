package br.com.ed.hashmap;

import java.util.HashMap;

public class HashMapExercicio {
	
	public static void main(String[] args) {
		 HashMap carros = new HashMap<>();
		 
		 carros.put("chave 1", new String("BMW i8"));
		 carros.put("chave 2", new String("Hyundai Hb20"));	
		 carros.put("chave 3", new String("Chevrolet Onix"));
		 
		 
		 System.out.println(carros.get("chave 1"));
	}

}
