package ar.edu.uno.saladecine;

//VERTONE_ ESPINOZA - TURNO NOCHE
public class SalaDeCine {

	// Attributes

	private boolean[][] sala;
	private int columnas, filas;

	// Constructor

	public SalaDeCine(int butacas, int filas) {
		this.columnas = butacas;
		this.filas = filas;
		this.sala = new boolean[filas][butacas];
	}

	// Methods

	public boolean estaOcupada(int fila, int asiento) {
		return sala[fila][asiento];
	}

	public void ocuparButaca(int fila, int asiento) {
		if (sala[fila][asiento] == false)
			sala[fila][asiento] = true;
	}

	public int cantidadDeButacasOcupadas() {
		int asientosOcupados = 0;

		for (int b = 0; b < this.columnas; b++) {
			for (int f = 0; f < this.filas; f++) {
				if (this.sala[f][b])
					asientosOcupados += 1;
			}
		}

		return asientosOcupados;
	}

	boolean hayEspacioPara(int cantidadDePersonas) {
		int asientosContiguos = 0; // controla asientos contiguos disponibles por fila

		for (int fila = 0; fila < this.filas; fila++) {

			for (int columna = 0; columna < this.columnas; columna++) {
				if (this.sala[fila][columna]) {
					asientosContiguos = 0;
				} else {
					asientosContiguos++;
				}

			}

			if (cantidadDePersonas <= asientosContiguos) {
				return true;
			}

			asientosContiguos = 0; // resetea el conteo por fila

		}

		return false;
	}

	// Getters

	public int getColumnas() {
		return columnas;
	}

	public int getFilas() {
		return filas;
	}

	public boolean[][] getSala() {
		return sala;
	}

}
