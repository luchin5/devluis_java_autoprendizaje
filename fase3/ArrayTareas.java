package fase3;

import java.util.ArrayList;

class Tarea{
	String curso;
	String descripcion;
	
	Tarea(String curso,String descripcion){
		this.curso=curso;
		this.descripcion = descripcion;
	}
	
	public void hacerTarea() {
		System.out.printf("Haciendo : %s del curso de: %s\n",descripcion, curso);
	}
	
	
}

public class ArrayTareas {
	
	public static void main(String [] args) {
		Tarea t1 = new Tarea("CTA","A");
		Tarea t2 = new Tarea("Programacion","POO");
		
		
		ArrayList<Tarea> tareas = new ArrayList<>();
		
		tareas.add(t1);
		tareas.add(t2);
		System.out.printf("Cantidad de tareas: %d\n",tareas.size());
		
		tareas.remove(0);
		
		for(Tarea t: tareas) {
			
			t.hacerTarea();
		}
		
		
	}
}
