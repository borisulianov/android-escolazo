package com.arseb.escolazo;

import java.util.Random;

public class GeneradorAzar {
	
	// El siguiente método permite obtener un número aleatorio.
	// TODO: crear un array de números, ordenarlos y luego pasarlos a la cadena.
	public CharSequence testRandomNumber(int maxNumber, int howMany) {
		int myNumber = 0;
		StringBuffer strAux=new StringBuffer("");
		// Si el argumento es mayor a cero, se devuelve un número al azar.
		// Si el argumento es menor a cero, se devuelve cero.
		if (maxNumber != 0) {
			// ¿Cuántos números aleatorios se necesitan?
			if (howMany > 0){
				for ( int i = 1; i < howMany + 1; i++ )	{		
					Random myRandomGenerator = new Random();
					myNumber = myRandomGenerator.nextInt(maxNumber);
					strAux.append(Integer.toString(myNumber));
					// Si el incremento del bucle no es el último, se agrega un separador de coma.
					if (i < howMany){
						strAux.append(", ");
					}
				}
			}
		}
		// Este comando está sólo a fines de depuración.
		return strAux.toString();
	}

}