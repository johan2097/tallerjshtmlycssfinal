import java.util.Scanner;

public class App {
     public static void main(String[] args) {
    String producto, tipoproducto ,motivodevolucion ,devolucion ;
	int cantidadproducto, precioproducto ;
	int opcion;
	String producto1 = "Compuatores" ;
	String producto2 = "Televisores";
	String producto3 = "Tabletas";
	int precioproducto1 = 4500000;
	int precioproducto2 = 2000000;
	int precioproducto3 = 800000;


       try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Drogueria Mi Cartago por favor elija una opcion");
        System.out.println("1. Compra Producto");
        System.out.println("2. Consultar de precios producto");
        System.out.println("3. Devolucion producto");
        System.out.println("4. Salir de la app");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Nombre del producto?");
                 producto = scanner.nextLine();
                 System.out.println("Tipo de producto?");
                 tipoproducto = scanner.nextLine();
                 System.out.println("Cantidad de producto?");
                 cantidadproducto  = scanner.nextInt();
                 System.out.println("Precio del producto?");
                 precioproducto = scanner.nextInt();
                 break;
             case 2:
                 System.out.println("Las productos disponibles con sus precios son");
                 System.out.println(producto1 + " Precio " + precioproducto1);
                 System.out.println(producto2 + " Precio " + precioproducto2);
                 System.out.println(producto3 + " Precio " + precioproducto3);
                 break;
             case 3:
                 System.out.println("Por favor ingrese  el producto a devolver");
                 devolucion = scanner.nextLine();
                 System.out.println("Por favor ingrese  el motivo de la devolucio");
                 motivodevolucion = scanner.nextLine();
                 break;     
             case 4:
                   break;      
        }
        
    }
    }
    
}
