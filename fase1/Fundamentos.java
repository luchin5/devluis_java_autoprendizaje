package fase1;

import java.util.Scanner; 
public class Fundamentos {
	public static void main(String[] args) {
		int a,b,resultado=0;
		char operador;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Bienvenido a la calculadora");
			System.out.println("Ingresa el primer número | para terminar -1");
			a = teclado.nextInt();
			
			if(a==-1) {
				System.out.println("Calculadora finalizada");
				break;
			}
			System.out.println("Ingresa el segundo número");
			b = teclado.nextInt();
			
			System.out.println("Ingresa el operado : + - * /");
			operador = teclado.next().charAt(0);
			
			switch(operador)
			{
				case '+': resultado = a + b;
					break;
				case '-': resultado = a - b;
					break;
				case '*': resultado = a * b;
					break;
				case '/': 
					if(b!=0) {
						resultado = a /b;
						
					}
					else {
						System.out.println("No puedes dividir entre 0");
						continue;
					}
					break;
					
			}
			System.out.printf("Resultado es: %d\n",resultado);
		
		}while(true);
		teclado.close();
		
	}
}
