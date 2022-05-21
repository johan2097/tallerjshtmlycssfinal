import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    int largor, anchor,rec,baset, alturat,opcion, baseme,basema,alturatr;
	float trap,tria;

        
     try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Calculo del area de figuras geometricas, por favor elija una opcion");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Trapecio");
        System.out.println("4. Salir");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Largo del rectangulo?");
                 largor = scanner.nextInt();
                 System.out.println("Ancho del rectangulo?");
                 anchor = scanner.nextInt();
                 rec = largor*anchor;
                 System.out.println("El area del rectangulo es " + rec);
                 
                 break;
             case 2:
                 System.out.println("Base del triangulo?");
                 baset = scanner.nextInt();
                 System.out.println( "Altura del triangulo ?");
                 alturat = scanner.nextInt();
                 tria = (baset*alturat)/2;
                 System.out.println( "El area del triangulo es " + tria);
                 break;
             case 3:
                 System.out.println("Base menor del trapesio?");
                 baseme = scanner.nextInt();
                 System.out.println("Base mayor del trapesio ?");
                 basema = scanner.nextInt();
                 System.out.println("Altura del trapesio ?");
                 alturatr = scanner.nextInt();
                 trap = ((basema+baseme)/2*alturatr);
                 System.out.println("El area del trapesio es " + trap);
                 break;     
             case 4:    
                 break;     
        }
        
    } 
    }
    
}