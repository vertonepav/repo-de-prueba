package collect.ed;

/*
 *  En un supermercado se mantiene una cola A con diversos clientes de los que se conoce número de ubicación en la cola
 *  y cantidad de productos que lleva. Se abre una nueva cola B para clientes que llevan menos de 5 productos. 
 *  Usted debe dejar en la cola A los clientes que llevan más de 5 o hasta 5 productos en el orden en que estaban, y en 
 *  la cola B los que compran menos de 5 artículos, respetando el orden que tenían en la cola A. 
 *  En ambas colas reasignar un nuevo número de ubicación.
 * */

public class Fila {
	private int productos;
	
	public Fila(int productos) {
		this.productos = productos;
	}
	
	public int productosQueTiene() {
		return productos;
	}

	@Override
	public String toString() {
		return productos + " productos";
	}
	
	
}
