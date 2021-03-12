package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main6 {

	@SuppressWarnings("rawtypes")
	public static void main(String args[]) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String text = reader.readLine();

		char reference = 'a';
		int maximumOccurrence = 0;

		Map<Character, Integer> theHashM = new HashMap<Character, Integer>();

		for (int i = 0; i < text.length(); i++) {
			if (theHashM.containsKey(text.charAt(i)) == false) {
				theHashM.put(text.charAt(i), 1);

			} else {
				theHashM.put(text.charAt(i), theHashM.get(text.charAt(i)) + 1);

			}

		}

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
			/*
			 * if ((int) currentPartner.getValue() > maximumOccurrence) { reference = (char)
			 * currentPartner.getKey(); maximumOccurrence = (int) currentPartner.getValue();
			 * 
			 * } else if ((int) currentPartner.getValue() == maximumOccurrence) { int temp =
			 * reference; int tempKey = (char) currentPartner.getKey();
			 * 
			 * if (temp > tempKey) { reference = (char) currentPartner.getKey(); }
			 * 
			 * }
			 */

		}

		writer.write(reference + " " + maximumOccurrence);

		reader.close();
		writer.close();

	}

}
