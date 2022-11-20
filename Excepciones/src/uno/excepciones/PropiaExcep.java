package uno.excepciones;

public class PropiaExcep extends Exception {
	String msjErr;

	public PropiaExcep(String msj) {
		super(msj);
	}
	
	public void mensajeDeError() {
		System.err.println("Este es un error de prueba");
	} 
}