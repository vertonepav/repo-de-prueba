package control.exercises;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		int v, c = 0, sumatoria = 0;
		double promedio;
		
		do {
		try (Scanner num = new Scanner(System.in)) {
			System.out.println("Ingrese un numero al conjunto: ");
			v = num.nextInt();
		}
		c = c + 1;
		sumatoria = sumatoria + v;
		
		} while(v != 0);
		
		promedio = (double) sumatoria / c;
		System.out.println("El promedio numerico es: " + promedio);
	}


	}

