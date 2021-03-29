package br.com.projeto.buscas;

public class Fusao {
	int mov = 0, comp = 0;
	public void executarFusao(int[] vetor, String tipoVetor) {
		int[] v = vetor;
		int[] w = new int[v.length];
		mergeSort(v, w, 0, v.length -1);
		//printa vetor
		// System.out.println(Arrays.toString(v));
		System.out.println("Movimentações " + tipoVetor + ": " + mov);
		System.out.println("Comparações " + tipoVetor + ": " + comp);
		System.out.println();
	}
	

	private  void mergeSort(int[] v, int[] w, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(v, w, ini, meio);
			mergeSort(v, w, meio + 1, fim);
			intercalar(v, w, ini, meio, fim);
		}

	}

	private  void intercalar(int[] v, int[] w, int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++) { 
			w[k] = v[k];
			mov++;
		}
		int i = ini;
		int j = meio + 1;
		
		for(int k =ini; k<= fim; k ++) {
			if(i>meio) {
				v[k] = w[j++];
				mov++;
			}
			else if(j>fim) {
				v[k] = w[i++];
				mov++;
			}
			else if(w[i] < w[j]) {
				v[k] = w[i++];
				mov++;
				comp++;
			}
			else {
				v[k] = w[j++];
				mov++;
				comp++;
			}
		}
	}
}
