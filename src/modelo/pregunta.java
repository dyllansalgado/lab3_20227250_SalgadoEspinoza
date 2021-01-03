package modelo;

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
	public pregunta(String tituloPregunta,String contenidoPregunta) {
		setTituloPregunta(tituloPregunta);
		setContenidoPregunta(contenidoPregunta);
		setFechaPublicacion();
		
	}
	public String getTituloPregunta() {
		return tituloPregunta;
	}
	public void setTituloPregunta(String tituloPregunta) {
		this.tituloPregunta = tituloPregunta;
	}
	public String getContenidoPregunta() {
		return contenidoPregunta;
	}
	public void setContenidoPregunta(String contenidoPregunta) {
		this.contenidoPregunta = contenidoPregunta;
	}
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public void setFechaPublicacion() {
		this.fechaPublicacion = tiempo.getActualTime();
	}
	public String getAutorPregunta() {
		return autorPregunta;
	}
	public void setAutorPregunta(String autorPregunta) {
		this.autorPregunta = autorPregunta;
	}
	
}
