package fase3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Pilaycola {
	public static void main(String [] args) {
		Stack<String> torta = new Stack<>();
		
		torta.push("Chocolate");
		torta.push("Fresa");
		torta.push("Manjar");
		torta.push("Chantilly");
		
		System.out.println("\n" + torta);
		for(int i = torta.size()-1;i>=0;i--) {
			System.out.println("Capas ||" + torta.get(i) + "||");
			System.out.println("Capas -----------------------");
		}
		
		Queue<String> clientes = new LinkedList<>();
		int contador = 0;
		String nombre = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bienvenido al concierto de BTS || o escriba 'salir' ");
		System.out.println("Formese en la cola");
		do {
			
			nombre = teclado.nextLine();
			if(nombre.equals("salir")) {
				break;
			}
			clientes.add(nombre);
			
			//contador ++;
			
		}while(true);
		System.out.println("Se acabó la formación ");
		
		String atendido = "";
		System.out.println("Entradas para: "+ clientes);
		do {
			System.out.println("Atender: atender || salir");
			atendido =teclado.nextLine();
			if(atendido.equals("salir")) {
				break;
			}
			if(atendido.equals("atender")) {
			System.out.println("-" + clientes.element());
				clientes.poll();
			
				System.out.println("-> ATENTIDO. GRACIAS");
			}
			if(clientes.size() == 0) break;
			
			
		}while(true);
		System.out.println("Se terminó la atención . Venga mañana");
		
		
	}
}
