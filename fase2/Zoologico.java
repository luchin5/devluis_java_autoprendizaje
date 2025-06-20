package fase2;

import java.util.ArrayList;


abstract class Animale{
	
	public void hacerSonido() {
		System.out.println("...Hacer algún sonido");
	}
}


class Perros extends Animale{
	
	@Override
	public void hacerSonido() {
		System.out.println("...Gua gua");
	}
}


class Gatos extends Animale{
	
	@Override
	public void hacerSonido() {
		System.out.println("...Miau miau");
	}
}

/// EJERCICIO 2

interface Pago{
	public void realizarPago();
}

class PagarconTarjeta implements Pago{
	
	public void realizarPago() {
		System.out.println("Pago con tarjeta debito");
	}
	
}

class PagarconYape implements Pago{
	
	public void realizarPago() {
		System.out.println("Yapeando al número ingresado");
	}
}

/// EJERCICIO 3

class Figura{
	
	public void dibujar() {
		System.out.println("Estoy dibujando ...");
	}
	
}

class Circulo extends Figura{
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando un circulo");
	}
}
class Rectangulo extends Figura{
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando un rectangulo");
	}
}
class Triangulo extends Figura{
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando un triangulo");
	}
}



// POLIMORFISMO
public class Zoologico {
	public static void main(String [] args) {
		
		// con clase abstracta
		ArrayList <Animale> animales = new ArrayList<>();
		Animale an = new Gatos();
		
		animales.add(new Gatos());
		animales.add(new Perros());
		
		for( Animale e : animales) {
			e.hacerSonido();
		}
		
		// con interfaz
		Pago pago1 = new PagarconYape();
		pago1.realizarPago();
		
		Pago pago2 = new PagarconTarjeta();
		pago2.realizarPago();
		
		// con clase base
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Rectangulo());
		figuras.add(new Triangulo());
		
		Figura f1 = new Rectangulo();
		f1.dibujar();
		
		for(Figura a : figuras) {
			a.dibujar();
		}
		
		
	}
}
