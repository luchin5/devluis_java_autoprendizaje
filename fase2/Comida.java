package fase2;

public class Comida extends Producto{

	int cantidadPorciones;
	
	public static void main(String [] args) {
		Comida c1 = new Comida();
		c1.cantidadPorciones = 10;
		c1.crearProducto("Sopa instantanea", 1, "Ajinomen");
		System.out.printf("Nombre : %s \n",c1.getNombre());
		System.out.printf("Cantidad : %d \n",c1.getCantidad());
		System.out.printf("Marca : %s \n",c1.getMarca());
		c1.updateNombre("Ramen");
		System.out.printf("Nombre : %s \n",c1.getNombre());
	}
	
}
