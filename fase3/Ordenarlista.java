package fase3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenarlista {
	public static void main(String [] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Ingrese números para ordernarlos || -1 para salir");
			numero = teclado.nextInt();
			if(numero == -1) {
				System.out.println("Terminó sesión");
				break;
			}
			numeros.add(numero);
			
		}while(true);
		System.out.println("Los números son:");
		for(Integer i : numeros) {
			System.out.printf("Número: %d\n",i);
		}
		
		Collections.sort(numeros);
		System.out.println("Los números son:");

		for(Integer i : numeros) {
			System.out.printf("Número: %d\n",i);
		}
		
		
	}
}
