package orquesta;

public abstract class Instrumento implements Identificable {
	private String nombre;
	private double precio;
	public static int numeroDeInstrumentos;
	public static int numInstrumentosVientoMetal;
	public static int numInstrumentosVientoMadera;

	public Instrumento(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public final String queInstrumentoEres() {
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
}
