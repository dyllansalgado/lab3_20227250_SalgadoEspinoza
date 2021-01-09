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
public class ListaDeEtiquetas {
	nodoEtiqueta cabeza;
	int tamano;
	
	private class nodoEtiqueta{
		private etiqueta myEtiqueta;
		private nodoEtiqueta siguiente;
		public nodoEtiqueta(etiqueta myEtiqueta) {
			this.setMyEtiqueta(myEtiqueta);
			setSiguiente(null);
		}
		public nodoEtiqueta getSiguiente() {return siguiente;}
		public void setSiguiente(nodoEtiqueta siguiente) {this.siguiente = siguiente;}
		public etiqueta getMyEtiqueta() {return myEtiqueta;}
		public void setMyEtiqueta(etiqueta myEtiqueta) {this.myEtiqueta = myEtiqueta;}
	}
	public ListaDeEtiquetas() {}
	//Metodos
	/**
	 * Insertar la inicio de la lista
	 * @param myArchivo  archivo que se quiere agregar a la lista
	 */
	public void insertarPrincipio(etiqueta miEtiqueta){
		nodoEtiqueta nodo = new nodoEtiqueta(miEtiqueta);
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
	public void insertarFinal(etiqueta miEtiqueta) {
		nodoEtiqueta etiqueta = new nodoEtiqueta(miEtiqueta);
		nodoEtiqueta puntero = getCabeza() ;
		//Mientras no llegemos al final del puntero
		while(puntero.siguiente !=null) {
			puntero = puntero.getSiguiente();}
		//Una vez llegado al final, asignamos el nuevo nodo
		puntero.setSiguiente(etiqueta);	
		setTamano(tamano +1);		
	}
	/**
	 * Agregar un usuario a la lista de usuario
	 * @param myArchivo archivo que se quiere agregar a la lista
	 */
	public void agregarEtiquetas(etiqueta miEtiqueta) {
		if (isEmpty()) {
			insertarPrincipio(miEtiqueta);
		}else {
			insertarFinal(miEtiqueta);
		}
	}	
	
	/**
	 * Metodo que consulta si un archivos se encuentra dentro de otra lista de archivos
	 * @param archivo que se va a comparar con el resto de los archivos, se compara solo el nombre
	 * @return Boolean true si se encuentra dentro, false si no se encuentra
	 */
	public Boolean isInside(etiqueta myEtiqueta) {
		nodoEtiqueta puntero = getCabeza();
		while (puntero != null) {
			//Comparamos solo con el nombre
			//System.out.println("Name archivo : " + archivo.getNombre());
			//System.out.println("Name puntero : " + puntero.myArchivo.getNombre()+ "\n");
			if (myEtiqueta.getEtiqueta().equals(puntero.getMyEtiqueta().getEtiqueta())) {
				//System.out.println("El archivo ya se encuentra en la lista de archivos\n");
				return true;
			}else {
				puntero = puntero.getSiguiente();	
			}	
		}
		return false;
	}
	public Boolean isInside(String etiqueta) {
		nodoEtiqueta puntero = getCabeza();
		while (puntero != null) {
			//Comparamos solo con el nombre
			//System.out.println("Name archivo : " + archivo.getNombre());
			//System.out.println("Name puntero : " + puntero.myArchivo.getNombre()+ "\n");
			if (etiqueta.equals(puntero.getMyEtiqueta().getEtiqueta())) {
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
	public String etiquetas2String1() {
		if (!isEmpty()) {
			nodoEtiqueta puntero =  getCabeza();
			String salidaString = "Etiquetas :";
			while (puntero != null) {
				salidaString = salidaString + puntero.myEtiqueta.getEtiqueta() +" - ";
				puntero = puntero.getSiguiente();
			}
			return (salidaString +"\n");
		}else {
			return("No existen preguntas en el stack\n");
		}
	}
	public String etiquetas2String2() {
		if (!isEmpty()) {
			nodoEtiqueta puntero =  getCabeza();
			String salidaString = "Etiquetas realizadas : \n";
			int i = 0;
			while (puntero != null) {
				salidaString = salidaString +"\n"+ i + ".-";
				salidaString = salidaString + puntero.myEtiqueta.getEtiqueta() + ":  " + puntero.myEtiqueta.getDescripcionEtiqueta() ;
				puntero = puntero.getSiguiente();
				i++;
			}
			return (salidaString +"\n");
		}else {
			return("\nNo existen etiquetas\n");
		}
	}
	
	/**
	 * Metodo que dado un indice n, devuelva el archivo correspondiente en la lista
	 * @param n, indice donde se encuentra el archivo
	 * @return Archivo, archivo con el indice || null si el indice supera los limites
	 */
	public etiqueta getEtiquetaN(int n){
		//Si el n ingresado no supera el tamaño total de archivos
		if (n > tamano || n < 0) {
			System.out.println("El indice excede al limite de archivos");
			return null;
		}else{
			nodoEtiqueta puntero =  getCabeza();
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
				etiqueta miEtiqueta = new etiqueta(puntero.myEtiqueta.getEtiqueta(), puntero.myEtiqueta.getDescripcionEtiqueta());
				return miEtiqueta;
				//return puntero.myArchivo;
			}
		}
	}
	//Esta vacia la lista de archivos
	public Boolean isEmpty() {return tamano == 0;}
	//Setters and getters
	public nodoEtiqueta getCabeza() {return cabeza;}
	public void setCabeza(nodoEtiqueta cabeza) {this.cabeza = cabeza;}
	public int getTamano() {return tamano;}
	public void setTamano(int tamano) {this.tamano = tamano;}

}
