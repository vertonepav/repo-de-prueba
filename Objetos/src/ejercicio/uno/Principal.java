package ejercicio.uno;

public class Principal {

	public static void main(String[] args) {
		//Creo objeto de tipo Punto
		Punto d1 = new Punto();
		Punto d2 = new Punto();
		
		System.out.println("La distancia entre X e Y es: " + d1.distanciaEntreCoordenadas(100.0, 200.0));
		System.out.println("La distancia entre X e Y es: " + d2.distanciaEntreCoordenadas(400.0, 800.0));
		
		System.out.println("La distancia entre X e Y es: " + d1.distanciaEntreCoordenadas(100.0, 100.0));
	}

}
