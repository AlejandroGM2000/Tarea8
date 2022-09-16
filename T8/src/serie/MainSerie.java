package serie;

public class MainSerie {

	public static void main(String[] args) {
		
		//Pruebo constructor por defecto. Varios parámetros vacíos.
		
		Serie s1=new Serie();
		System.out.println("Pruebo primer constructor(defecto)");
		System.out.println(s1.getTitulo());
		System.out.println(s1.getNumTemporadas() );
		System.out.println(s1.isEntregado() );
		System.out.println(s1.getGenero());
		System.out.println(s1.getCreador());
		
		//Pruebo segundo constructor con titulo y creador
		
		Serie s2=new Serie("Big Bang Theory","Chuck Lorre");
		System.out.println("\nPruebo segundo constructor");
		System.out.println(s2.getTitulo());
		System.out.println(s2.getNumTemporadas() );
		System.out.println(s2.isEntregado() );
		System.out.println(s2.getGenero());
		System.out.println(s2.getCreador());
		
		//Recibe atributos como parámetro
		
		Serie s3=new Serie("Big Bang Theory",13,"Comedia","Chuck Lorre");
		System.out.println("\nPruebo tercer constructor");
		System.out.println(s3.getTitulo());
		System.out.println(s3.getNumTemporadas() );
		System.out.println(s3.isEntregado() );
		System.out.println(s3.getGenero());
		System.out.println(s3.getCreador());

	}

}
