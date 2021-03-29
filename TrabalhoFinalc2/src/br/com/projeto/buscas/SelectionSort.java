package br.com.projeto.buscas;

public class SelectionSort {
	String crescente = "crescente";
	String decrescente = "decrescente";
	String aleatoria = "aleatoria";
	
	public void executa(int quantidade) {
		selectionSort(crescente(quantidade), crescente );
		selectionSort(decrescente(quantidade), decrescente);
		selectionSort(aleatorio(quantidade), aleatoria);
	}
	
	public void selectionSort(int[] vetor, String tipoVetor){
        int mov = 0, comp = 0;
        //Selection sort O(N^2)
        int posicao_menor, aux;
        for(int i=0; i < vetor.length; i++){ //O(N)
            posicao_menor = i;
            for(int j = i+1; j < vetor.length; j++){ //O(N)
                comp++;
            	if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
            mov = mov + 3;
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
