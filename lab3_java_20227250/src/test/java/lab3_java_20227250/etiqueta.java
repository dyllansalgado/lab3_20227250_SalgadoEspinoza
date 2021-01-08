package lab3_java_20227250;

public class etiqueta {
	String etiqueta;
	String descripcionEtiqueta;
	public etiqueta(String etiqueta, String descripcionEtiqueta) {
        this.etiqueta = etiqueta;
        this.descripcionEtiqueta = descripcionEtiqueta;   
    }
	//Selector
	public String getEtiqueta() {
		return etiqueta;
	}
	public String getDescripcionEtiqueta() {
		return descripcionEtiqueta;
	}
	//Modificador
	public void setDescripcionEtiqueta(String descripcionEtiqueta) {
		this.descripcionEtiqueta = descripcionEtiqueta;
	}
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
}
