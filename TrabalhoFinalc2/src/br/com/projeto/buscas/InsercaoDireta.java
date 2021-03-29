package br.com.projeto.buscas;

public class InsercaoDireta {
	String crescente = "crescente";
	String decrescente = "decrescente";
	String aleatoria = "aleatoria";
	
	public void executa(int quantidade) {
		insercaoDireta(crescente(quantidade), crescente );
		insercaoDireta(decrescente(quantidade), decrescente);
		insercaoDireta(aleatorio(quantidade), aleatoria);
	}
	
	public void insercaoDireta(int[] vetor, String tipoVetor) {
		int j;
		int key;
		int i;
		int mov = 0 , comp = 0;

		for (j = 1; j < vetor.length; j++) {
			key = vetor[j];
			mov++;
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				comp++;
				vetor[i + 1] = vetor[i];
				mov++;
			}
			comp++;
			vetor[i + 1] = key;
			mov++;
		}
		System.out.println("Movimentações "+ tipoVetor + ": "+ mov);
		System.out.println("Comparações "+ tipoVetor + ": " +comp);
		System.out.println();

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
