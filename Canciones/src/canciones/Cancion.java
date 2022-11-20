package canciones;

public abstract class Cancion {
	private int numReferencia;
	private String titulo;
	private String grupo;
	private String album;

	public Cancion(String titulo, String grupo, String album) {
		this.numReferencia = referencia();
		this.titulo = titulo;
		this.grupo = grupo;
		this.album = album;
	}

	private int referencia() {
		while (numReferencia == hashCode())
			numReferencia = hashCode();
		return numReferencia = hashCode();
	}

	public int getNumReferencia() {
		return numReferencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public String getAlbum() {
		return album;
	}

	public abstract void imprimirCancion();
}
