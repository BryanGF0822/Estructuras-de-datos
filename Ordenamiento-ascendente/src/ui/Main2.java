package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2 {
	
	public static class Numero{
		private Numero sig; private int valor;
		public Numero(int v) { valor = v; sig = null;}
		public int darValor() { return valor;}
		public Numero darSiguente() { return sig;}
		public void cambiarSiguiente(Numero s) { sig = s;}
	}
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader
					(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter
					(new OutputStreamWriter(System.out));
			
			String linea = br.readLine();
			int n = Integer.parseInt(linea);
			linea = br.readLine();
			int valor = Integer.parseInt(linea);
			Numero primero = new Numero(valor);
			for (int i = 1; i < n; i++) {
				linea = br.readLine();
				valor = Integer.parseInt(linea);
				Numero nuevo = new Numero(valor);
				if (valor<=primero.darValor()) {
					nuevo.cambiarSiguiente(primero);
					primero = nuevo;
				} else {
					Numero actual = primero;
					while (actual.darSiguente()!=null && valor>actual.darSiguente().darValor()) {
						actual = actual.darSiguente();
					}
					nuevo.cambiarSiguiente(actual.darSiguente());
					actual.cambiarSiguiente(nuevo);
				}
			}
			while (primero!=null) {
				bw.write(primero.darValor()+"\n");
				primero = primero.darSiguente();
			}
			bw.close();
			br.close();
		
	}

}
