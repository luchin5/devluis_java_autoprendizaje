package fase4;

public class Excepcionmath {
	public static void main(String [] args) {
		int dividendo = 200;
		int divisor = 0;
		
		try {
			int cociente = dividendo / divisor;
			System.out.println(cociente);
		}catch(ArithmeticException a) {
			System.out.println("NO PUEDES DIVIDIR ENTRE 0 " + a);
		}
	}
}
