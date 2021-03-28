package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static BufferedReader breader;
	public static BufferedWriter bwriter;

	public static void main(String args[]) throws Exception {

		breader = new BufferedReader(new InputStreamReader(System.in));
		bwriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(breader.readLine());
		bwriter.write(" " + "\n");
		
		for (int i = 0; i < n; i++) {
			
			int size = Integer.parseInt(breader.readLine());
			String line1 = breader.readLine();
			String[] arreglo = line1.split(" ");
			int[] vector = new int[size];
			for (int j = 0; j < size; j++) {
				vector[j] = Integer.parseInt(arreglo[j]);
			}
			
			int [] respuestas = new int[2];
			sumaParesEImpares(0, size -1, vector,respuestas);
			bwriter.write("Suma Impares: " + respuestas[0]+ "\n");
			bwriter.write("Suma Pares: " + respuestas[1]+ "\n" );
			
			if ((respuestas[0] % 2) == 0
					&& (respuestas[1] % 2) != 0) {
				bwriter.write("Es feliz"+ "\n");
			} else {
				bwriter.write("No es feliz"+ "\n");
			}
		}
		

		breader.close();
		bwriter.close();

	}

public static int[]  sumaParesEImpares(int inicio, int fin, int[] arraytoCalculate, int[] toReturn) {
		
		
		if(inicio == fin) {
			if(((inicio + 1) % 2) == 0){
				toReturn[1] += arraytoCalculate[inicio];//pares
			}else {
				toReturn[0] += arraytoCalculate[inicio];//impares
			}
		}else {
			
			int mitad = (inicio+fin)/2;
			 sumaParesEImpares(inicio, mitad, arraytoCalculate,toReturn);
			 sumaParesEImpares(mitad+1, fin, arraytoCalculate, toReturn);
			
			
		}
		
	return toReturn;
	}

}
