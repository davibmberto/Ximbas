package aula.tools;

public class LCInteiro {

	public int[] LCInteiro;

	private int nElem;

	public LCInteiro(int tamanho) {
		this.LCInteiro = new int[tamanho];
		this.nElem = 0;
	}

	public Integer getNum(int posicao) {
		if (posicao >= 0 && posicao < nElem) {
			return LCInteiro[posicao];
		}
		return null;
	}

	public int getElem() {
		return nElem;
	}

	public int tamanho() {
		return LCInteiro.length;
	}

	public boolean eVazio() {
		return (nElem == 0);
	}

	public boolean eCheio() {
		return (nElem == LCInteiro.length);
	}

	public int pesquisa(int num) {
		for (int i = 0; i < nElem; i++) {
			if (LCInteiro[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	// public int insere(int num, int posicao) {}
	
	public int insere(int num, int posicao) {
		
		if(eCheio()) {return -1;}
		
		
		if(posicao >= LCInteiro.length  || posicao < 0) {return -2;}
		
		
		for(int i = nElem; i > posicao ; i--) {
			LCInteiro[i] = LCInteiro[i-1];
		}
		LCInteiro[posicao] = num;
		
		nElem++;
		return 0;
	}
	

	public int insereFim(int num) {
		if (eCheio()) {
			System.out.println("Lista Cheia!");
			return -1;
		}
		
		LCInteiro[nElem++] = num;
		
		return 0;
	}

	public boolean remove(int num) {
		for (int i = 0; i < nElem; i++) {

			if (num == LCInteiro[i]) {
				LCInteiro[i] = LCInteiro[--nElem];
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String string = "LCInteiro:  ";

		for (int i = 0; i < nElem; i++) {
			string = string + "  " + String.valueOf(LCInteiro[i]);
		}
		
		return string;
	}
	
	
	
	
	
	
	
}
