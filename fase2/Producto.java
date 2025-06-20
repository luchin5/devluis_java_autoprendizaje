package fase2;

public class Producto {
	String nombre;
	int cantidad;
	String marca;
	
	public void crearProducto(String nombre,int cantidad,String marca) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.marca = marca;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void updateNombre(String nombre) {
		this.nombre = nombre;
	}
}
