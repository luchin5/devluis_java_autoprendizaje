package fase1;

import java.util.ArrayList;

public class Invertirlista {
	public static void main(String [] args) {
		
		int []numeros = new int[5];
		
		numeros[0] = 20;
		numeros[1] = 218;
		numeros[2] = 3350;
		numeros[3] = 330;
		numeros[4] = 100;
		
		int impares = 0,pares = 0;
		
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.printf("%d ",numeros[i]);
			
			if(numeros[i]%2 ==0) {
				pares++;
			}
			else {
				impares++;
			}
			
		}
		System.out.printf("Pares son: %d , Impares son %d",pares,impares);
		
		ArrayList<Integer> miarray = new ArrayList<>();
		
		miarray.add(1352);
		miarray.add(2);
		miarray.add(241);
		
		miarray.add(21);
		miarray.add(2111);
		
		for(int i =0;i<miarray.size();i++) {
			System.out.printf("NUMEROS ARRAYLIST %d \n",miarray.get(i));
		}
		
		
		
	}
}
