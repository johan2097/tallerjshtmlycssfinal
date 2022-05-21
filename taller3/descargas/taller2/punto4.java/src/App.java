import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
          String nombrepelicula, pelicula1= "Titanic",pelicula2="Spiderman",pelicula3= "Rio",novedadpelicula;
          int opcion;

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Tienda de pelis, por favor elija una de las opciones");
        System.out.println("1. Alquilar la pelicula");
        System.out.println("2. Consultar las peliculas disponibles");
        System.out.println("3. Recibir las pelicula");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Como se llama la pelicula?");
                 nombrepelicula = scanner.nextLine();
                 break;
             case 2:
                 System.out.println("Las peliculas disponibles son las siguientes:");
                 System.out.println(pelicula1);
                 System.out.println(pelicula2);
                 System.out.println(pelicula3);
                 break;
             case 3:
                 System.out.println("Por favor ingrese  las novedades de la pelicula");
                 novedadpelicula = scanner.nextLine();
                 break;     
           
        }
    }
        
       
    }
    
}
