import java.util.Scanner;

public class App {
     public static void main(String[] args) {
    int opcion, placa=0,placa1=0,placa2=0,placa3=0,placa4=0,retirar=0,buscar=0;
	String marca,ncliente,telefono;
	String marca1,ncliente1,telefono1;
	String marca2,ncliente2,telefono2;
	String marca3,ncliente3,telefono3;
	String marca4,ncliente4,telefono4;
	
        do{

        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Menu parqueadero");
        System.out.println("1.Ingresar al parqueadero");
        System.out.println("2.Retirar del parqueadero");
        System.out.println("3.Consultar vehiculo");
        System.out.println("4. Salir del sistema");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Ingrese placa");
                 placa = scanner.nextInt();
                 System.out.println("Ingrese marca");
                 marca = scanner.nextLine();
                 System.out.println("Ingrese nombre del cliente");
                 ncliente = scanner.nextLine();
                 System.out.println("Ingrese numero telefonico");
                 telefono = scanner.nextLine();
                 
                 System.out.println("Ingrese placa");
                 placa1 = scanner.nextInt();
                 System.out.println("Ingrese marca");
                 marca1 = scanner.nextLine();
                 System.out.println("Ingrese nombre del cliente");
                 ncliente1 = scanner.nextLine();
                 System.out.println("Ingrese numero telefonico");
                 telefono1 = scanner.nextLine();
                 
                 System.out.println("Ingrese placa");
                 placa2 = scanner.nextInt();
                 System.out.println("Ingrese marca");
                 marca2 = scanner.nextLine();
                 System.out.println("Ingrese nombre del cliente");
                 ncliente2 = scanner.nextLine();
                 System.out.println("Ingrese numero telefonico");
                 telefono2 = scanner.nextLine();
                 
                 System.out.println("Ingrese placa");
                 placa3 = scanner.nextInt();
                 System.out.println("Ingrese marca");
                 marca3 = scanner.nextLine();
                 System.out.println("Ingrese nombre del cliente");
                 ncliente3 = scanner.nextLine();
                 System.out.println("Ingrese numero telefonico");
                 telefono3 = scanner.nextLine();
                 
                 System.out.println("Ingrese placa");
                 placa4 = scanner.nextInt();
                 System.out.println("Ingrese marca");
                 marca4 = scanner.nextLine();
                 System.out.println("Ingrese nombre del cliente");
                 ncliente4 = scanner.nextLine();
                 System.out.println("Ingrese numero telefonico");
                 telefono4 = scanner.nextLine();
                 break;
             case 2:
                 System.out.println("Ingrese la placa del vehiculo a retirar: ");
                 retirar = scanner.nextInt();
                 if(retirar == placa){
                     placa=0;
                     marca ="";
                     ncliente ="";
                     telefono ="";
                     System.out.println("El vehiculo con placa " + retirar +" ah sido retirado");
                 }
                 else  if(retirar == placa1){
                     placa1=0;
                     marca1 ="";
                     ncliente1 ="";
                     telefono1 ="";
                     System.out.println("El vehiculo con placa " + retirar +" ah sido retirado");
                 }
                 else  if(retirar == placa2){
                     placa2=0;
                     marca2 ="";
                     ncliente2 ="";
                     telefono2 ="";
                     System.out.println("El vehiculo con placa " + retirar +" ah sido retirado");
                 }
                 else  if(retirar == placa3){
                     placa3=0;
                     marca3 ="";
                     ncliente3 ="";
                     telefono3 ="";
                     System.out.println("El vehiculo con placa " + retirar +" ah sido retirado");
                 }
                 else  if(retirar == placa4){
                     placa4=0;
                     marca4 ="";
                     ncliente4 ="";
                     telefono4 ="";
                     System.out.println("El vehiculo con placa " + retirar +" ah sido retirado");
                 }
                 else {
                    System.out.println("El vehiculo " + retirar + " no existe"); 
                 }
                 break;
             case 3:
                 System.out.println("Ingrese la placa del vehiculo a buscar: ");
                 buscar = scanner.nextInt();
                 if( buscar == placa || buscar == placa1 || buscar == placa2 || buscar == placa3 || buscar == placa4){
                     System.out.println( "El vehiculo " + buscar +" si existe");
                 }
                 else{
                      System.out.println( "El vehiculo no existe");
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
