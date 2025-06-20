package fase2;

public class Estudiante extends Persona{
	
	String codigo_alumno ="";
	
	public void mostrarCodigo() {
		System.out.printf("Codigo alumno :%s\n",codigo_alumno);
	}
	
	
	public static void main(String [] args) {
		Estudiante e1 = new Estudiante();
		e1.codigo_alumno = "1ASDF23B-B";
		e1.edad = 12;
		e1.peso = 50.5;
		e1.nombre = "Carlos";
		
		e1.saludar();
		e1.mostrarInfo();
		e1.mostrarCodigo();
		Persona.saludad();
		
	}
	
}

