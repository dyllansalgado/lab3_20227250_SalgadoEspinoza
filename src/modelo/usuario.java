package modelo;

public class usuario {
	String nombreUsuario;
	String claveUsuario;
	int reputacionUsuario;
	public usuario(String nombreUsuario, String claveUsuario, int reputacionUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.reputacionUsuario = reputacionUsuario;
    }
	//Selectores
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public String getClaveUsuario() {
		return claveUsuario;
	}
	
	public int getReputacionUsuario() {
		return reputacionUsuario;
	}
	
	//modificadores
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public void setReputacionUsuario(int reputacionUsuario) {
		this.reputacionUsuario = reputacionUsuario;
	}
    
}
