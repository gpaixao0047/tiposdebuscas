package br.com.projeto.buscas;

public class BubbleSort {
	String crescente = "crescente";
	String decrescente = "decrescente";
	String aleatorio = "aleatorio";

	public void executa(int quantidade) {
		bubbleSort(crescente(quantidade), crescente);
		bubbleSort(decrescente(quantidade), decrescente);
		bubbleSort(aleatorio(quantidade), aleatorio);
	}

	public void bubbleSort(int vetor[], String tipoVetor) {
		int comp = 0, mov = 0;
		boolean controle = true;
		int aux;
		for (int j = 0; j < vetor.length; j++) {
			controle = true;
			for (int i = 0; i < vetor.length - 1; i++) {
				comp++;
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					controle = false;
					mov = mov + 3;
				}
			}
			
			if( controle )
				break;
		}
		System.out.println("Comparação " + tipoVetor+": "+ comp);
		System.out.println("Movimentação " + tipoVetor + ": "+  mov);
		System.out.println("     ");
	}

	public int[] crescente(int quantidade) {
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
		}
		return vetor;
	}

	public int[] decrescente(int quantidade) {
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor.length - i;
		}
		return vetor;
	}

	public int[] aleatorio(int quantidade) {
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}
}
