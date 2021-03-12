package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main4 {

	public static void main(String args[]) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String text = reader.readLine();
		
		Map<Character, Integer> theHashM = new HashMap<Character, Integer>();

		for (int i = 0; i < text.length(); i++) {
			if (theHashM.containsKey(text.charAt(i)) == false) {
				theHashM.put(text.charAt(i), 1);

			} else {
				theHashM.put(text.charAt(i), theHashM.get(text.charAt(i)) + 1);

			}

		}

		String maxOcurrence = maximumOccurrence(theHashM);
		
		writer.write(maxOcurrence);
		
		reader.close();
		writer.close();

	}
	
	@SuppressWarnings("rawtypes")
	public static String maximumOccurrence(Map theHashM) {
		
		@SuppressWarnings("unused")
		String str ="";
		char reference = 'a';
		int maximumOccurrence = 0;

		
		Set setOfHashM = theHashM.entrySet();
		Iterator iterator = setOfHashM.iterator();

		while (iterator.hasNext()) {
			Map.Entry currentPartner = (Map.Entry) iterator.next();
			
			if ((int) currentPartner.getValue() == maximumOccurrence) {
				int temp = reference;
				int tempKey = (char) currentPartner.getKey();

				if (temp > tempKey) {
					reference = (char) currentPartner.getKey();
				}
			} else if ((int) currentPartner.getValue() > maximumOccurrence) {
				reference = (char) currentPartner.getKey();
				maximumOccurrence = (int) currentPartner.getValue();

			}

		}
		
		return str = reference + " " + maximumOccurrence;
	}

}
