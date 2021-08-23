import java.util.Scanner;

public class nums_addition {

	public static void main(String[] args) {


		Scanner num= new Scanner(System.in);
		
		System.out.println("mete un numero");
		
		int num1=num.nextInt();
		
		double num4= (double) num1;
		
		System.out.println("mete otro numero");
		
		double num2= num.nextInt();
		
		double num3= num4 + num2;
		
		System.out.println("la puñetera suma es igual a " + (num3));
	}

}
