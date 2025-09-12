import java.util.Scanner;
public class Edad{
  public static void main(String args[]){

    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese su nombre");
    String name = leer.nextLine();
	System.out.println(name+" ingrese su nacimiento");
	int year=leer.nextInt();
  }
}
