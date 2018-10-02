 import java.util.Scanner;
 public class SentenciaIfAnidada {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Le voy a decir si el número introducido es par o impar");
    System.out.println("Introduzca el número");
    int numero = Integer.parseInt(s.nextLine());
 
    if(numero==0) {
      System.out.println("El número introducido es cero");
      
    }else{
         
      if((numero % 2) == 0) {//el numero es par
      
        System.out.printf("El número %d es par.\n" , numero);
                  
    }else{
      System.out.printf("El número %d es impar.\n" , numero);
    }
    }
  }
}
