package fase2;

public class Programador extends Empleado{
	String nombre;
	int edad;
	String dni;
	
	public void programar() {
		System.out.print("Estoy programando ...");
		
	}
	
	@Override
	public void trabajar() {
		System.out.println("Estoy trabajando...");
	}
	
	public static void main(String [] args) {
		Programador p1 = new Programador();
		p1.salario = 22000;
		p1.mostrarSalario();
		p1.trabajar();
	}
}
