package br.com.projeto;

import java.util.List;
import java.util.Scanner;

import br.com.projeto.buscas.BubbleSort;
import br.com.projeto.buscas.Fusao;
import br.com.projeto.buscas.HeapSort;
import br.com.projeto.buscas.InsercaoBinaria;
import br.com.projeto.buscas.InsercaoDireta;
import br.com.projeto.buscas.QuickSort;
import br.com.projeto.buscas.SelectionSort;

public class Main {
	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		int quantidade;
		boolean controle = true;
		while (controle) {

			System.out.print("##--         Menu          --##\n\n");
			System.out.print("|-------------------------------|\n");
			System.out.print("| Opção 1 - Insercao direta     |\n");
			System.out.print("| Opção 2 - Insercao binaria    |\n");
			System.out.print("| Opção 3 - Selecão             |\n");
			System.out.print("| Opção 4 - Bubblesort          |\n");
			System.out.print("| Opção 5 - Heapsort            |\n");
			System.out.print("| Opção 6 - Fusao               |\n");
			System.out.print("| Opção 7 - QuickSort           |\n");
			System.out.print("| Opção 8 - Sair                |\n");
			System.out.print("|-------------------------------|\n");
			System.out.print("Digite uma opção: ");

			int opcao = menu.nextInt();


			switch (opcao) {
			case 1://direta
				System.out.println("Digite a quantidade de elementoss");
				quantidade = menu.nextInt();
				InsercaoDireta insercaoDireta = new InsercaoDireta();
				insercaoDireta.executa(quantidade);
				break;
				
			case 2://binaria
				System.out.println("Digite a quantidade de elementoss");
				quantidade = menu.nextInt();
				InsercaoBinaria insercaoBinaria = new InsercaoBinaria();
				insercaoBinaria.executa(quantidade);
				break;
				
			case 3://seleção
				System.out.println("Digite a quantidade de elementoss");
				quantidade = menu.nextInt();
				SelectionSort selectionSort = new SelectionSort();
				selectionSort.executa(quantidade);
				break;
			

			case 4://bubble
				System.out.println("Digite a quantidade de elementoss");
				quantidade = menu.nextInt();
				BubbleSort bubbleSort = new BubbleSort();
				bubbleSort.executa(quantidade);
				break;
				
			case 5://Heap
				System.out.println("Digite a quantidade de elementos");
				quantidade = menu.nextInt();
				HeapSort heapSort = new HeapSort();
				heapSort.executarHeapSort(decrescente(quantidade), "decrescente");
				heapSort.executarHeapSort(crescente(quantidade), "crescente");
				heapSort.executarHeapSort(aleatorio(quantidade), "aleatorio");
				break;
				
			case 6://Fusao
				System.out.println("Digite a quantidade de elementos");
				quantidade = menu.nextInt();
				Fusao fusao = new Fusao();
				fusao.executarFusao(decrescente(quantidade), "decrescente");
				fusao.executarFusao(crescente(quantidade), "crescente");
				fusao.executarFusao(aleatorio(quantidade), "aleatorio");
				break;

			case 7://quick
				String crescente = "crescente";
				String decrescente = "decrescente";
				String aleatorio = "aleatoria";
				System.out.println("Digite a quantidade de elementoss");
				quantidade = menu.nextInt();
				QuickSort quickSort = new QuickSort();
				int[] vetorDecrescente = decrescente(quantidade);
				List<Integer> listaDecrescente =quickSort.quickSort(vetorDecrescente, 0, vetorDecrescente.length - 1);
				int[] vetorCrescente = crescente(quantidade);
				QuickSort quicksort2 = new QuickSort();
				List<Integer> listaCrescente =quicksort2.quickSort(vetorCrescente, 0, vetorCrescente.length - 1);
				int[] vetorAleatorio = aleatorio(quantidade);
				QuickSort quickSort3 = new QuickSort();
				List<Integer> listaAleatorio =quickSort3.quickSort(vetorAleatorio, 0, vetorAleatorio.length - 1);
				resultadoQuickSort(listaDecrescente,decrescente);
				resultadoQuickSort(listaAleatorio,aleatorio);
				resultadoQuickSort(listaCrescente,crescente);
				break;
				
			case 8:
				controle = false;
				break;

			default:
				System.out.print("\nOpção Inválida!");
				break;
			}
		}
	}
	
	public static void resultadoQuickSort(List<Integer> lista, String tipoVetor) {
			System.out.println("Movimentações " + tipoVetor + ": "+ lista.get(0));
			System.out.println("Comparações "+ tipoVetor + ": " +lista.get(1));
			System.out.println("      ");
		
	}

	public static int[] crescente(int quantidade) {
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
		}
		return vetor;
	}

	public static int[] decrescente(int quantidade) {
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor.length - i;
		}
		return vetor;
	}

	public static int[] aleatorio(int quantidade) {
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}
}
