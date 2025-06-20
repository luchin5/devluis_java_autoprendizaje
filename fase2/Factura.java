package fase2;

public class Factura implements Imprimible{
	double monto;
	double importe;
	
	@Override
	public void imprimirFactura() {
		System.out.printf("Importe de la factura : %.2f \n",importe);
		
	}
	
	@Override
	public void emitirFactura() {
		System.out.printf("Emitir factura con el monto: %.2f \n",monto);
		
	}
	
	public static void main(String [] args) {
		Factura f1 = new Factura();
		f1.importe = 1.33;
		f1.monto = 2555.60;
		f1.imprimirFactura();
		f1.emitirFactura();
	}
	
	
	
}
