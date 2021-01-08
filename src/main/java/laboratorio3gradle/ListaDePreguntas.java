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
public class ListaDePreguntas {
	nodoPregunta cabeza;
	int tamano;
	
	private class nodoPregunta{
		private pregunta myPregunta;
		private nodoPregunta siguiente;
		public nodoPregunta(pregunta myPregunta) {
			setMyPregunta(myPregunta);
			setSiguiente(null);
		}
		public nodoPregunta getSiguiente() {return siguiente;}
		public void setSiguiente(nodoPregunta siguiente) {this.siguiente = siguiente;}
		public pregunta getMyPregunta() {return myPregunta;}
		public void setMyPregunta(pregunta myPregunta) {this.myPregunta = myPregunta;}	
	}
	public ListaDePreguntas() {}
	//Metodos
	/**
	 * Insertar la inicio de la lista
	 * @param myArchivo  archivo que se quiere agregar a la lista
	 */
	public void insertarPrincipio(pregunta miPregunta){
		nodoPregunta nodo = new nodoPregunta(miPregunta);
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
	public void insertarFinal(pregunta miPregunta) {
		nodoPregunta pregunta = new nodoPregunta(miPregunta);
		nodoPregunta puntero = getCabeza() ;
		//Mientras no llegemos al final del puntero
		while(puntero.siguiente !=null) {
			puntero = puntero.getSiguiente();}
		//Una vez llegado al final, asignamos el nuevo nodo
		puntero.setSiguiente(pregunta);	
		setTamano(tamano +1);		
	}
	/**
	 * agregar un usuario a la lista de usuario
	 * @param myArchivo archivo que se quiere agregar a la lista
	 */
	public void agregarPreguntas(pregunta miPregunta) {
		if (isEmpty()) {
			insertarPrincipio(miPregunta);
		}else {
			insertarFinal(miPregunta);
		}
	}	
	
	/**
	 * Metodo que consulta si un archivos se encuentra dentro de otra lista de archivos
	 * @param archivo que se va a comparar con el resto de los archivos, se compara solo el nombre
	 * @return Boolean true si se encuentra dentro, false si no se encuentra
	 */
	public Boolean isInside(pregunta myPregunta) {
		nodoPregunta puntero = getCabeza();
		while (puntero != null) {
			//Comparamos solo con el nombre
			//System.out.println("Name archivo : " + archivo.getNombre());
			//System.out.println("Name puntero : " + puntero.myArchivo.getNombre()+ "\n");
			if (myPregunta.getTituloPregunta().equals(puntero.getMyPregunta().getTituloPregunta())) {
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
	public String preguntas2String() {
		if (!isEmpty()) {
			nodoPregunta puntero =  getCabeza();
			String salidaString = "Preguntas realizadas : \n";
			int i = 0 ;
			while (puntero != null) {
				salidaString = salidaString +"i :"+ i + ".-\n";
				salidaString = salidaString + puntero.myPregunta.pregunta2String();
				puntero = puntero.getSiguiente();
				i++;
			}
			return (salidaString +"\n");
		}else {
			return("No existen preguntas en el stack\n");
		}
	}
	//Esta vacia la lista de archivos
	public Boolean isEmpty() {return tamano == 0;}
	//Setters and getters
	public nodoPregunta getCabeza() {return cabeza;}
	public void setCabeza(nodoPregunta cabeza) {this.cabeza = cabeza;}
	public int getTamano() {return tamano;}
	public void setTamano(int tamano) {this.tamano = tamano;}
}