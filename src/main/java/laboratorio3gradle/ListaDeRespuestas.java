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
		public nodoRespuesta(respuesta miRespuesta) {
			myRespuesta = miRespuesta;
			siguiente = null;
		}
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
	public void agregarRespuesta(respuesta miRespuesta) {
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
			String salidaString = "\n\nRespuestas realizadas : ";
			int i = 0 ;
			while (puntero != null) {
				salidaString = salidaString+"\n\n" + i + ".-";
				salidaString = salidaString + puntero.myRespuesta.respuesta2String();
				puntero = puntero.getSiguiente();
				i++;
			}
			return (salidaString +"\n");
		}else {
			return("\nNo existen respuestas a esta pregunta\n");
		}
	}
	
	public respuesta getRespuestaN(int n) {
		//Si el n ingresado no supera el tamano total de archivos
		if (n > tamano || n < 0) {
			System.out.println("El indice excede al limite de archivos");
			return null;
		}else{
			nodoRespuesta puntero =  getCabeza();
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
				return puntero.myRespuesta;
				//return puntero.myArchivo;
			}
		}
		
	}
	
	//Esta vaci­a la lista de archivos
	public Boolean isEmpty() {return tamano == 0;}
	//Setters and Getters
	public int getTamano() {return tamano;}
	public void setTamano(int tamano) {this.tamano = tamano;}
	public nodoRespuesta getCabeza() {return cabeza;}
	public void setCabeza(nodoRespuesta cabeza) {this.cabeza = cabeza;}
}