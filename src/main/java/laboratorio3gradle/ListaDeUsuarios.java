/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3gradle;

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
	
	public Boolean correctPass(usuario myUsuario) {
		nodoUsuario puntero = getCabeza();
		while (puntero != null) {
			//Comparamos solo con el nombre
			//System.out.println("Name archivo : " + archivo.getNombre());
			//System.out.println("Name puntero : " + puntero.myArchivo.getNombre()+ "\n");
			if (myUsuario.getNombreUsuario().equals(puntero.myUsuario.getNombreUsuario())) {
				if (myUsuario.getClaveUsuario().equals(puntero.myUsuario.getClaveUsuario())) {
					return true;
				}
				return false;
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
			String salidaString = "Usuarios registrados : ";
			int i = 0 ;
			while (puntero != null) {
				salidaString = salidaString +"\n"+ i + ".-";
				salidaString = salidaString + puntero.myUsuario.getNombreUsuario() + "  Rep  : " + puntero.myUsuario.reputacionUsuario;
				puntero = puntero.getSiguiente();
				i++;
			}
			return (salidaString +"\n");
		}else {
			return("Lista de archivos vaci�a\n");
		}
	}
	public usuario getUsuarioN (int n) {
		//Si el n ingresado no supera el tamaño total de archivos
		if (n > tamano || n < 0) {
			System.out.println("El indice excede al limite de archivos");
			return null;
		}else{
			nodoUsuario puntero =  getCabeza();
			int i = 0 ;
			//Mientras el puntero no sea nulo
			while (i < n && puntero != null) {
				System.out.println(i+".-");
				puntero = puntero.getSiguiente();
				i++;
			}if (i!= n) {
				System.out.println("No hay archivos disponibles");
				return null;
			}else {
				//Creamos un archivo desde 0
				return puntero.myUsuario;
				//return puntero.myArchivo;
			}
		}
	}
	public usuario getUsuarioName (String nombre) {

		nodoUsuario puntero =  getCabeza();
		//Mientras el puntero no sea nulo
		while (puntero != null) {
			if (puntero.myUsuario.nombreUsuario.equals(nombre)) {
				return puntero.myUsuario;
			}
			puntero = puntero.getSiguiente();
		}
		return null;
	}
	
	//Esta vaci�a la lista de archivos
	public Boolean isEmpty() {return tamano == 0;}
	//Setters and Getters
	public int getTamano() {return tamano;}
	public void setTamano(int tamano) {this.tamano = tamano;}
	public nodoUsuario getCabeza() {return cabeza;}
	public void setCabeza(nodoUsuario cabeza) {this.cabeza = cabeza;}
}
