package biblioteca.tp;

public class Biblioteca {
	private Libro libros[];
	private int cantLibros;

	public Biblioteca(int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
		this.cantLibros = 0;
	}

	public int cuantosLibros() {
		int cant = 0;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i] != null)
				cant += 1;
		}
		return cant;
	}

	public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		if (cantLibros >= libros.length)
			return false;
		else {
			libros[cantLibros] = new Libro(titulo, autor, genero, paginas);
			++cantLibros;
			return true;
		}
	}

	public String libroEnLaPosicion(int posicion) {
		if (posicion >= 0 && posicion < libros.length)
			return libros[posicion].obtenerTitulo();
		else
			return "La biblioteca no tiene esta cantidad de posiciones";
	}

	public Libro libroConMasPaginas() {
		Libro tieneMasPaginas = libros[0];
		for (int i = 0; i < libros.length; i++) {
			if (libros[0].obtenerPaginas() < libros[i].obtenerPaginas()) {
				tieneMasPaginas = libros[i];
			}
				
		}
		return tieneMasPaginas;
	}

	public Libro[] librosDelAutor(String autor) {
		Libro librosPorAutor[];
		int asignar = 0, tam = 0;

		// anticipo el tamaño de la lista de libros que son
		// propiedad de un autor.
		for (int a = 0; a < libros.length; a++) {
			if (libros[a].obtenerAutor() == autor) {
				tam += 1;
			}
		}

		librosPorAutor = new Libro[tam];

		// asigno esa cantidad de libros de manera que el array
		// se rellene.
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].obtenerAutor() == autor) {
				librosPorAutor[asignar] = libros[i];
				asignar += 1;
			}

		}

		return librosPorAutor;
	}

	public int tiempoEnLeerTodosLosLibros() {
		int paginasTotales = 0;
		for(int i = 0; i < libros.length; i++) {
			paginasTotales += libros[i].obtenerPaginas();
		}
		
		return paginasTotales;
	}
	
	
}
