package fase1;

public class Diezprimos {
	public static void main(String [] args) {
		System.out.println("DIEZ PRIMEROS NÚMEROS PRIMOS");
		
		int encontrado = 0;
		int contador = 0;
		int numero = 2;
		
		while (encontrado <100) {
			for (int i=1;i<=numero;i++) {
				if(numero % i ==0) {
					contador ++ ;
				}
			}
			if(contador >2) {
				
				contador = 0;
			}
			else {
				encontrado ++ ;
				System.out.printf("Primo: %d\n",numero);
				contador = 0;
			}
			numero++;
		}
	}
}
