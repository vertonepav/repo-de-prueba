package collect.et;

import java.util.LinkedList;

public class ListaProductos {
	private LinkedList<Producto> productos;

	public ListaProductos() {
		productos = new LinkedList<>();
	}

	public void imprimirLista() {

		for (Producto product : productos) {
			System.out.println(product);
		}
	}

	// muestra el elemento en esa posicion k de la lista
	public Producto kesimoElemento(int k) {
		if (k >= 0 && k < productos.size())
			return productos.get(k);
		return null;
	}

	public void incrementaImporte(Producto p) {
		int i = productos.indexOf(p);
		if (i != -1)
			productos.get(i).incrementarImporte(10);
	}

	// muestra la cantidad de stock de un producto dado
	public int darStock(Producto p) {
		for (int i = 0; i < productos.size(); i++) {
			if (p.equals(productos.get(i)))
				return p.getStock();
		}

		return 0;
	}

	// lista de productos con menos de 50u en stock
	public void menosDeCincuenta() {
		LinkedList<Producto> lista = new LinkedList<>();

		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getStock() < 50)
				lista.add(productos.get(i));
		}
	}

	// lista de productos con 50u o más
	public void masDeCincuenta() {
		LinkedList<Producto> lista = new LinkedList<>();

		for (int i = 0; i > productos.size(); i++) {
			if (productos.get(i).getStock() < 50)
				lista.add(productos.get(i));
		}
	}

}
