import java.util.Scanner;


public class App {
    public static void main(String[] args) {
    String titular;
	int cantidad,ingreso,retiro, opcion;
	

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Nombre del titular");
        titular = scanner.nextLine();
        System.out.println("Escribir cantidad");
        cantidad = scanner.nextInt();
        System.out.println("Su banco fiel, por favor elija una opcion:");
        System.out.println("1. Desea realizar ingresos:");
        System.out.println("2. Desea realizar retiros:");
        System.out.println("3. Desea realizar consultas de valor:");
        System.out.println("4. Salir de la app ");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Valor del ingreso:");
                 ingreso = scanner.nextInt();
                 if(ingreso < 0){
                     System.out.println("El valor que usted ha introducido es negativo");
                 }
                 break;
             case 2:
                 System.out.println("Valor del retiro");
                 retiro = scanner.nextInt();
                 if(retiro > cantidad){
                     System.out.println("El valorque usted ha introducido es mayor al que tiene en la cuenta");
                 }
                 break;
             case 3:
                 System.out.println("Su saldo es " + cantidad);
                 break;     
             case 4:    
                  System.out.println("Adios");
                 break;     
        }
        
     }
     }
}
