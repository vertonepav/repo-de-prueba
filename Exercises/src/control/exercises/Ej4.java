package control.exercises;

public class Ej4 {
	
	static String parImpar(int a) {
		
		if(a % 2 == 0)
			return ("Es par");
		else
			return ("Es impar");
	}
	
	public static void main(String[] args) {
		
		System.out.println(parImpar(956745));
		System.out.println(parImpar(12343));
		System.out.println(parImpar(22222));
		System.out.println(parImpar(76365));
	}

}
