package fase1;

import java.util.Scanner;

public class Mayordetres {
	public static void main(String [] args) {
		System.out.println("MAYOR DE 3 NÚMEROS INGRESADOS");
		Scanner teclado = new Scanner(System.in);
		int mayor =0;
		int a,b,c = 0 ;
		System.out.println("Ingrese 3 números y veremos el mayor:");
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		
		mayor = a;
		
		if(b > mayor) {
			mayor = b;
			
		}
		if(c > mayor) {
			mayor = c;
		}
		
		System.out.printf("NUMERO MAYOR ES %d",mayor);
	
		teclado.close();
		
	}
}
