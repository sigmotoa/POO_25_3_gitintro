import java.util.Scanner;
public class Edad{
  public static void main(String args[]){

    Scanner leer = new Scanner(System.in);

	short current_year = 2025;  
    System.out.println("Ingrese su nombre");
    String name = leer.nextLine();
	System.out.println(name+" ingrese su nacimiento");
	int year=leer.nextInt();
int age =(int) current_year-year;
	if (age<18){
		System.out.println("Bye");
	}
	  else{
	  System.out.println("Welcome");
	  }
	  
  }
}
