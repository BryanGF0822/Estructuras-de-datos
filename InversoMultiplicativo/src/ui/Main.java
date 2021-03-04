package ui;

public class Main {

	public static void main(String[] args) {
		
		obtenerInverso(3,7);
	}
	
	/*
	CREADO POR JLCY 17-1-2016
	  APLICANDO EL LEMA DE BEZOUT SE CONSIGUE LLEGAR AL MCD DE "a" Y "p" COMO UNA COMBINACION LINEAL DE "a" y "p" CON EL ALGORITMO DE EUCLIDES.

	YA CON ESTO SI EL MCD ES 1 , "a" y "p" son primos relativos y existe el inverso de "a" modulo "m"

	ESTA SOLUCION ES MAS OPTIMA YA QUE NO PARA SOBRE TODOS LOS POSIBLES INVERSOS 

	*/
	    public static void obtenerInverso(int a,int m) {
	    	
	        int c1 = 1;
	        int c2 = -(m/a); //coeficiente de a y b respectivamente
	        int t1 = 0;
	        int t2 = 1; //coeficientes penultima corrida
	        int r = m % a; //residuo, asignamos 1 como condicion de entrada 
	        int x=a,y=r,c;
	        while(r!=0)
	        {
	        c = x/y;//cociente
	        r = x%y;//residuo
	        //guardamos valores temporales de los coeficientes
	        //multiplicamos los coeficiente por -1*cociente de la division
	        c1*=-c;
	        c2*=-c;
	        //sumamos la corrida anterior
	        c1+=t1;
	        c2+=t2;
	        //actualizamos corrida anterior
	        t1=-(c1-t1)/c;
	        t2=-(c2-t2)/c;
	        x=y;
	        y=r;
	        }
	      if(x==1)//residuo anterior es 1 , son primos relativos y el inverso existe
	            System.out.println(""+t2);
	      else
	            System.out.println("No hay inverso");
	    }
}
