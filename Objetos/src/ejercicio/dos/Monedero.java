package ejercicio.dos;

public class Monedero {
	private double deposito;

	public Monedero(double deposito) {
		this.deposito = deposito;
	}

	public void depositarDinero(double cantidad) {
		this.deposito += cantidad;
		System.out.println("SE HAN DEPOSITADO CON EXITO " + cantidad + " USD");
	}

	public void extraerDinero(double cantidad) { 	
		if(this.deposito >= cantidad) {
			this.deposito -= cantidad;
			System.out.println("SE HAN EXTRAIDO " + cantidad + " USD");
		}
		else
			System.out.println("NO HAY CANTIDAD SUFICIENTE EN DEPOSITO PARA EXTRACCION.");
	}

	public void consultarDeposito() {
		System.out.println("MONTO DISPONIBLE: " + this.deposito + " USD");
	}
}
