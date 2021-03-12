package ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main2 {
	public static void main(String[] args)
	{
		// Definimos una estructura de datos (hash table) que contendra el
		// caracter y las veces que aparece en la cadena
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
 
		String cadena = "Cadena para contar las palabras";
 
		// Bucle que recorre la cadena y va añadiendo las letras y sumando las
		// coincidencias
		for ( int i = 0; i < cadena.length(); i++ ) {
			if ( h.containsKey ( cadena.charAt ( i ) ) ) {
				h.put ( cadena.charAt ( i ), (int)h.get ( cadena.charAt ( i ) ) + 1 );
			} else {
				h.put ( cadena.charAt ( i ), 1 );
			}
		}
 
		Set<Map.Entry<Character, Integer>> freq = h.entrySet();
 
		Iterator<Map.Entry<Character, Integer>> it = freq.iterator();
 
		// Mostramos el resultado en la pantalla
		while ( it.hasNext() ) {
			Map.Entry<Character, Integer> item = it.next();
			System.out.println ( item.getKey() + ": " + item.getValue() );
		}
	}
}
