import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        String nombre, apellido,nombreMadre,apellidomadre,nombrePadre,apellidopadre;  

        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Digite su nombre:");
        nombre = scanner.nextLine();
        System.out.println("Digite su apellido:");
        apellido = scanner.nextLine();
        System.out.println("Por favor escribir el nombre de su madre:");
        nombreMadre = scanner.nextLine();
        System.out.println("Por favor escribir el apellido de su madre:");
        apellidomadre = scanner.nextLine();
        System.out.println("Por favor escribir el nombre de su padre:");
        nombrePadre = scanner.nextLine();
        System.out.println("Por favor escribir el apellido de su padre:");
        apellidopadre = scanner.nextLine();
        }
        System.out.println("Yo "+ nombre +" "+ apellido + " soy el hijo de " + nombreMadre + " y " + nombrePadre);    

        }
}