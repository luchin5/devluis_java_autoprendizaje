package fase3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fechas {
	public static void main(String [] args) {
		System.out.println("La fecha de hoy es:");
		LocalDate hoy = LocalDate.now();
		LocalDate nacimiento = LocalDate.of(1990, 10, 15);
		LocalDate fechatexto = LocalDate.parse("2025-12-11");
		
		System.out.println("Fechas: "+ hoy +" " +nacimiento +fechatexto);
		System.out.println("Resta: "+ (ChronoUnit.YEARS.between(nacimiento,hoy)));
	}
}
