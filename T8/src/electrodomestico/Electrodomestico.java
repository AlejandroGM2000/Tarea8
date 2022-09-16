package electrodomestico;

public class Electrodomestico {
	/*Defino los atributos con el modificador protected.
	 * Este permite que los atributos sean accesibles desde
	 * una clase hija.
	 */
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	/*
	 * Defino con constantes los valores por defecto del producto
	 */
	
	private static final double precioBase_default=100;
	private static final String color_default="blanco";
	private static final char consumoEnergetico_default='F';
	private static final int peso_default=5;
	
	private static final String[] colores= {"blanco","negro","rojo","azul","gris"};
	private static final char[] consumos= {'A','B','C','D','E','F'};
	
	//Constructor con valores por defecto. Sin parámetros.
	
	public Electrodomestico() {
		precioBase=precioBase_default;
		color=color_default;
		consumoEnergetico=consumoEnergetico_default;
		peso=peso_default;
	}
	
	/*Constructor que recibe como parámetros el precio y el peso
	Resto de parámetros por defecto*/
	
	public Electrodomestico(double precio,int peso) {
		precioBase=precio;
		color=color_default;
		consumoEnergetico=consumoEnergetico_default;
		this.peso=peso;
	}
	
	/*Contructor que recibe como parámetros todos los atributos
	 * Es necesario comprobar que la letra del cosumo energético sea
	 * correcta y reciba como parámetro un color aceptable. En caso contrario,
	 * se establecerán los valores por defecto.
	 */
	public Electrodomestico(double precio, String color,char consumoEnergetico, int peso) {
		boolean coloraceptable=false;
		boolean consumaceptable=false;
		int i=0;
		int j=0;
		precioBase=precio;
		
		/*Realizo una busqueda en la tabla definida como constante que contiene los valores aceptables
		 * para comprobar si el color pasado como parámetro esta incluido en dicha tabla.
		 * En caso negativo, se dispone el color por defecto.
		 */
		
		while((i<colores.length)&&(coloraceptable!=true)) {
			if(colores[i].equalsIgnoreCase(color)) {
				this.color=color;
				coloraceptable=true;
			}
			else {
				i++;
			}
		}
		if (coloraceptable==false) {
			System.out.println("Color no disponible, color por defecto blanco");
			this.color=color_default;
		}
		
		/*Realizo una busqueda en la tabla definida como constante que contiene los caracteres aceptables
		 * para comprobar si el consumo energético pasado como parámetro esta incluido en dicha tabla.
		 * En caso negativo, se dispone la letra por defecto.
		 */
		
		while((j<consumos.length)&&(consumaceptable!=true)) {
			if(consumos[j]==consumoEnergetico) {
				this.consumoEnergetico=consumoEnergetico;
				consumaceptable=true;
			}
			else {
				j++;
			}
		}
		if(consumaceptable==false) {
			System.out.println("Indicador de consumo no disponible, letra por defecto F");
			this.consumoEnergetico=consumoEnergetico_default; 
		}
		this.peso=peso;
	}
	
	// Genero setters y getters de la clase
	
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
