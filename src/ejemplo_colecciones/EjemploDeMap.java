package ejemplo_colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EjemploDeMap {

	public static void main(String[] args) {
		
		//instancia de interfaz map que contiene los dias de la semana.
		Map<String, String> miMap =new HashMap<>();	
		
		miMap.put("sujeto1", "Seba");
		miMap.put("sujeto2", "Maria");
		miMap.put("sujeto3", "Marisol");
		miMap.put("sujeto4", "Lilson");
		
		//acceder e imprimir un objeto en Map segun su llave.
		String elemento = miMap.get("sujeto1");
		System.out.println(elemento);
		
		//imprimir las llaves del Map.
		imprimir(miMap.keySet());
		
		//imprimir los values del Map.
		imprimir(miMap.values());
		
		//imprimir todos los objetos dentro del Map.
		imprimirTodoMap(miMap);
	
	}
	//metodo para imprimir los datos por consola usando lambdas.
	public static void imprimir( Collection<String> coleccion ) {
		coleccion.forEach(elemento -> {
			System.out.println("El elemento es: " + elemento);
		});
	};
	
	//metodo para imprimir todos los objetos del Map.
	
	/* se utilizan los metodos getKey y getValue para tomar cada objeto,
	 * y un ciclo forEach para que se repita el proceso con cada objeto
	 * entry.getKey();
	 * entry.getValue();
	 * */
	public  static void imprimirTodoMap(Map<String, String> mapa) {
	
		mapa.entrySet().forEach(entry ->{	
			System.out.println("Llave: " + entry.getKey() + " y su valor es: " + entry.getValue());						
		});
	}
}
