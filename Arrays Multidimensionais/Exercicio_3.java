import java.util.Scanner;

public class Exercicio_3 {
	/*Capture do teclado valores para o preenchimento de uma matriz 
	 * 3x3. Após a captura imprima a matriz criada e encontre a quantidade
	 * de numeros pares, a quantidade de numeros ímpares
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][3];
		int i,j, par=0, impar = 0;
		Scanner scan = new Scanner(System.in);
		for(i=0; i<matriz.length; i++) {
			for(j=0; j<matriz.length; j++) {
				System.out.println("Diga o valor do vetor "+i+" "+j);
				matriz[i][j] = scan.nextInt();
				
				if(matriz[i][j]%2==0) {
					par++;
				}else {
					impar++;
				}
				
			}
			System.out.println();
		}
		
		for(i=0; i<matriz.length; i++) {
			for(j=0; j<matriz.length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("Pares: "+par);
		System.out.println("Impar: "+impar);
		

	}

}
