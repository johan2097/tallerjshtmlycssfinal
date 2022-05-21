

public class App {
    public static void main(String[] args) {
       int f,c,num ;
       int[][] matriz;
       matriz = new int[4][5];
       
       num=0;
               
       for(f =0; f <=3; f ++){
           for(c =0; f <=4; f ++){
           num=num+1;
           matriz[f][c]=num;
           System.out.print( matriz[f][c] + " " );
        }
       }
       
       
   }
}