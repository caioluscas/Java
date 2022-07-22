import java.util.Random;
import java.util.Scanner;

public class Exercicio_1 {
	/*
	 * Gere e imprima uma matriz 4x4 com valores aleatorios entre 0 e 9. Após isso
	 * determine o maior numero da matriz e sua posição e coluna (linha, coluna)
	 */
	//dar uma olhada depois na linha e coluna

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ale = new int[4][4];
		Scanner scan = new Scanner(System.in);
		
		
		
		Random rd = new Random();
		
		for(int i=0; i<ale.length; i++) {
			for(int j=0; j<ale[i].length; j++) {
				ale[i][j] = rd.nextInt(100);
			}
		}
		
		int maior = ale[0][0], linha = 0, coluna = 0;
		
		for(int i=0; i<ale.length; i++) {
			for(int j=0; j<ale[i].length; j++) {
				if(ale[i][i]>maior) {
					maior = ale[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		for(int i=0; i<ale.length; i++) {
			for(int j=0; j<ale[i].length; j++) {
				System.out.print(ale[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Maior numero: "+maior);
		System.out.println("Linha: "+linha);
		System.out.println("Coluna: "+coluna);
	}

}
