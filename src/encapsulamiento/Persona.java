package encapsulamiento;

public class Persona {

	// atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	// constructor
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	

	
	public void mostrarPersona() {
		
		System.out.println("Su nombre es: "+nombre);
		System.out.println("Su apellido es: "+apellido);
		System.out.println("Su edad es: "+edad);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
