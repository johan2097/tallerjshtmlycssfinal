import java.util.Scanner;


public class App {
    public static void main(String[] args) {
    String sabor,decoracion,pproducto,venta;
	int porciones,precio,opcion;
	String torta1 = "Torta de 1 libra";
	String torta2 = "Torta de 2 libras";
	String torta3 = "Torta de 3 libras"; ;
	int preciotorta1 = 50000;
	int preciotorta2 = 100000;
	int preciotorta3 = 150000;
	
     try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Pastelero Don Cartago, por favor elija una opcion");
        System.out.println("1. Registrar pedidos");
        System.out.println("2. Disponibilidad de tortas");
        System.out.println("3. Registro de ventas diarias");
        System.out.println("4. Salir de la app");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Sabor de la torta:");
                 sabor = scanner.nextLine();
                 System.out.println("Cantidad de porciones de torta:");
                 porciones = scanner.nextInt();
                 System.out.println("Observaciones del cliente:");
                 decoracion = scanner.nextLine();
                 break;
             case 2:
                 System.out.println("Las tortas disponibles con sus precios son: ");
                 System.out.println( torta1 + " Precio " + preciotorta1);
                 System.out.println( torta2 + " Precio " + preciotorta2);
                 System.out.println( torta3 + " Precio " + preciotorta3);
                 break;
             case 3:
                 System.out.println("Por favor ingrese la torta vendida");
                 venta = scanner.nextLine();
                 System.out.println("Por favor ingrese el valor de la torta");
                 precio = scanner.nextInt();
                 break;     
             case 4:    
                 break;     
        }
        
       
     }

    }
}
