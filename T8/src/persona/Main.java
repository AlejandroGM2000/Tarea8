package persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Uso del primer constructor
		Persona persona1=new Persona();
		
		//Uso del segundo constructor
		Persona persona2=new Persona("Marta",23,'M');
		
		//Uso del tercer constructor
		Persona persona3=new Persona("Antonio",21,"48012832S",'H',80,1.82);
		
		//Compruebo el correcto funcionamiento del primer construtor.
		System.out.println("Comprubo primer constructor");
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		System.out.println(persona1.getDni());
		System.out.println(persona1.getSexo());
		System.out.println(persona1.getPeso());
		System.out.println(persona1.getAltura());
		
		//Compruebo el correcto funcionamiento del segundo constructor.
		System.out.println("\nComprubo segundo constructor");
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getEdad());
		System.out.println(persona2.getDni());
		System.out.println(persona2.getSexo());
		System.out.println(persona2.getPeso());
		System.out.println(persona2.getAltura());
		
		//Compruebo el correcto funcionamiento del tercer constructor.
		System.out.println("\nComprubo tercer constructor");
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		System.out.println(persona3.getDni());
		System.out.println(persona3.getSexo());
		System.out.println(persona3.getPeso());
		System.out.println(persona3.getAltura());
	}

}
