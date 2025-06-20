package fase2;

public class Gerente extends Empleado{
	String nombre;
	int edad;
	String dni;
	
	public void mostrarDatos() {
		System.out.printf("Nombre: %s > Edad: %d > DNI: %s", nombre,edad,dni);
	}
	
	@Override
	public void trabajar() {
		System.out.println("Estoy trabajando...");
	}
	
	public static void main(String [] args) {
	
		Gerente g1 = new Gerente();
		g1.nombre = "LUIS";
		
		g1.edad = 22;
		g1.dni = "12341234";
		
		g1.salario = 50000;
		g1.codigoEmpleado = "ASDFA-22";
		g1.mostrarSalario();
		g1.mostrarCodigo();
		
		g1.mostrarDatos();
		g1.trabajar();
		
	}
	
}
