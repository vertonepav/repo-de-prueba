package control.exercises;

public class Ej5 {
	
	static int numerosNaturales(int n) {
		
		if(n>=0 && n<=5) {
			return n;
		}
		else
			return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(numerosNaturales(0));
		System.out.println(numerosNaturales(1));
		System.out.println(numerosNaturales(2));
		System.out.println(numerosNaturales(3));
		System.out.println(numerosNaturales(4));
		System.out.println(numerosNaturales(5));
		System.out.println(numerosNaturales(6));
		System.out.println(numerosNaturales(7));

		
	}
	
}
