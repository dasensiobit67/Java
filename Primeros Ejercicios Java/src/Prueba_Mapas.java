import java.util.*;
public class Prueba_Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Empleado> personal= new HashMap<String, Empleado>();
		
		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sabdra"));
		
		System.out.println(personal);
		

	}

}

class Empleado{
	public Empleado(String n) {
		
		nombre=n;
		sueldo=2000;
		
	}
	public String toString() {
		return "[Nombre=" + nombre + ", sueldo" + sueldo + "]";
	}
	
	private String nombre;
	private double sueldo;
}