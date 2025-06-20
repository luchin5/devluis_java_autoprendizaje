package fase4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {
	public static void main(String [] args) {
		String rutaarchivo = "C:\\Users\\luchi\\eclipse-workspace\\mijava\\textoprueba.txt";
		
		int lineas = 0;
        int palabras = 0;
        
        BufferedReader br = null;
        

        try {
        	br = new BufferedReader(new FileReader(rutaarchivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                lineas++;
                // separa la línea en palabras por espacios
                String[] palabraArray = linea.trim().split("\\s+");
                if (!linea.trim().isEmpty()) {
                    palabras += palabraArray.length;
                    
                }
                
            }

            System.out.println("Líneas: " + lineas);
            System.out.println("Palabras: " + palabras);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
	}
}
