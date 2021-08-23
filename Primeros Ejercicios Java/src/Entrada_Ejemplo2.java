import javax.swing.JOptionPane;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario=JOptionPane.showInputDialog("introduce tu nombre, plis");
		
		String edad=JOptionPane.showInputDialog("introduce edad");
		int edad_usuario=Integer.parseInt(edad);
		edad_usuario++;
		
		System.out.println(" Hola " + nombre_usuario + " en 2019 tendrás " + (edad_usuario) + " años ");
	}

}
