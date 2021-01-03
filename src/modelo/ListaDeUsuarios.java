package modelo;
/**
 * 
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
		public nodoUsuario(usuario myUsuario) {this.setMyUsuario(myUsuario);}
		public nodoUsuario getSiguiente() {return siguiente;}
		public void setSiguiente(nodoUsuario siguienteUsuario) {this.siguiente= siguienteUsuario;}
		//public usuario getMyUsuario() {return myUsuario;}
		public void setMyUsuario(usuario myUsuario) {this.myUsuario = myUsuario;}
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
	 * agregar un usuario a la lista de usuario
	 * @param myArchivo archivo que se quiere agregar a la lista
	 */
	public void agregarUsuario(usuario miUsuario) {
		if (isEmpty()) {
			insertarPrincipio(miUsuario);
		}else {
			insertarFinal(miUsuario);
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