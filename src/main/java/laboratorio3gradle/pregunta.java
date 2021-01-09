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
public final class pregunta {
	int idPregunta;
	String tituloPregunta;
	String contenidoPregunta;
	String fechaPublicacion;
	String autorPregunta;
	//Respuestas y Etiquetas
	ListaDeRespuestas respuestas;
	ListaDeEtiquetas etiquetas;
	int estado;
	int recompensa;
	public pregunta(String tituloPregunta,String contenidoPregunta,String autor,etiqueta miEtiqueta,int id) {
		setTituloPregunta(tituloPregunta);
		setContenidoPregunta(contenidoPregunta);
		setAutorPregunta(autor);
		this.etiquetas = new ListaDeEtiquetas();
		this.etiquetas.agregarEtiquetas(miEtiqueta);
		setFechaPublicacion(tiempo.getActualTime());
		setIdPregunta(id);
		respuestas = new ListaDeRespuestas();
	}	
	public pregunta(String tituloPregunta,String contenidoPregunta,String autor,etiqueta miEtiqueta,int id,int recompensa) {
		setTituloPregunta(tituloPregunta);
		setContenidoPregunta(contenidoPregunta);
		setAutorPregunta(autor);
		this.etiquetas = new ListaDeEtiquetas();
		this.etiquetas.agregarEtiquetas(miEtiqueta);
		setFechaPublicacion(tiempo.getActualTime());
		setIdPregunta(id);
		setRecompensa(recompensa);
		respuestas = new ListaDeRespuestas();
	}	
	public String pregunta2String() {
		String salidaString;
		salidaString = 
				"ID : " + idPregunta + 
				"\nTitulo : " + getTituloPregunta() +
				"Contenido : "+ getContenidoPregunta() + 
				"Fecha de Publicacion : " + getFechaPublicacion()+
				"\nAutor:" + getAutorPregunta()+
				"\nEstado: " + estado +
				"\nRecompensa : " + recompensa +
				respuestas.respuestas2String() +
				etiquetas.etiquetas2String1();
		return salidaString;
	}
	public void answer(respuesta miRespuesta) {
		respuestas.agregarRespuesta(miRespuesta);
	}
	public int getIdPregunta() {return idPregunta;}
	public void setIdPregunta(int idPregunta) {this.idPregunta = idPregunta;}
	public int getRecompensa() {return recompensa;}
	public void setRecompensa(int recompensa) {this.recompensa = recompensa;}
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
