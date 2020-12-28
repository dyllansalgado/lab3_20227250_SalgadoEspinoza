/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dyllan
 */
public class usuario {
    String nombre;
    String clave;
    int reputacion;
    //Constructor de usuario.
    public usuario(String nombre, String clave, int reputacion) {
        this.nombre = nombre;
        this.clave = clave;
        this.reputacion = reputacion;
    }
    //Selectores
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getReputacion() {
        return reputacion;
    }
    //Modificadores

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setReputacion(int reputacion) {
        this.reputacion = reputacion;
    }
}
//Operaciones

