import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        String fecha,moto,cliente,nombrecliente,fechas,nmoto,arreglomoto ;
	    int opcion;
	

       try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Taller de Motos El Maquinista, por favor elija una opcion");
        System.out.println("1. Ingreso de Motos");
        System.out.println("2. Salida de Motos");
        System.out.println("3. Salir");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Fecha de ingreso?");
                 fecha = scanner.nextLine();
                 System.out.println("Referencia de la moto?");
                 moto = scanner.nextLine();
                 System.out.println("Observaciones del cliente?");
                 cliente = scanner.nextLine();
                 System.out.println("Nombre del cliente?");
                 nombrecliente = scanner.nextLine();
                 break;
             case 2:
                 System.out.println("Fecha de salida?");
                 fechas = scanner.nextLine();
                 System.out.println("Novedades de la moto?");
                 moto = scanner.nextLine();
                 System.out.println("Arreglos realizados a la moto?");
                 arreglomoto = scanner.nextLine();
                 break;
             case 3:
                 break;      
        }
        
    }
    
    }
    
}
