package ejercciouno.encapsulamiento;

public class Nota {
	private int valorInicial;
	/**
	 * pre : valorInicial está comprendido entre 0 y 10. post: inicializa la Nota
	 * con el valor indicado.
	 */
	public Nota(int valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	
	public void recuperar(int nuevoValor) { 
		if(nuevoValor > valorInicial)
			valorInicial = nuevoValor;
	}
	
	/**
	 * post: devuelve el valor numérico de la Nota, comprendido entre 0 y 10.
	 */
	public int obtenerValor() {
		return valorInicial;
	}

	/**
	 * post: indica si la Nota permite o no la aprobación.
	 */
	public boolean aprobado() {
		if(valorInicial >= 4)
			return true;
		else
			return false;
		
	}

	/**
	 * post: indica si la Nota implica desaprobación.
	 */
	public boolean desaprobado() {
		if(valorInicial < 4)
			return true;
		else 
			return false;
	}
}
