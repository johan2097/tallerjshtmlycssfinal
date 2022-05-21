import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int indice ;
        int[] usuario;
        usuario = new int[5];
        
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Ingrese primera posicion");
        usuario[0] = scanner.nextInt();
         System.out.println("Ingrese segunda posicion");
        usuario[1] = scanner.nextInt();
         System.out.println("Ingrese tercera posicion");
        usuario[2] = scanner.nextInt();
         System.out.println("Ingrese cuarta posicion");
        usuario[3] = scanner.nextInt();
         System.out.println("Ingrese quinta posicion");
        usuario[4] = scanner.nextInt();
        
        for(indice =0; indice <=4; indice ++){
            System.out.println("[" +indice+"] = " + usuario[indice]);
        }
        
    }

    }
}
