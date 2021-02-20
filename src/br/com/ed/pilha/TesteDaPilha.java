package br.com.ed.pilha;

import java.util.Stack;

public class TesteDaPilha {
	
	public static void main(String[] args) {
	   Pilha pilha = new Pilha();
	   
	   pilha.insere("Bruno");
	   
	   System.out.println(pilha);
	   
	   pilha.insere("Guilherme");
	   
	   System.out.println(pilha);
	   
	   String r1 = pilha.remove();
	   System.out.println(r1);
	   
	   String r2 = pilha.remove();
	   System.out.println(r2);
	   
	   System.out.println(pilha);
	   
	   //Push está inserindo
	   Stack<String> stack = new Stack<String>();
	   stack.push("Bruno");
	   stack.push("Matheus");
	   stack.push("Daniel");
	   stack.push("Elton");
	   
	   //Pop está removendo
	   System.out.println(stack.pop());
	   
	   //Pick se indica quem ele retira
	}

}
