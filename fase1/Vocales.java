package fase1;

import java.util.Scanner;

public class Vocales {
	
	public static void main(String [] args) {
		System.out.println("CONTADOR DE VOCALES");
		String palabra;
		int contador = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		palabra = teclado.nextLine();
		palabra = palabra.toLowerCase(); // para convertir todo a minuscula
		
		for (int i = 0 ;i<palabra.length();i++) {
		if(palabra.charAt(i) == 97 || palabra.charAt(i) == 101 || palabra.charAt(i) == 111 || palabra.charAt(i) == 105 || palabra.charAt(i) == 117)	
			contador ++;
		}
		System.out.printf("Vocales en la palabra %d",contador);
		teclado.close();
	}
}
