import java.util.Scanner;

public class App {
      public static void main(String[] args) {
        String nombre, apellido;
	    float peso,estatura,imc;
	
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Por favor ingrese su nomnbre");
        nombre = scanner.nextLine();
        System.out.println("Por favor ingrese su apellido");
        apellido = scanner.nextLine();
        System.out.println("Por favor ingrese su peso en kilos");
        peso = scanner.nextFloat();
        System.out.println("Por favor ingrese su estatura en metros");
        estatura = scanner.nextFloat();
        
        imc = peso /(estatura*estatura);
          System.out.println(imc);
        if(imc <= 18.5){
        System.out.println("Usted se encuentra en bajo peso");
        }
        else if(imc >= 18.5 & imc <= 24.9) {
            System.out.println("Usted se encuentra en el peso normal");
            }
         else if(imc >= 25 & imc <= 29.9) {
            System.out.println("Usted se encuentra en sobrepeso");
            }
         else if(imc >= 30) {
            System.out.println("Usted se encuentra en obesidad");
            }
    }
  }
}