package fase4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escribiryleer {
	public static void main(String [] args) {
		// RUTA DEL ARCHIVO
		String newruta = "C:\\Users\\luchi\\eclipse-workspace\\mijava\\texto2.txt";
		
		BufferedWriter lapiz =null;
		BufferedReader ojo = null;
		
		String palabra = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba su libro || FIN para terminar");
		
		// ESCRIBIENDO EL LIBRO
		try {
			lapiz = new BufferedWriter(new FileWriter(newruta));
			
			do {
				palabra= teclado.nextLine();
				if(palabra.equals("FIN")) break;
				lapiz.write(palabra);
				lapiz.newLine();
				
			}while(true);
			
		}catch(IOException e) {
			System.out.println("Error a escribir en el archivo");
		}finally {
			try {
				if(lapiz!=null) {
					lapiz.close();
				}
			} catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
		}
		
		System.out.println("Fin de la historia");
		// LEYENDO EL ARCHIVO
		try {
			ojo =new BufferedReader(new FileReader(newruta));
			String linea="";
			while((linea = ojo.readLine())!=null) {
				System.out.println(linea);
			}
			
		}catch(IOException e) {
			System.out.println("Error al leer el archivo: "+e);
		}
	}
}
