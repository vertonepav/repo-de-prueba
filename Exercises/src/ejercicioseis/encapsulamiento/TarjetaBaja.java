package ejercicioseis.encapsulamiento;

public class TarjetaBaja {

	private double saldoInicial;
	private int viajesRealizados, viajesEnColectivo, viajesEnSubte;
	
	public TarjetaBaja(double saldoInicial) {
		this.saldoInicial = saldoInicial;
		this.viajesEnColectivo = 0;
		this.viajesEnSubte = 0;
		this.viajesRealizados = 0;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return saldoInicial;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		this.saldoInicial += monto;
		System.out.println("Se han cargado: " + monto);
	}

	/**
	 * pre : saldo suficiente. post: utiliza 21.50 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		if(this.saldoInicial >= 21.50) {
			contarViajesEnColectivo();
			System.out.println("REALIZANDO PAGO: " + this.saldoInicial + " - 21.50");
			this.saldoInicial -= 21.50;
			System.out.println("SALDO ACTUAL: " + this.saldoInicial);
			contarViajes();
		} else {
			System.out.println("SALDO INSUFICIENTE");
		}
	}

	/**
	 * pre : saldo suficiente. post: utiliza 19.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		if(this.saldoInicial >= 19.50) {
			contarViajesEnSubte();
			System.out.println("REALIZANDO PAGO: " + this.saldoInicial + " - 19.50");
			this.saldoInicial -= 19.50;
			System.out.println("SALDO ACTUAL: " + this.saldoInicial);
			contarViajes();
		} else {
			System.out.println("SALDO INSUFICIENTE");
		}
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		this.viajesRealizados = this.viajesEnColectivo + this.viajesEnSubte;
		return this.viajesRealizados;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	private int contarViajesEnColectivo() {
		this.viajesEnColectivo += 1;
		contarViajes();
		return this.viajesEnColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	private int contarViajesEnSubte() {
		this.viajesEnSubte += 1;
		contarViajes();
		return this.viajesEnSubte;
	}
}
