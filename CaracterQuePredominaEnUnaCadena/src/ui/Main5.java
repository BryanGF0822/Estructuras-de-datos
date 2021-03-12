package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Main5 {
	
	public static BufferedReader br;
	public static BufferedWriter bw;

	public static void main(String args[]) throws Exception {

		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		solve();
		
		br.close();
		bw.close();
		
	}
	
	private static void solve() throws Exception, IOException {
String chain = br.readLine();
		
		

		Map<Character, Integer> myHashMap = new HashMap<>();

		for (int i = 0; i < chain.length(); i++){

			if (myHashMap.containsKey(chain.charAt(i))){

				myHashMap.put(chain.charAt(i), myHashMap.get(chain.charAt(i)) + 1);

			}

			else{

				myHashMap.put(chain.charAt(i), 1);

			}

		}



		char keyMode = 'a';

		int valueMode = 0;

		@SuppressWarnings("rawtypes")
		Set setOfHashMap = myHashMap.entrySet();

		@SuppressWarnings("rawtypes")
		Iterator MyIterator = setOfHashMap.iterator();

		while (MyIterator.hasNext()){

			@SuppressWarnings("rawtypes")
			Map.Entry currentElement = (Map.Entry) MyIterator.next();

			if ((int) currentElement.getValue() > valueMode)

			{

				keyMode = (char) currentElement.getKey();

				valueMode = (int) currentElement.getValue();

			}

			else if ((int) currentElement.getValue() == valueMode)

			{

				int keyOp = keyMode;

				int key1 = (char) currentElement.getKey();

				if (keyOp > key1)

				{

					keyMode = (char) currentElement.getKey();

				}

			}

		}

		bw.write(keyMode + " " + valueMode);

	}

}
