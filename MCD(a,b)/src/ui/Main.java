package ui;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese primer numero:");
        num1=teclado.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2=teclado.nextInt();
        
        while(num1 != num2) {
            if(num1>num2)
                num1= num1-num2;
            else
                num2= num2 -num1;
        }
        
        System.out.println("El MCD es:" +num1);
	}
	
	//Metodo usando modulo.
	public static int maximoComunDivisor(int a, int b) {
	    int temporal;//Para no perder b
	    while (b != 0) {
	        temporal = b;
	        b = a % b;
	        a = temporal;
	    }
	    return a;
	}
	
	//Metodo recursivo usando modulo.
	public static int maximoComunDivisorRecursivo(int a, int b) {
	    if (b == 0) return a;
	    return maximoComunDivisorRecursivo(b, a % b);
	}
}
