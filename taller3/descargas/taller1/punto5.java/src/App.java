import java.util.Scanner;


public class App {
     public static void main(String args[]) {
        String nmascota,tipo,nombre; 
        int edad;
        
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Por favor escribir el nombre de su mascota ");
        nmascota = scanner.nextLine();
        System.out.println("Por favor escribir el tipo de mascota");
        tipo = scanner.nextLine();
        System.out.println("Por favor escribir su nombre");
        nombre = scanner.nextLine();
        System.out.println("Por favor escribir la edad de la mascota");
        edad = scanner.nextInt();
        }       
        System.out.println(nmascota + " es una " + tipo + " el cual tiene "+ edad + " años de edad "+ " y " + nombre +" es actualmente su dueño" );    

        }
}

