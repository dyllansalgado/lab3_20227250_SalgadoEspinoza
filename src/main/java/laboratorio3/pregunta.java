/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author dyllan
 */
public class pregunta {
	int idPregunta;
	String tituloPregunta;
	String contenidoPregunta;
	String fechaPublicacion;
	String autorPregunta;
	String etiqueta;
	String respuesta;
	int estado;
	int recompensa;
	public pregunta(String tituloPregunta,String contenidoPregunta,String autor,String etiqueta,int id) {
		setTituloPregunta(tituloPregunta);
		setContenidoPregunta(contenidoPregunta);
		setAutorPregunta(autor);
		setFechaPublicacion(tiempo.getActualTime());
		setIdPregunta(id);
	}
	public int getIdPregunta() {return idPregunta;}
	public void setIdPregunta(int idPregunta) {this.idPregunta = idPregunta;}
	public String pregunta2String() {
		String salidaString;
		salidaString = "Titulo : " + getTituloPregunta() + "\n Contenido : "+ getContenidoPregunta();
		return salidaString;
	}
	
	public String getTituloPregunta() {return tituloPregunta;}
	public void setTituloPregunta(String tituloPregunta) {this.tituloPregunta = tituloPregunta;}
	public String getContenidoPregunta() {return contenidoPregunta;}
	public void setContenidoPregunta(String contenidoPregunta) {this.contenidoPregunta = contenidoPregunta;}
	public String getFechaPublicacion() {return fechaPublicacion;}
	public void setFechaPublicacion(String fechaPublicacion) {this.fechaPublicacion = fechaPublicacion;}
	public void setFechaPublicacion() {this.fechaPublicacion = tiempo.getActualTime();}
	public String getAutorPregunta() {return autorPregunta;}
	public void setAutorPregunta(String autorPregunta) {this.autorPregunta = autorPregunta;}
}
