import java.util.Scanner;
public class App {
public static void main(String args[]) {
String nombre, apellido;    

try (Scanner scanner = new Scanner(System.in)) {

     System.out.println("Digite su nombre:");
     nombre = scanner.nextLine();

     System.out.println("Digite su apellido:");
     apellido = scanner.nextLine();
    }
     System.out.println("Su nombre completo es: " +nombre +" " + apellido);    

  }
    
}
