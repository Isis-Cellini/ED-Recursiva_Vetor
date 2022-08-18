package view;

import java.util.Scanner;

import controller.recursivaController;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tamanho = scan.nextInt();
		
		int[] vet = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			vet[i] = scan.nextInt();
		}
		scan.close();

		recursivaController vetor = new recursivaController();

		int somaVet = vetor.somaVet(vet, tamanho);
		System.out.println(somaVet);

	}
}