package orquesta;

public class Viento extends Instrumento {
	private TipoViento tipo;

	public Viento(String nombre, double precio, TipoViento tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	@Override
	public void afinar() {
		System.out.println("Este instrumento de viento, " + getNombre() + ", está afinado");
	}

	public boolean esDeMetal() {
		return (tipo == TipoViento.METAL);
	}
}
