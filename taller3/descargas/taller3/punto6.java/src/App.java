import java.util.Scanner;

public class App{
     public static void main(String[] args) {
        int opcion,contacto1=0,contacto2=0,contacto3=0,buscar,eliminar;
	
        do{

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Menu");
        System.out.println("1.Añadir contactos");
        System.out.println("2.Buscar contactos");
        System.out.println("3.Eliminar contactos");
        System.out.println("4. Salir");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Ingrese contacto");
                 contacto1 = scanner.nextInt();
                 System.out.println("Ingrese contacto 2");
                 contacto2 = scanner.nextInt();
                 if(contacto2 == contacto1){
                     System.out.println("Ese contacto ya existe");
                 }
                 System.out.println("Ingrese contacto 3");
                 contacto3 = scanner.nextInt();
                 if(contacto3 == contacto2 || contacto3 == contacto1){
                     System.out.println("Ese contacto ya existe");
                 }
                 break;
             case 2:
                 System.out.println("Ingrese contacto a buscar: ");
                 buscar = scanner.nextInt();
                 if(buscar == contacto3 || buscar == contacto2 || buscar== contacto1){
                     System.out.println("El contacto " + buscar + " si existe");
                 }
                 else{
                      System.out.println("El contacto no  existe");
                 }
                 break;
             case 3:
                 System.out.println("Ingrese contacto a eliminar: ");
                 eliminar = scanner.nextInt();
                 if( eliminar == contacto1){
                     contacto1 =0;
                     System.out.println("El contacto " +eliminar +" ha sido eliminado");
                 }
                 
                 else if(eliminar == contacto2) {
                   contacto2 =0;  
                   System.out.println("El contacto " +eliminar +" ha sido eliminado");
                 }
                  else if(eliminar == contacto3) {
                   contacto3 =0;  
                   System.out.println("El contacto " +eliminar +" ha sido eliminado");
                 }
                 else{
                     System.out.println("El contacto " +eliminar +" no existe");
                 }
                 
                 break;     
             case 4:
                   break;      
        }

        }
        
        }
        while (opcion == 4);  
    
    

    }

}
