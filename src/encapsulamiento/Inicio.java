package encapsulamiento;

public class Inicio {

	public static void main(String[] args) {
		
		// EJERCICIO 1
		Persona pers1= new Persona("PEDRO JOSÉ", "PÉREZ ALAY", 58);
		Persona pers2= new Persona("IVAN","SALAZAR",22);
		Persona pers3= new Persona("MARÍA BEATRIZ", "HERNÁNDEZ",31);
		
		pers1.mostrarPersona();
		pers2.mostrarPersona();
		pers3.mostrarPersona();
	
		
	System.out.println("--------------------------");
	

	// EJERCICIO 2
	Rectángulo rec1= new Rectángulo(25,4);
	Rectángulo rec2= new Rectángulo(75,6);
	
	if(rec1.area()>rec2.area()) {
		System.out.println("EL rectangulo 1 tiene mayor area");
	}
	else {
		System.out.println("EL rectangulo 2 tiene mayor area");
	}
	
	
	
	System.out.println("--------------------------");
	
	
	Producto prod1 = new Producto("01", "Computadora acer", 9949.69);
	Producto prod2 = new Producto("02","Lays", 4.00);
	
	prod1.aplicarDescuento(50);	
	prod2.aplicarDescuento(4);
	
	prod1.mostrarProducto();
	prod2.mostrarProducto();
	
}
	
}
