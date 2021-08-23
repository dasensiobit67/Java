package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche micoche= new Coche();
		
		micoche.establece_color("amarillo");
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos("si");
		
		System.out.println(micoche.dime_asientos());
		
	/*	// TODO Auto-generated method stub
		Coche Renault= new Coche(); //Instanciar una clase. Es un nuevo obj de la clase Coche
				
		System.out.println(Renault.dime_largo());
		
				//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
				*/
	}

}
