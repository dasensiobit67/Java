package poo;

public class Coche {

	private int ruedas;//protejo, encapsulo la variable para que nadie la modifique	
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	//método constructor. Mismo nombre que la clase
	
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	//método getter
	
	public String dime_datos_generales() {
		return "La plataforma del vehículo tiene " + ruedas + " ruedas " +
	".Mide " + largo/1000 + "metors con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
		
	}
	
	//setter
	
	public void establece_color(String color_coche) {
		//color="azul";
		color=color_coche;
	}
	public String dime_color() {//getter
		return "El color de tu coche es " + color;
	}
	
	//setter para asientos
	public void configura_asientos(String asientos_cuero){
		//this.asientos_cuero=asietnos_cuero //this hace referencia a la clase no al argumento
		if (asientos_cuero=="si") {
			this.asientos_cuero=true;
			
		}else {
			this.asientos_cuero=false;
		}
	}
	
	//getter
	public String dime_asientos(){
		if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asienos de serie";
					
					
		}
	}
}
