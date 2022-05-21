import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        int indice ,num,dato,n,i;
        
        
        for(n =1; n <=100; n ++){
            num=0;
           for(i=1;i<=n;){
               if(n%i==0){
                   num=num+1;
               }
               
           }
           if(num==2){
               System.out.println( n + " Es primo");
           }
           else
           {
               System.out.println( n + "No es primo");
           }
            
        }
        
        
    }
    
}
