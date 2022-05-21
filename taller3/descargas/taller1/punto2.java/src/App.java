import java.util.Scanner;

public class App {
        public static void main(String args[]) {
        String nombre, apellido; 
        int edad;
        float estatura;
        
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Digite su nombre");
        nombre = scanner.nextLine();
        System.out.println("Digite su apellido");
        apellido = scanner.nextLine();
        System.out.println("¿Que edad tienes?");
        edad = scanner.nextInt();
        System.out.println("¿Cuanto mides?");
        estatura = scanner.nextFloat();
        }
        System.out.println("Su nombre completo es: " +nombre +" " + apellido + " tienes " + edad + " años" + " y mides "+ estatura );    

        }
    
    }
