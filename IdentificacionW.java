import java.util.Scanner;

public class IdentificacionW{

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		System.out.println("Introduzca su nombre de usuario:");

		String s = in.nextLine();

		while(!s.equals("Admin")){
			System.out.println("Usuario erróneo. Por favor, vuelva a intentarlo");
			s=in.nextLine();
		}
	}
}
