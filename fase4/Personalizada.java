package fase4;

class Excepcionedad extends Exception{
	
	
	public Excepcionedad(String mensaje) {
		super(mensaje);
	}
}



public class Personalizada {
	public static void verificar(int edad) throws Excepcionedad{
		if(edad<0 || edad > 120) {
			throw new Excepcionedad("no validad : " + edad);
		}else {
			System.out.println("Edad "+ edad);
		}
	}
	
	public static void main(String [] args) {
		try {
		Personalizada p = new Personalizada();
		Personalizada.verificar(-1);
		}
		catch(Excepcionedad e) {
			System.out.println("mensaje: "+e.getMessage());
		}
	}
}
