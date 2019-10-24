import java.util.Scanner;

public class IdentificacionDW{


	public static void main(String[] args){

		Scanner in= new Scanner(System.in);
		String s;


		do{
			System.out.println("Nombre de usuario, por favor:");
			s=in.nextLine();
		}while(!s.equals("Admin"));
	}
}
