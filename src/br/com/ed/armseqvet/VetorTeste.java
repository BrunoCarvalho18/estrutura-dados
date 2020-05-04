package br.com.ed.armseqvet;

public class VetorTeste {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("José");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		
		Aluno x = lista.pega(158);	
		System.out.println(x);
		
		
	}

}
