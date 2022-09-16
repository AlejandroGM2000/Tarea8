package password;

public class Password {
	private int longitud;
	private String contrasena;
	
	//Constructor por defecto, con longitud de contraseña 8.
	
	public Password() {
		longitud=8;
		contrasena="";
	}
	/*
	 * Constructor que dado el atributo longitud como parametro genera una contraseña aleatoria
	 * de dicha longitud. Caracteres alfanuméricos. 
	 */

	public Password(int longitud) {
		this.longitud=longitud;
		
		//Defino los caracteres disponibles para generar la contraseña
		
		String lower="abcdefghijklmnopqrstuvwxyz";
		String upper=lower.toUpperCase();
		String numeric="0123456789";
		String cadena_alfanumerica=lower+upper+ numeric; 
		
		//Inicializo el objeto StringBuilder con la longitud proporcionada
		
        StringBuilder const_password; 		
        const_password = new StringBuilder(longitud); 

        for (int r = 0; r < longitud; r++) { 
        	
        	// Selecciona de forma pseudoaleatoria una posicion de la cadena
        	
            int control = (int)(cadena_alfanumerica.length()* Math.random()); 

            // Añade los caracteres alfanuméricos
            
            const_password.append(cadena_alfanumerica.charAt(control)); 
        } 

        contrasena=const_password.toString();
	}
	
	//Genero los correspondientes getters de la clase
	
	public int getLongitud() {
		return longitud;
	}
	public String getContrasena() {
		return contrasena;
	}
}
