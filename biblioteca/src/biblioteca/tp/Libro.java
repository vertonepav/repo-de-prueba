package biblioteca.tp;

public class Libro {
	private String titulo;
	private String autor;
	private Genero genero;
	private int paginas;
	
	public Libro(String titulo, String autor, Genero genero, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
	}
	
	public String obtenerTitulo() {
		return titulo;
	}

	public String obtenerAutor() {
		return autor;
	}

	public Genero obtenerGenero() {
		return genero;
	}

	public int obtenerPaginas() {
		return paginas;
	}
	
	
}
