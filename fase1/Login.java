package fase1;

import java.util.Scanner;

public class Login {
	public static void main(String [] args) {
		System.out.println("LOGIN ");
		String usuario_registrado ="luchin";
		String password = "1234";
		
		String entrada = "", pass = "";
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese su usuario");
			entrada = teclado.nextLine();
			System.out.println("Ingrese su contraseña");
			pass = teclado.nextLine();
			
			
			// EN JAVA SE COMPARAN CADENAS CON EQUALS
			
			
			if(entrada.equals(usuario_registrado) && pass.equals(password)) {
				System.out.println("Login exitoso, ingresando ...");
				break;
			}
			else {
				System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
			}
			
		}while(true);
		teclado.close();
	}
}
