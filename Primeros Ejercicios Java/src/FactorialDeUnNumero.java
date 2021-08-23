import javax.swing.JOptionPane;

public class FactorialDeUnNumero {

	public static void main(String[] args) {
		int factorial = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		for (int i=numero; i>0; i--) {
			factorial= factorial*i;
		}
		
		System.out.println("la factorial es igual  a " + factorial);
	}

}
