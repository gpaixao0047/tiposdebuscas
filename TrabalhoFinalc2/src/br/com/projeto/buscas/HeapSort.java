package br.com.projeto.buscas;

public class HeapSort {
	int mov = 0, comp = 0;
	
	public void executarHeapSort(int[] vetor, String tipoVetor) {
		
	 	int n = vetor.length;
	        
	 	for(int i = n / 2 - 1; i >= 0; i--){
            aplicarHeap(vetor, n, i);
        }
        
        for(int j = n-1; j > 0; j--){
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;
            mov = mov + 3;
            aplicarHeap(vetor, j, 0);
        }
        
        System.out.println("Movimentações "+ tipoVetor + ": " + mov);
        System.out.println("Comparações "+ tipoVetor + ": " + comp);
        System.out.println();
       // printar o vetor
       //System.out.println("\n\nOrdenado");
       //for(int i = 0; i < vetor.length; i++){
       //    System.out.print(vetor[i] + " ");
       //}
	}

	    
	    private void aplicarHeap(int[] vetor, int n, int i){
	        int raiz = i;
	        int esquerda = 2*i + 1;
	        int direita = 2*i + 2;
	        
	        if (esquerda < n && vetor[esquerda] > vetor[raiz]){
	            raiz = esquerda;
	        }
	        if (direita < n && vetor[direita] > vetor[raiz]){
	            raiz = direita;
	        }
	        comp = comp + 2;
	        if (raiz != i){
	            int aux = vetor[i];
	            vetor[i] = vetor[raiz];
	            vetor[raiz] = aux;
	            mov = mov + 3;
	            aplicarHeap(vetor, n, raiz);
	        }
	    }
	}