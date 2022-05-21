import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      int f,c ;
      int[][] matriz;
      matriz = new int[11][11];
      
         
      for(f =1; f <=10; f ++){
          for(c =1; f <=10; f ++){
          
          matriz[f][c]=c;
          System.out.print( matriz[f][c] + " X "+ f + " " );
       }
          System.out.print(  " " );
      }
      
      
  }
}