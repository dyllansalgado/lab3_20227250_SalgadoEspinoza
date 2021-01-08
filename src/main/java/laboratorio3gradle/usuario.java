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
