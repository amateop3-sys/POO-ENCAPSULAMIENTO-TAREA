package encapsulamiento;

public class Fecha {
	
	
	private int dia;
	private int mes;
	private int año;
	
	
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public boolean esValida() {
		return (dia>=1 && dia<=31) && (mes>=1 && mes<=12);
		
	}
	
	public void mostrarFecha() {
		System.out.println(dia+"/"+mes+"/"+año+ " - " + (esValida() ? "Válida" : "Inválida"));
		
	}

}
