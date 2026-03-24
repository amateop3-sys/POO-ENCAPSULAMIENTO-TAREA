package encapsulamiento;

public class Rectángulo {
	
	private float base;
	private float altura;
	

	
	
	
	public Rectángulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}





	public double area() {
		return base*altura;
	}
	
	public double perimetro() {
		return 2*(base+altura);
		
	}

}
