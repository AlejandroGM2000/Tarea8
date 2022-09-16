package password;

public class MainPassword {

	public static void main(String[] args) {
		/*Genero diversas contraseñas 
		para comprobar si funciona correctamente*/
		int limit=16;
		for (int i=4;i<=limit;i++) {
			Password pass1=new Password(i);
			System.out.println(pass1.getContrasena());
			System.out.println("\n");
		}
		
		//Pruebo constructor por defecto
		Password pass2=new Password();
		System.out.println(pass2.getLongitud());
		System.out.println(pass2.getContrasena());
	}

}
