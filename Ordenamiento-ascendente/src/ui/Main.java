package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String linea = br.readLine();
		int n = Integer.parseInt(linea);
		int[] A = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			linea = br.readLine();
			int valor = Integer.parseInt(linea);
			A[i] = valor;
			if (k < valor)
				k = valor;
		}

		int[] C = new int[k + 1];
		for (int i = 0; i < n; i++) {
			C[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			C[A[i]] = C[A[i]] + 1;
		}
		for (int i = 1; i <= k; i++) {
			C[i] = C[i] + C[i - 1];
		}
		int[] B = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			B[C[A[i]] - 1] = A[i];
			C[A[i]] = C[A[i]] - 1;
		}
		for (int i = 0; i < B.length; i++) {
			bw.write(B[i] + "\n");
		}
		bw.close();
		br.close();
	}
}