
import java.util.Random;

public class Teste{
 public static void main(String[] args){
     int[][] numAleatorio = new int [4][4];
     Random numeroRandom = new Random();
  
     for (int i = 0; i < numAleatorio.length; i++){
         for (int j = 0; j < numAleatorio[i].length; j++){
             numAleatorio[i][j] = numeroRandom.nextInt(100);//gera numero aleatorio de 0 a 100
         }
     }
  
     //int maior = Integer.MIN_VALUE;
  int maior = 0, linha = 0, col = 0;
  
  for (int i = 0; i < numAleatorio.length; i++){
      for (int j = 0; j < numAleatorio[i].length; j++){
          if(numAleatorio[i][j] > maior){
              maior = numAleatorio[i][j];
              linha = i;
              col = j;
          }
      }
  }
  
  System.out.print("\t\tMatriz\n");
  for (int i = 0; i < numAleatorio.length; i++){
      for (int j = 0; j < numAleatorio[i].length; j++){
          System.out.print("\t"+numAleatorio[i][j]+" ");
      }
      System.out.println();
  }
  System.out.println("\nMaior valor = "+maior);
  System.out.println("Linha: "+linha);
  System.out.println("Coluna:"+col);
 }
}