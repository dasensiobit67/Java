import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100);
		
		//System.out.println(aleatorio);
		
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		
		while (numero!=aleatorio) {   //do
			intentos++;
			System.out.println("Introduce un n�mero, por favor");
			numero=entrada.nextInt();
			if(aleatorio<numero) {
				System.out.println("M�s bajo");
			}
			else if(aleatorio>numero) {
				System.out.println("M�s alto");
			}
			
		}
		System.out.println("Correcto. Los has conseguido en " + intentos +" intentos");
	}//while (numero!=aleatorio)

}
