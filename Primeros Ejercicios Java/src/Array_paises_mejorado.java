import javax.swing.JOptionPane;


public class Array_paises_mejorado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] paises= new String[8];
		
		
		
		for (int i=0;i<8; i++) {
			paises[i]=JOptionPane.showInputDialog( "Introduce paises" + (i+1));
		}
		
	
		for(String elemento:paises) {
			System.out.println(elemento);
		}
	}

}
