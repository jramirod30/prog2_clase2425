


public class ReproductorMusica {
	// contiene las canciones que se pueden reproducir
	private Cancion[] listaReproduccion;
	private int noCanciones;
	// indica la pos de la siguiente canci�n a reproducir
	// si la listaReproduccion est� vac�a, punteroReproduccion es -1
	private int punteroReproduccion; 

	public ReproductorMusica(int capacidad){
		
	}

	public String toString(){	
		String salida = "";
		for(int i=0; i < noCanciones; i++)
			salida += listaReproduccion[i].toString() + ", ";
		
		salida += "punteroApuntaA=" + 
				listaReproduccion[punteroReproduccion].toString();
		
		return salida;
	}

	/**
	 * POST: Si hay una canci�n 
	 * con el t�tulo y la duraci�n dadas,
	 * devuelve la posici�n de la primera ocurrencia
	 * e.o.c. devuelve -1 
	 *
	 */
	private int buscarCancion(String titulo, double duracion){	
		return 0;
	}

	/**
	 * POST: 
	 * Si la canci�n dada est� en la lista, 
	 *   borra la primera ocurrencia de la canci�n.
	 *   Si quedan canciones, deja el puntero apuntando a la primera canci�n.
	 *   Si no quedan canciones, se deja el puntero con valor -1.
	 * e.o.c. no hace nada
	 */
	public void borrarCancion(String titulo, double duracion){
		
	}

	/**
	 * PRE: Hay suficiente espacio libre para las nuevas canciones
	 * POST: Inserta las canciones en la lista (al final)	
	 * Deja el puntero apuntando a la primera canci�n insertada
	 * Utiliza las canciones del vector dado y no crea copias
	 * Si canciones.length = 0, no hace nada.
	 */
	public void insertarCanciones(Cancion[] canciones){
		
		
	}

	/**	
	 * POST: Si la canci�n existe, pone el puntero en la primera ocurrencia 
	 * de la canci�n con el t�tulo y la duraci�n dados
	 * e.o.c. deja el puntero igual
	 */
	public void seleccionarCancion(String titulo, double duracion){
		
	}

	/**
	 * PRE: la lista no est� vac�a
	 * POST: reproduce la canci�n a la que apunta el puntero
	 */
	public void reproducirCancionSeleccionada(){
		
	}

	/**
	 * PRE: la lista no est� vac�a y 
	 * el puntero no est� en la �ltima canci�n
	 * POST: avanza el puntero a la siguiente canci�n de la lista
	 */
	public void avanzarPuntero(){
		
	}

	/**
	 * POST: Indica si el puntero est� en la �ltima canci�n de la lista 
	 */
	public boolean haySiguiente(){
		return false;
	}

	/** 
	 * POST: Devuelve un vector con copias de las canciones que
	 * se han escuchado igual o m�s de un n�mero dado de veces.	
	 * Si no hay ninguna, se devuelve un vector de tama�o cero. 
	 */
	public Cancion[] seleccionarCancionesMasEscuchadas(int veces){
		
		return null;
	}

	

}
