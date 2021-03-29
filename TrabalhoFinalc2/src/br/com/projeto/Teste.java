package br.com.projeto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		int [] vetor =  {1,2,4,6,7,3,2};
		quickSort(vetor, 0, vetor.length - 1);
		
		System.out.println(Arrays.toString(vetor));
	}
	
	public static void quickSort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int p = separar(vetor, esquerda, direita);
			quickSort(vetor, esquerda, p);
			quickSort(vetor, p + 1, direita);

		}
		System.out.println(Arrays.toString(vetor));
	}

	public static int separar(int[] vetor, int esquerda, int direita) {
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
			
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}
}
