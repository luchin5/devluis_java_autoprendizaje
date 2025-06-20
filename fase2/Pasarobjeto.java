package fase2;

class Generico{
	String nombre;
	int cantidadLados;
	
}
public class Pasarobjeto {
	
	Pasarobjeto(){
		
	}
	Pasarobjeto(Generico generico){
		System.out.printf("Objeto por parámetro: %s",generico.nombre);
	}
	
	public static void main(String [] args) {
		Generico g1 = new Generico();
		g1.nombre = "Objeto1";
		
		Pasarobjeto p1 = new Pasarobjeto(g1);
	}
	
}
