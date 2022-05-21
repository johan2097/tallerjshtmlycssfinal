import java.util.Scanner;

public class App {
      public static void main(String[] args) {
        int edad;

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite su edad:");
        edad = scanner.nextInt();
        
        
        if( edad < 18) {
        System.out.println("Usted aun es un niño.");
        }
        else{
        System.out.println("Usted es un adulto.");
        }
    }     

    }
    
}
