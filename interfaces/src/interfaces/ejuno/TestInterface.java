package interfaces.ejuno;

public class TestInterface {

	public static void main(String[] args) {
		double sumatoriaDeAreas = 0;
		Figura[] nFiguras = new Figura[3];

		nFiguras[0] = new Circulo(2);
		nFiguras[1] = new Cuadrado(5);
		nFiguras[2] = new Triangulo(3, 4);

		for (int x = 0; x < nFiguras.length; x++) {
			sumatoriaDeAreas += nFiguras[x].area();
		}

		System.out.println(
				"De una cantidad de " + nFiguras.length + " figuras, obtengo un area total de: " + sumatoriaDeAreas);
	}

}
