import java.util.Random;

public class Exercicio_2 {
	/*
	 * Gere e imprima uma matriz 10x10 com valores aleatorios entre 0-99. Apos isso
	 * indique qual é o maior e menor valor da linha 5 e qual é o menor valor da
	 * coluna 7
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Random rd = new Random();
		int[][] ale = new int[10][10];

		for (i = 0; i < ale.length; i++) {
			for (j = 0; j < ale[i].length; j++) {
				ale[i][j] = rd.nextInt(100); // preencher
			}
		}

		for (i = 0; i < ale.length; i++) {
			for (j = 0; j < ale[i].length; j++) {
				System.out.print(ale[i][j] + "\t"); // escrever
			}
			System.out.println();
		}

		int maiorl5 = 0;
		int menorl5 = 101;
		int linha5 = 5;

		for (i = 0; i < ale[5].length; i++) {
			if (ale[linha5][i] > maiorl5) { // comparar
				maiorl5 = ale[linha5][i];
			}
			if (ale[5][i] < menorl5) {
				menorl5 = ale[linha5][i];

			}
		}
		System.out.println("MAIOR VALOR DA LINHA 5: " + maiorl5);
		System.out.println("MENOR VALOR DA LINHA 5: " + menorl5);

		int maiorc7 = ale[0][0];
		int menorc7 = 0;
		int coluna7 = 7;
		for (i = 0; i < ale.length; i++) {
			if (ale[i][coluna7] > maiorc7) {
				maiorc7 = ale[i][coluna7];
			}
		}

		System.out.println("MAIOR VALOR DA COLUNA 7: " + maiorc7);

	}

}
