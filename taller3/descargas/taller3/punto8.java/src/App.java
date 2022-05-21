import java.util.Scanner;

public class App {
     public static void main(String[] args) {
    int opcion,opRepetir, i;
	String nombre,ap1robado,curso,fecha;
	
	
        do{

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Menu de cursos");
        System.out.println("1.Cursos");
        System.out.println("2.Informacion de estudiantes");
        System.out.println("3.Agregar Estudiantes");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Cursos disponibles");
                 curso = scanner.nextLine();
                 System.out.println("1.Conduccion de Automovil");
                 curso = scanner.nextLine();
                 System.out.println("2.Conduccion de motocicleta");
                 curso = scanner.nextLine();
                 System.out.println("3.Conduccion de otros vehiculos");
                 curso = scanner.nextLine();
                 
             break;
             case 2:
             System.out.println("Informacion de estudiantes");
             curso = scanner.nextLine();
             System.out.println("1.Juan Mendez");
             curso = scanner.nextLine();
             System.out.println("fecha de ingresa:13/03/21");
             fecha = scanner.nextLine();
             System.out.println("Resultado:Aprobado");
             curso = scanner.nextLine();
             System.out.println("Apto para adquirir licencia de conduccion");
             curso = scanner.nextLine();
             System.out.println("2.Santiago Orozco");
             System.out.println("fecha de ingresa:13/03/21");
             fecha = scanner.nextLine();
             System.out.println("Resultado:Aprobado");
             curso = scanner.nextLine();
             System.out.println("Apto para adquirir licencia de conduccion");
             curso = scanner.nextLine();
             
                 break;
             case 3:
             System.out.println("Ingrese el nombre del estudiante");
             nombre = scanner.nextLine();
             System.out.println("Ingresa la fecha");
             fecha = scanner.nextLine();
             System.out.println("Ingrese su curso");
             curso = scanner.nextLine();
                 
                 break;     
             case 4:
                   break;      
        }
      }
        
        }
        while (opcion == 4);  
     }
}