import java.util.*;

public class entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("introduce tu edad");
		
		int edad= entrada.nextInt();
		
		System.out.println("hola " + nombre_usuario + " el a�o que viene tendras " + (edad+1) + " ja�os");
		
	}

}
