public class App {
    public static void main(String[] args) {
        int control= 10, control1=1;
      while (control >  1) {
          control1 =1;
           while (control1 <  control) {
           System.out.print("*"); 
           control1  = control1 + 1;
           }
           System.out.println("*"); 
           control  = control - 1;
        } 
      }   
}
