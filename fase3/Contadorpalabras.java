package fase3;

import java.util.HashSet;
import java.util.Scanner;

public class Contadorpalabras {
	public static void main(String [] args) {
		HashSet<String> contador = new HashSet<>();
		Scanner teclador = new Scanner(System.in);
		String palabra = "";
		
		int cont = 1;
		do {
			System.out.println("Ingrese palabras únicas || para terminar 'salir'");
			
			palabra = teclador.nextLine();
			
			if(palabra.equals("salir")) {
				System.out.println("Programa terminó con éxito");
				break;
			}
			
			System.out.printf("%d palabra ingresada\n",cont);
			
			if(contador.contains(palabra)) {
				cont --;
				System.out.println("Ya insertó esa palabra, pruebe otra\n");
				break;
			}
			else {
				contador.add(palabra);
				cont++;
			}
		}
		while(true);
		System.out.printf("Total ingreso : %d\n",cont);
		for(String e : contador) {
			System.out.printf("Palabra: %s\n",e);
		}
	}
}
