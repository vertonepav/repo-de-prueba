package ar.edu.uno.saladecine;

//VERTONE_ESPINOZA TURNO NOCHE

public class SalaMain {

	public static void main(String[] args) {
		SalaDeCine probandoButacas = new SalaDeCine(8, 5);

		// en el siguiente bucle dejo la ultima fila sin ocupar
		for (int i = 0; i < probandoButacas.getFilas() - 1; i++)
			for (int j = 0; j < probandoButacas.getColumnas(); j++)
				probandoButacas.ocuparButaca(i, j);

		probandoButacas.ocuparButaca(3, 0);
		probandoButacas.ocuparButaca(3, 1);
		probandoButacas.ocuparButaca(3, 2);
		probandoButacas.ocuparButaca(3, 3);
		probandoButacas.ocuparButaca(3, 4);
		probandoButacas.ocuparButaca(3, 5);

		if (probandoButacas.estaOcupada(3, 0))
			System.out.println("Esta ocupada");
		else
			System.out.println("Esta desocupada");

		System.out.println(probandoButacas.cantidadDeButacasOcupadas());

		if (probandoButacas.hayEspacioPara(2))
			System.out.println("Las personas se acomodaran en forma contigua");
		else
			System.out.println("No es posible acomodar esta cantidad de gente en un fila de forma contigua");

		System.out.println(probandoButacas.getColumnas());
	}

}
