package controller;

public class recursivaController {

	public recursivaController() {
		// TODO Auto-generated constructor stub
	}

	public int somaVet(int[] vet, int tamanho) {
		int valor = 0;
		if (tamanho == 0) { //Parada quando nao tiver mais posicoes
			return 0;
		} else {
			int ultimaPos = tamanho - 1;
			if (vet[ultimaPos] < 0) {   //Condicional para verificar se é um numero negativo, se for ele somo ao valor
				valor = valor + vet[ultimaPos];
			}
			tamanho -= 1; //independente se foi ou nao adicionado ao valor diminuimos 1 do tamamanho do vetor
			return valor + somaVet(vet, tamanho);
		}
	}

}
