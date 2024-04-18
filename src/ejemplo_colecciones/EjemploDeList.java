package ejemplo_colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploDeList {

	public static void main(String[] args) {
		
		//coleccion dinamica que respeta orden y puede reperir objetos guardados.
		
		////instancia de interfaz List que contiene los dias de la semana.
		List<String> miLista = new ArrayList<>();
		
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Sabado");
		miLista.add("Domingo");
		
		//for each
		
		//ciclo for que toma cada "elemento" en la List y lo imprime por consola.
		for(String elemento: miLista) {
			System.out.println("elemento: "+ elemento);
		}
		
		// desde java 8, programacion funcional.(lambdas)
		
		//forEach que imprime los datos por consola pero con uso de lambdas. 
		miLista.forEach(elementoLambdas -> {
		System.out.println("Elemento :" + elementoLambdas);
		});
			
	}
}
