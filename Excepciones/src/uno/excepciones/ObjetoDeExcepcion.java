package uno.excepciones;

public class ObjetoDeExcepcion {

	public static void main(String[] args) {
		
		try {
			int [] a = {0, 0, 0};
			
			for(int i = 0; i<4;i++) {
				System.out.println(a[i]);
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("\nSe desborda el arreglo");
		}

	}

}


