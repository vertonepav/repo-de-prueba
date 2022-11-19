package control.exercises;

public class Ej3 {
	
	public static String diaDeSemana(int num) {
		
		switch (num) {
		case 1:
			return ("Lunes");
		case 2:
			return ("Martes");
		case 3:
			return ("Miercoles");
		case 4:
			return ("Jueves");
		case 5:
			return ("Viernes");
		case 6:
			return ("Sabado");
		case 7:
			return ("Domingo");
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(diaDeSemana(1));

	}

}
