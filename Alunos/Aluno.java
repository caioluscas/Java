import java.util.Random;

public class Aluno {

	public static void main(String[] args) {
		/*Uma sala com n alunos. Cada aluno possui no ano, duas notas n1 e n2,
		 * Ele tem q tirar 7 para passar. Gere aleatoriamente duas notas para cada aluno. 
		 * Calcular media, exibir as duas notas, exibir a media e dizer se o aluno passou ou nao
		 * 
		 */
		int aluno[][] = new int [15][2]; //15 alunos 2 notas para cada aluno
		
		Random ale = new Random();
		
		int numeroaluno=1;
		
		for(int[] aluno1:aluno) {
			float media;
			aluno1[0] = ale.nextInt(10);
			aluno1[1] = ale.nextInt(10); 
			System.out.println("");
			
			media = (aluno1[0]+aluno1[1])/2;
			
			System.out.println("Aluno: "+numeroaluno);
			System.out.println("B1: "+aluno1[0]);
			System.out.println("B2: "+aluno1[1]);
			System.out.println("Media: "+media);
			
			if(media>=7) {
				System.out.println("Aprovado!");
			}else {
				System.out.println("Reprovou trouxa");
			}
			System.out.println("-----------------------");
			numeroaluno++;
			
			
		
		

		}

	}
}
