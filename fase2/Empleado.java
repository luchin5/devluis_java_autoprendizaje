package fase2;

public abstract class Empleado {
	double salario;
	String codigoEmpleado;
	
	public void mostrarSalario() {
		System.out.printf("Este el sueldo: %.2f\n", salario);
		
	}
	
	public void mostrarCodigo() {
		System.out.printf("Este codigo es: %s\n", codigoEmpleado);
	}
	
	public abstract void trabajar();
}
