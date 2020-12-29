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
	public usuario(String nombreUsuario, String claveUsuario, int reputacionUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.reputacionUsuario = reputacionUsuario;
    }
}
