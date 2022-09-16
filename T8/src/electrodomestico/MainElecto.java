package electrodomestico;

public class MainElecto {

	public static void main(String[] args) {
		
		//Constructor por defecto
		
		Electrodomestico electro1=new Electrodomestico();
		System.out.println("Pruebo primer constructor");
		System.out.println(electro1.getPrecioBase());
		System.out.println(electro1.getColor());
		System.out.println(electro1.getConsumoEnergetico());
		System.out.println(electro1.getPeso());
		
		//Constructor que recibe precio y peso
		
		System.out.println("\nPruebo segundo constructor");
		Electrodomestico electro2=new Electrodomestico(289.76,17);
		System.out.println(electro2.getPrecioBase());
		System.out.println(electro2.getColor());
		System.out.println(electro2.getConsumoEnergetico());
		System.out.println(electro2.getPeso());
		
		//Constructor que recibe atributos como parámetro
		
		System.out.println("\nPruebo tercer constructor");
		Electrodomestico electro3=new Electrodomestico(289.76,"gris",'E',17);
		System.out.println(electro3.getPrecioBase());
		System.out.println(electro3.getColor());
		System.out.println(electro3.getConsumoEnergetico());
		System.out.println(electro3.getPeso());
		
		/*Compruebo que en caso de introducir valores 
		 * no aceptados, disponga valores por defecto
		 */
		System.out.println("\nCompruebo valores por defecto\n");
		Electrodomestico electro4=new Electrodomestico(289.76,"naranja",'G',17);
		System.out.println("\n"+electro4.getPrecioBase());
		System.out.println(electro4.getColor());
		System.out.println(electro4.getConsumoEnergetico());
		System.out.println(electro4.getPeso());
		
	}

}
