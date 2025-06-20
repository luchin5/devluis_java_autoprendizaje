package fase1;

import java.util.Scanner;





public class Primo {
	
	
	public static void sabersiesprimo() {
		System.out.println("FUNCION PRIMO");
		int a = 0;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			System.out.println("Ingrese un numero para ver si es primo | -1 para salir");
			
			
			a = teclado.nextInt();
			
			if(a==-1) {
				System.out.println("Sistema finalizado");
				break;
			}
			if(a == 1 || a == 0) {
				System.out.println("No es primo");
			}
			else {
				for(int i =1;i<=a;i++) {
					if(a%i == 0) { // si el residuo es 0 es divisible y cuenta
						contador ++;
					}
				}
				
				if(contador > 2) {
					System.out.println("No es número primo");
					contador = 0;
				}
				else {
					System.out.println("Si es primo");
					contador = 0;
				}
			}
			
			
		}
		teclado.close();
	}

	
	public static void main(String[] args) {
		System.out.println("Primo");
		
		sabersiesprimo();
		
		
	}
}
