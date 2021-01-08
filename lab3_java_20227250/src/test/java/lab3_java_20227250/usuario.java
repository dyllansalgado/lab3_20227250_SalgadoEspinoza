package lab3_java_20227250;

public class usuario {
	String nombreUsuario;
	String claveUsuario;
	int reputacionUsuario;
	public usuario(String nombreUsuario, String claveUsuario) {
        setClaveUsuario(claveUsuario);
        setNombreUsuario(nombreUsuario);
        setReputacionUsuario(0);
        
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
