package arch1;

import java.io.*;

public class MetodosConArchivos {

	public static void crearArchivo(String nombre) throws IOException {
		File arch = new File(nombre);
		PrintWriter nw = new PrintWriter(arch);
		
		if(arch.exists()) {
			System.out.println("El archivo ha sido creado con éxito.");
			nw.close();
		}
	}
	
	public static void deleteArchivo(String nombre) {
		File f = new File(nombre);
		
		if(f.exists()) {
			f.delete();
			System.out.println("Archivo " + nombre.toUpperCase() + " ha sido eliminado con exito");
		} else {
			System.out.println("El archivo " + nombre.toUpperCase() + " no se encuentra o no existe.");
		}
		
		
	}
}
