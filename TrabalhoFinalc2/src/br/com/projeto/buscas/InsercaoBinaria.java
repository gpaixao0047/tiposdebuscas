package br.com.projeto.buscas;

public class InsercaoBinaria {
	String crescente = "crescente";
	String decrescente = "decrescente";
	String aleatoria = "aleatoria";
	int mov = 0 , comp = 0;
	
	public void executa(int quantidade) {
		insercaoBinaria(crescente(quantidade), crescente );
		insercaoBinaria(decrescente(quantidade), decrescente);
		insercaoBinaria(aleatorio(quantidade), aleatoria);
	}
	
	public void insercaoBinaria(int[] vetor, String tipoVetor) {
	    int length = vetor.length;

	    for (int i = 1; i < length; ++i) {
	        int key = vetor[i];
	        int inserirPosicao = procurarPosicao(vetor, 0, i - 1, key);
	        mov++;

	        for (int j = i - 1; j >= inserirPosicao; --j) {
	        	vetor[j + 1] = vetor[j];
	        	mov++;
	        }

	        vetor[inserirPosicao] = key;
	        mov++;
	    }
	    System.out.println("Movimentações "+ tipoVetor + ": "+ mov);
		System.out.println("Comparações "+ tipoVetor + ": " +comp);
		System.out.println();
	}

	public int procurarPosicao(int[] vetor, int inicio, int fim, int key) {
	    while (inicio <= fim) {
	        int meio = inicio + (fim - inicio) / 2;

	        if (key < vetor[meio]) {
	        	fim = meio - 1;
	        } else {
	        	inicio = meio + 1;
	        }
	        comp++;
	    }

	    return inicio;
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
