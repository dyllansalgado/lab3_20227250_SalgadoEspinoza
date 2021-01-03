package modelo;

public class stack {
	usuario ActivoUsuario;
	ListaDeUsuarios usuarios;	
	ListaDePreguntas preguntas;
	
	//Metodos
	//Constructor de usuario
	public stack(String userName,String password) {
		ActivoUsuario = new usuario(userName, password);
		usuarios = new ListaDeUsuarios();
		usuarios.agregarUsuario(ActivoUsuario);		
	}

}