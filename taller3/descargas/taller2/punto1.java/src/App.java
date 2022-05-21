import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int edad;

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Digite por favor la edad:");
        edad = scanner.nextInt();
        
        
        if( edad >= 18) {
        System.out.println("Usted es mayor de edad:");
        }

        }

    }
}