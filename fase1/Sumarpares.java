package fase1;

public class Sumarpares {
	public static void main(String [] args) {
		System.out.println("SUMAR PARES DEL 1 AL 100");
		int suma = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				suma = suma + i;
			}
		}
		System.out.printf("SUMA TOTAL: %d",suma);
	}
}
