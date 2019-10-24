import java.util.Scanner;

public class ArbolAsteriscos{

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		System.out.println("Introduzca el tamaño del árbol, por favor:");
		int n = in.nextInt();
		System.out.println("");

		for(int i=0;i<n;i++){
			for(int j=0;j<(i+1);j++){
				System.out.print('*');
			}
			System.out.println("");
		}
	}
}
