package ticket;

public class Ticket {
	private double importe, importeSubtotal;
	private int cantidadProductos;

	/**
	 * post: el Ticket se inicializa con importe 0.
	 */
	public Ticket() {
		this.importe = 0;
		this.cantidadProductos = 0;
		this.importeSubtotal = 0;
		
	}

	/**
	 * pre : cantidad y precio son mayores a cero. El ticket está abierto. post:
	 * suma al Ticket un item a partir de la cantidad de productos y su precio
	 * unitario.
	 */
	public void agregarItem(int cantidad, double precioUnitario) {
		if(cantidad > 0 && precioUnitario > 0)
			this.importe = cantidad * precioUnitario;
		else
			throw new Error("Revise la cantidad y/o precio ingresados.");
	}

	/**
	 * pre : está abierto y no se ha aplicado un descuento previamente. post: aplica
	 * un descuento sobre el total del importe.
	 */
	public void aplicarDescuento(double porcentaje) {
			System.out.println("Se aplica un descuento de: " + (calcularSubtotal() * porcentaje));
	}

	/**
	 * post: devuelve el importe acumulado hasta el momento, sin cerrar el Ticket.
	 */
	public double calcularSubtotal() {
		return this.importeSubtotal += this.importe;
		
	}

	/**
	 * post: cierra el Ticket y devuelve el importe total.
	 */
	public double calcularTotal() {
		double importeTotal = this.importeSubtotal;
		this.importeSubtotal = 0;
		
		return importeTotal;
	}

	/**
	 * post: devuelve la cantidad total de productos.
	 */
	public int contarProductos() {
		
		return this.cantidadProductos;
	}
	
	// getters and setters
	
	public double getImporte() {
		return importe;
	}
	
	public double getImporteSubtotal() {
		return importeSubtotal;
	}
	
}
