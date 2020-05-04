package br.com.ed.listalig;

public class ListaLigada {

	private Celula primeiro = null;
	private Celula ultimo = null;
	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		if (this.totalDeElementos == 0) {
			Celula novo = new Celula(elemento);
			this.primeiro = novo;
			this.ultimo = novo;
		} else {
			Celula novo = new Celula(this.primeiro, elemento);
			this.primeiro.setAnterior(novo);
			this.primeiro = novo;
		}
		this.totalDeElementos++;
	}

	@Override
	public String toString() {

		if (this.totalDeElementos == 0) {
			return "[]";
		}
		Celula atual = primeiro;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();
	}

	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultimo.setProximo(nova);
			nova.setAnterior(this.ultimo);
			this.totalDeElementos++;
		}

	}

	public Celula pegaCelula(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posição inexistente");
		}

		Celula atual = primeiro;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}

		return atual;
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	public void adiciona(int posicao, Object elemento) {

		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProximo();

			Celula nova = new Celula(anterior.getProximo(), elemento);
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			this.totalDeElementos++;
		}
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco() {
		if (this.totalDeElementos == 0) {
			throw new IllegalArgumentException("lista vazia");
		}
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public void removeFim() {
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultimo.getAnterior();
			penultima.setAnterior(null);
			this.ultimo = penultima;
			this.totalDeElementos--;
		}
	}
	
	public void remove(int posicao) {
		if(posicao==0) {
			this.removeDoComeco();
		}else if(posicao ==this.totalDeElementos-1) {
			this.removeFim();	
		} else {
			Celula anterior = this.pegaCelula(posicao -1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			anterior.setAnterior(anterior);
			
			this.totalDeElementos--;
		}
	}
	
	public boolean contem(Object elemento) {
		Celula atual  = this.primeiro;
		
		while(atual!=null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			
			atual = atual.getProximo();
		}
		
		return false;
	}

}
