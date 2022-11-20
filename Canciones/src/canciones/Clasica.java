package canciones;

public class Clasica extends Cancion {
	private String instrumentos;

	public Clasica(String titulo, String grupo, String album, String instrumentos) {
		super(titulo, grupo, album);
		this.instrumentos = instrumentos;
	}

	public String getInstrumentos() {
		return instrumentos;
	}

	@Override
	public void imprimirCancion() {
		System.out.println("Nombre de la cancion: " + getTitulo());
	}

	@Override
	public String toString() {
		return "Cancion = Referencia: " + getNumReferencia() + ", Titulo: "
				+ getTitulo() + ", Grupo: " + getGrupo() + ", Album: " + getAlbum() + ", Instrumentos: " + instrumentos;
	}

	
}
