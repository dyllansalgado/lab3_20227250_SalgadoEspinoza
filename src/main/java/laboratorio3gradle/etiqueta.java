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
public class etiqueta {
	String etiqueta;
	String descripcionEtiqueta;
	//Constructor
	public etiqueta(String etiqueta, String descripcionEtiqueta) {
        this.etiqueta = etiqueta;
        this.descripcionEtiqueta = descripcionEtiqueta;   
    }
	//Selector
	public String getEtiqueta() {return etiqueta;}
	public String getDescripcionEtiqueta() {return descripcionEtiqueta;}
	//Modificador
	public void setDescripcionEtiqueta(String descripcionEtiqueta) {this.descripcionEtiqueta = descripcionEtiqueta;}
	public void setEtiqueta(String etiqueta) {this.etiqueta = etiqueta;}
}
