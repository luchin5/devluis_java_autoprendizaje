package fase3;

import java.util.HashMap;
import java.util.Scanner;

public class SistemaNotas {
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		HashMap<String,Integer> notas = new HashMap<>();
		
		int nota = 0;
		String nombre = "";
		System.out.println("Sistema de notas v1.0 || para salir escriba 'salir' ");
		do {
			System.out.println("Ingrese el nombre y la nota del alumno(a)");
			
			 nombre = teclado.nextLine();
			if(nombre.equals("salir")) {
				System.out.println("Sistema finalizó con éxito");
				break;
			}
			
			 nota = teclado.nextInt();
			 
			 teclado.nextLine();
			notas.put(nombre, nota);
		}
		while(true);
		
		System.out.println("Las notas son:");
		for(String alumno : notas.keySet()) {
			System.out.println(alumno + ": " + notas.get(alumno));
		}
	}
}
