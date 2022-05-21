import java.util.Scanner;

public class app {
    public static void main(String args[]) {
        String ciudad, pais; 
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor escribir una ciudad capital ");
            ciudad = scanner.nextLine();
            System.out.println("Por favor escribir el pais");
            pais = scanner.nextLine();
        }
        System.out.println("La ciudad " + ciudad + " es la capital del pais " + pais );    

        }
}




