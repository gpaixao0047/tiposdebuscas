package br.com.projeto.buscas;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	int mov = 0, comp = 0;

	public List<Integer> quickSort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int p = separar(vetor, esquerda, direita);
			quickSort(vetor, esquerda, p);
			quickSort(vetor, p + 1, direita);

		}
		List<Integer> resultado = new ArrayList<Integer>();
		resultado.add(mov);
		resultado.add(comp);
		return resultado;
	}

	private int separar(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivot = vetor[meio];
		int i = esquerda - 1;
		int j = direita;
		while (true) {
			do {
				i++;
				
			} while (vetor[i] < pivot);
			do {
				j--;
				
			} while (vetor[j] > pivot);
			if (i >= j) {
				comp++;
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
			mov = mov + 3;
		}
	}
}
