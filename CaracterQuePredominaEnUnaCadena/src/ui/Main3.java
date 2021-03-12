package ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		try (Scanner lector = new Scanner (System.in)) {
			String cadena = "";
			cadena = lector.nextLine();
			Map<Character, Integer> numChars = new HashMap<Character, Integer>();

			for (int i = 0; i < cadena.length(); ++i)
			{
			    char charAt = cadena.charAt(i);

			    //Se busca si la letra en el HashMap, como no existe la agregamos con un '1'
			    if (!numChars.containsKey(charAt))
			    {
			        numChars.put(charAt, 1);
			    }
			    else
			    {
			        //Como la letra ya existe vamos por el contador de esa letra y 
			        //le sumamos uno y la agregamos 'remplazando' la letra anterior
			        numChars.put(charAt, numChars.get(charAt) + 1);
			    }
			}

			//Aquí imprimo el HashMap con los resultados 
			//System.out.println(numChars);

			//o aquí la forma de iterar el HashMap
			Iterator it = numChars.entrySet().iterator();
			while (it.hasNext()) {
			    Map.Entry pair = (Map.Entry)it.next();
			    System.out.println(pair.getKey() + " = " + pair.getValue());
			    it.remove();
			}
		}
	}

}
