/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3gradle;

/**
 *
 * @author dyllan
 */
public class ListaDeRespuestas {
	private nodoRespuesta cabeza = null;
	private int tamano;
	/**
	 * @author dyllan
	 */
	private class nodoRespuesta {
		private respuesta myRespuesta;
		private nodoRespuesta siguiente = null;
		//Constructor
		public nodoRespuesta(respuesta miRespuesta) {}
		public nodoRespuesta getSiguiente() { return siguiente;}
		public void setSiguiente(nodoRespuesta siguiente) {this.siguiente = siguiente;}
	}
	
	public ListaDeRespuestas() {}
	//Metodos
	/**
	 * Insertar la inicio de la lista
	 * @param myArchivo  archivo que se quiere agregar a la lista
	 */
	public void insertarPrincipio(respuesta miRespuesta){
		nodoRespuesta nodo = new nodoRespuesta(miRespuesta);
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
	public void insertarFinal(respuesta miRespuesta) {
		nodoRespuesta respuesta= new nodoRespuesta(miRespuesta);
		nodoRespuesta puntero = getCabeza() ;
		//Mientras no llegemos al final del puntero
		while(puntero.siguiente !=null) {
			puntero = puntero.getSiguiente();}
		//Una vez llegado al final, asignamos el nuevo nodo
		puntero.setSiguiente(respuesta);	
		setTamano(tamano +1);		
	}
	/**
	 * Agregar un usuario a la lista de usuario
	 * @param myArchivo archivo que se quiere agregar a la lista
	 */
	public void agregarUsuario(respuesta miRespuesta) {
		if (isEmpty()) {
			insertarPrincipio(miRespuesta);
		}else {
			insertarFinal(miRespuesta);
		}
	}	
	

	
	/**
	 * Devolver todos los archivos y su contenido en un string
	 * @return
	 */
	public String respuestas2String() {
		if (!isEmpty()) {
			nodoRespuesta puntero =  getCabeza();
			String salidaString = "Respuestas realizadas :";
			int i = 0 ;
			while (puntero != null) {
				salidaString = salidaString+"\n" + i + ".-";
				salidaString = salidaString + puntero.myRespuesta.getAutor() + " " + puntero.myRespuesta.getFechaDeSubida()	+"  :"+ puntero.myRespuesta.getContenido();
				puntero = puntero.getSiguiente();
				i++;
			}
			return (salidaString +"\n");
		}else {
			return("\nNo existen respuestas a esta pregunta\n");
		}
	}
	
	//Esta vacia la lista de archivos
	public Boolean isEmpty() {return tamano == 0;}
	//Setters and Getters
	public int getTamano() {return tamano;}
	public void setTamano(int tamano) {this.tamano = tamano;}
	public nodoRespuesta getCabeza() {return cabeza;}
	public void setCabeza(nodoRespuesta cabeza) {this.cabeza = cabeza;}
}
