package vectores;

import java.util.Scanner;

public class ExUno {

	public static void main(String[] args) {
		
		int numeros [] = new int [10];
		try (Scanner asignacion = new Scanner(System.in)) {
			for(int i=0; i<numeros.length; i++) {
				System.out.print("Ingresar valor para la posicion " + (i+1) + ": ");
				numeros [i] = asignacion.nextInt();
				
			}
		}
		
		System.out.println(" ");
		System.out.println("Orden Original: ");
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Valor en la posicion " + (i+1) + ": " + numeros [i]);
			
		}
		
		System.out.println(" ");
		System.out.println("Orden Inverso: ");
		
		for(int i=9; i>=0; i--) {
			System.out.println("Valor en la posicion " + (i+1) + ": " + numeros [i]);
			
			
		}
		
	}

}
