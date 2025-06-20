package fase1;

public class Tablamultiplicar {
	public static void main(String [] args) {
		System.out.println("TABLA MULTIPLICAR");
		int tabla = 5; // tabla del 5 la que tu quieras
		
		for(int i=0;i<=10;i++) { // recorres la i y se incrementa la i hasta 10
			System.out.printf("%d x %d = %d\n",tabla , i, tabla*i); // tabla x i = resultado
		}
	}
}
