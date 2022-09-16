package serie;

public class Serie {
	
	//Defino como constantes los valores por defecto
	
	
	private static final int tem_default=3;
	private static final boolean ent_default=false;
	
	//Defino atributos
	
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Constructor por defecto
	
	public Serie() {
		this.titulo="";
		this.numTemporadas=tem_default;
		this.entregado=ent_default;
		this.genero="";
		this.creador="";
		
	}
	
	//Constructor que recibe como parámetro el titulo y creador
	
	public Serie (String titulo,String creador){
		this.titulo=titulo;
		this.numTemporadas=tem_default;
		this.entregado=ent_default;
		this.genero="";
		this.creador=creador;
	}
	
	//Constructor que recibe atributos como parámetro(a excepcion de entregado)
	
	public Serie (String titulo,int numTemporadas,String genero,String creador){
		this.titulo=titulo;
		this.numTemporadas=numTemporadas;
		this.entregado=ent_default;
		this.genero=genero;
		this.creador=creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
}
