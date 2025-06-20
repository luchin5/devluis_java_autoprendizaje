package fase2;

class Animal {
	
	String especie = "";
	
	public void mostrarEspecie() {
		System.out.printf("Soy de la especie: %s",especie);
	}
	
	public void hacerSonido() {
		System.out.print("Hago un sonido");
	}
	
	public static void main(String [] args) {
		Gato g1 =new Gato();
		g1.especie = "Félido";
		g1.mostrarEspecie();
		g1.hacerSonido();
		
	}
}

class Perro extends Animal{
	
	@Override
	public void hacerSonido() {
		System.out.println("Gua gua");
	}
}

class Gato extends Animal{
	
	
	@Override
	public void hacerSonido() {
		System.out.println("Miau");
	}

}




