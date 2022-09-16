package persona;

public class Persona {
	
	/* Defino las variables como private 
	 * para evitar que se acceda directamente 
	 * a ellas
	 */
	
	private String nombre;
	private int edad;
	private String dni; //DNI con letra
	private char sexo;
	private int peso;  
	private double altura; // Valor en metros
	
	//Constante que indica el valor por defecto del sexo
	
	private static final char sexo_defecto='H';
	
	// Genero constructor por defecto
	
	public Persona() {
		nombre="";
		edad=0;
		dni="12345678R";
		sexo=sexo_defecto;
		peso=0;
		altura=0;
	}
	
	/* Genero constructor que recibe como parámetros el nombre, edad y sexo
	 Resto de parámetros por defecto*/
	
	public Persona(String nombre,int edad,char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		dni="12345678R";
		this.sexo=sexo;
		peso=0;
		altura=0;
	}
	
	//Constructor con todos los atributos como parámetro
	
	public Persona(String nombre,int edad,String dni,char sexo,int peso,double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}
	
	//Genero los getter y setter de la clase
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
