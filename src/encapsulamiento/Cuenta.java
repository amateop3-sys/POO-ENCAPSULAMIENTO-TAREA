package encapsulamiento;

public class Cuenta {
	
	
	private String titular;
	private double saldo;
	
	
	public Cuenta(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}


	public void depositar(double monto) {
		
		saldo += monto;
	}
	
	
	public void retirar(double monto) {
		
		if (saldo - monto >=0) {
			saldo -=monto;
		}
		
		else {
			System.out.print("SALDO INSUFICIENTE...");
		}
	}
	
	
	public void mostrarCuenta() {
		System.out.println("TITULAR: "+titular);
		System.out.println("SALDO: "+saldo);
	}

}
