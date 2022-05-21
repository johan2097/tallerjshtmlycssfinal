import java.util.Scanner;


public class App {
      public static void main(String[] args) {
          String nombre, apellidos;
          int edad;

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Por favor escriba su nombre");
        nombre = scanner.nextLine();
        System.out.println("Por favor escriba sus apellidos");
        apellidos = scanner.nextLine();
        System.out.println("Digite la edad");
        edad = scanner.nextInt();
        
        }
        
        if( edad >= 18) {
        System.out.println(nombre +" " + apellidos + " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }
        else{
        System.out.println(nombre +" " + apellidos + " usted es menor de edad, por lo tanto no puede entrar a la fiesta, por favor devuelvase a su casa");
        }
    }
}