package parcialuno;

import java.util.Arrays;

public class Demo {
	//realizando cambios desde github al repo local
	//poniendo a prueba el comando git pull

	public static void main(String[] args) {
		double areaTotal = 0;

		Figura f1 = new Elipse(8, 4);
		Figura f2 = new Circulo(2);
		Figura f3 = new Rectangulo(4, 2);
		Figura f4 = new Cuadrado(6);
		Figura f5 = new Triangulo(4, 2);

		Figura[] figuras = { f1, f2, f3, f4, f5 };

		for (int i = 0; i < figuras.length; i++) {
			areaTotal += figuras[i].calcularArea();
		}
		
		System.out.println("-----Calculo de area total-----\n");
		
		System.out.println(areaTotal);

		System.out.println("\n-----Figuras no ordenadas por area-----\n");

		for (Figura areas : figuras) {
			System.out.println(areas);
		}

		System.out.println("\n-----Figuras ordenadas por area-----\n");

		Arrays.sort(figuras);

		for (Figura areas : figuras) {
			System.out.println(areas);
		}
	}

}
