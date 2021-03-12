package ui;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner lector = new Scanner(System.in);
		 String cadena = lector.nextLine();
		 int contador = 0;
		 char caracter = 0;

		 while (cadena.length() != 0) { // mientras la cadena tenga algún carácter la recorremos
		     int contadorAux = 0;
		     for (int j = 0; j < cadena.length(); j++) { // recorremos la cadena para contar los caracteres del indice cero
		         if (cadena.charAt(0) == cadena.charAt(j)) {
		             contadorAux++;
		         }
		     }

		     if (contadorAux >= contador) { // si el contador del nuevo caracter es mayor al que ya estaba guardado, lo cambiamos
		         contador = contadorAux;
		         caracter = cadena.charAt(0);
		     }

		     // borramos los carácteres contados para ahorrar entrar mas veces para contarlos otra vez
		     cadena = cadena.replaceAll(cadena.charAt(0) + "", "");
		 }
		 System.out.println(caracter + " " + contador);
	}

}
