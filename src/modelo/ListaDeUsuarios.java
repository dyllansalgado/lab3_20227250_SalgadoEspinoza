package modelo;

/**
 * Clase de lista de usuarios	
 * @author dyllan
 *
 */
public class ListaDeUsuarios {
	private nodoUsuario cabeza = null;
	private int tamano;
	/**
	 * 
	 * @author dyllan
	 *
	 */
	private class nodoUsuario {
		private usuario myUsuario;
		private nodoUsuario siguiente = null;
		//Constructor
		public nodoUsuario(usuario myUsuario) {this.myUsuario = myUsuario;}
		public nodoUsuario getSiguiente() {return siguiente;}
		public void setSiguiente(nodoUsuario siguienteUsuario) {this.siguiente= siguienteUsuario;}
		//public usuario getMyUsuario() {return myUsuario;}
	}
	
	public ListaDeUsuarios() {}
	//Metodos
	/**
	 * Insertar la inicio de la lista
	 * @param myArchivo  archivo que se quiere agregar a la lista
	 */
	public void insertarPrincipio(usuario miUsuario){
		nodoUsuario nodo = new nodoUsuario(miUsuario) ;
		//EL siguiente elemento es la cabeza
		nodo.setSiguiente(cabeza);
		//Y la nueva cabeza es el nodo
		setCabeza(nodo);
		setTamano(tamano+1);
	}
	/**
	 * Insertar un archivo al final de la lista
	 * @param myArchivo  archivo que se quiere agregar a la lista
	 */
	//Insertar al final
	public void insertarFinal(usuario miUsuario) {
		nodoUsuario usuario = new nodoUsuario(miUsuario);
		nodoUsuario puntero = getCabeza() ;
		//Mientras no llegemos al final del puntero
		while(puntero.siguiente !=null) {
			puntero = puntero.getSiguiente();}
		//Una vez llegado al final, asignamos el nuevo nodo
		puntero.setSiguiente(usuario);	
		setTamano(tamano +1);		
	}
	/**
	 * Agregar un usuario a la lista de usuario
	 * @param myArchivo archivo que se quiere agregar a la lista
	 */
	public void agregarUsuario(usuario miUsuario) {
		if (isEmpty()) {
			insertarPrincipio(miUsuario);
		}else {
			insertarFinal(miUsuario);
		}
	}	
	
	/**
	 * Metodo que consulta si un archivos se encuentra dentro de otra lista de archivos
	 * @param archivo que se va a comparar con el resto de los archivos, se compara solo el nombre
	 * @return Boolean true si se encuentra dentro, false si no se encuentra
	 */
	public Boolean isInside(usuario myUsuario) {
		nodoUsuario puntero = getCabeza();
		while (puntero != null) {
			//Comparamos solo con el nombre
			//System.out.println("Name archivo : " + archivo.getNombre());
			//System.out.println("Name puntero : " + puntero.myArchivo.getNombre()+ "\n");
			if (myUsuario.getNombreUsuario().equals(puntero.myUsuario.getNombreUsuario())) {
				//System.out.println("El archivo ya se encuentra en la lista de archivos\n");
				return true;
			}else {
				puntero = puntero.getSiguiente();	
			}	
		}
		return false;
	}
	
	/**
	 * Devolver todos los archivos y su contenido en un string
	 * @return
	 */
	public String usuarios2String() {
		if (!isEmpty()) {
			nodoUsuario puntero =  getCabeza();
			String salidaString = "Usuarios registrados : \n";
			int i = 0 ;
			while (puntero != null) {
				salidaString = salidaString +"i :"+ i + ".-\n";
				salidaString = salidaString + puntero.myUsuario.getNombreUsuario();
				puntero = puntero.getSiguiente();
				i++;
			}
			return (salidaString +"\n");
		}else {
			return("Lista de archivos vacia\n");
		}
	}
	
	//Esta vacia la lista de archivos
	public Boolean isEmpty() {return tamano == 0;}
	//Setters and Getters
	public int getTamano() {return tamano;}
	public void setTamano(int tamano) {this.tamano = tamano;}
	public nodoUsuario getCabeza() {return cabeza;}
	public void setCabeza(nodoUsuario cabeza) {this.cabeza = cabeza;}
}