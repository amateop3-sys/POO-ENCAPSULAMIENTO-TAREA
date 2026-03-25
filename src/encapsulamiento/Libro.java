package encapsulamiento;

public class Libro {

	private String titulo;
	private String autor;
	private int páginas;
	
	
	public Libro(String titulo, String autor, int páginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.páginas = páginas;
	}
	
	
	
	public boolean esLargo() {
		return páginas >=300;
	}
	
	public void mostrarLibro() {
		
		System.out.println("EL TITULO ES: "+titulo);
		System.out.println("EL AUTOR ES: "+autor);
		System.out.println("CANTIDAD DE PÁGINAS: "+páginas);
		
	}
	
}
