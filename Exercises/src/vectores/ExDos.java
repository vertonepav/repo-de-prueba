package vectores;

import java.util.Scanner;

public class ExDos {

	public static void main(String[] args) {
		String[] nombres = new String[5];
		try (Scanner registrarNombres = new Scanner(System.in)) {
			for (int i = 0; i < nombres.length; i++) {
				
				
				System.out.print("Escriba un nombre: ");
				nombres [i] = registrarNombres.next();
			}
		}
		
		for (int i = 4; i >= 0; i--) {
			System.out.println(nombres[i]);
		}
	}

}
