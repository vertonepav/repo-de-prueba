package ejercicio.uno;

public class Punto {

	// Atributos
	public double x, y; // Representan coordenadas de un punto en un plano
	
	// Métodos
	public double distanciaEntreCoordenadas(double x, double y) {
		if (x > y) {
			return x - y;
		} else if (x < y) {
			return -(x - y);
		} else
			return 0;
	}

}
