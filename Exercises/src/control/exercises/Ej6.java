package control.exercises;

import java.util.Scanner;

public class Ej6 {
		

	public static void main(String[] args) {
		
		int a, sumatoria = 0;
		
		do {
		try (Scanner num = new Scanner(System.in)) {
			System.out.println("Ingrese un numero al conjunto: ");
			a = num.nextInt();
		}
		sumatoria = sumatoria + a;
		
		} while(a != 0);
		
		System.out.println("La sumatoria del conjunto dado es: " + sumatoria);
	}

}
