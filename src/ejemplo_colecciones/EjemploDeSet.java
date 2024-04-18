package ejemplo_colecciones;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EjemploDeSet {

	public static void main(String[] args) {
		
		/*instancia de interfaz Set que contiene los dias de la semana,
		 *  no respeta orden y no acepta objetos repetidos.*/
		Set<String> miSet = new HashSet<>();
		
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Sabado");
		miSet.add("Domingo");
		
		//uso de metodo imprimir para desplegar los objetos del set por consola.
		imprimir(miSet);
	
	}//fin del metodo main.
	
	//metodo para imprimir datos por consola usando lambdas.
	public static void imprimir(Collection<String> coleccion) {
		coleccion.forEach(elemento -> {
			System.out.println("el elemento: " + elemento);
		});
	}
}
