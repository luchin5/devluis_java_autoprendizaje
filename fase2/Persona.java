package fase2;

public class Persona {
	 int edad = 0;
	 double peso = 0;
	 String nombre = "";
	
	 public double getPeso() {
		return peso;
	}

	 public void setPeso(double peso) {
		 this.peso = peso;
	 }

	 public int getEdad() {
		 return edad;
	 }
	 
	 public void setEdad(int x) {
		this.edad = x;
	 }
	 
	 public Persona() {};
	 public Persona(int _edad,double _peso,String nombre) {
		 this.edad =_edad;
		 this.nombre = nombre;
		 this.peso = _peso;
	 }
	 
	// LOS STATICS ES GENERAL A TODA LA CLASE PAERSONA 
	public static void saludad() { 
		System.out.println("somos personas , decimos todos hola ...");
	}
	
	public void saludar() {
		System.out.print("Hola, que tal...");
	}
	
	public void mostrarInfo() {
		System.out.println("Mis datos son:");
		System.out.printf("Mi nombre es : %s \n ",nombre);
		System.out.printf("Mi edad es : %d \n",edad);
		System.out.printf("Mi peso es : %.2f \n",peso);
		
	}
	
	public static void main(String [] args) {
		Persona p1 = new Persona(12,25,"Luis");
		p1.mostrarInfo();
		p1.saludar();
		
		
		
		
	}	

}

