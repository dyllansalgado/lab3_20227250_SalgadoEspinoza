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
public class respuesta {
	private String contenido;
	private String autor;
	private String fechaDeSubida;
	private int id;
	public respuesta(String respuesta,String autor,int id) {
		setContenido(respuesta);
		setAutor(autor);
		setId(id);
		setFechaDeSubida(tiempo.getActualTime());
	}
	public String respuesta2String() {
		String salidaString = "ID : " + id 
				+ "\nAutor : " + autor 
				+ "\nRespuesta : " +contenido 
				+ "\nFecha de publicacion : " + fechaDeSubida + "\n";
		return salidaString;
	}
	public String getContenido() {return contenido;}
	public void setContenido(String contenido) {this.contenido = contenido;}
	public String getAutor() {return autor;}
	public void setAutor(String autor) {this.autor = autor;}
	public String getFechaDeSubida() {return fechaDeSubida;}
	public void setFechaDeSubida(String fechaDeSubida) {this.fechaDeSubida = fechaDeSubida;}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

}
