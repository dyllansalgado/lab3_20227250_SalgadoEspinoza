package modelo;

import java.util.Scanner;

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
	public void registrarUsuario() {
		int x = 0;
		@SuppressWarnings("resource")
		Scanner entradaEscaner = new Scanner(System.in);
			while (x==0) {
				System.out.println("Ingrese nombre de usuario");
				String nameUser = entradaEscaner.nextLine();
				usuario myUsuario= new usuario(nameUser, "") ; 
				//Preguntamos si el usuario ya se encuentra en la lista de usuarios
				if(usuarios.isInside(myUsuario) == false) {
					System.out.println("Ingrese pass de usuario");
					String passUser = entradaEscaner.nextLine();
					myUsuario= new usuario(nameUser, passUser); 
					usuarios.agregarUsuario(myUsuario);
					x = 1;
				}else {
					System.out.println("Ya existe un usuario registrado con ese nombre, desea continuar? S/N");
					String answer  =  entradaEscaner.nextLine();
					if (answer.equals("N")||answer.equals("N")) {
						x = 1;
					}
				}
			}

	}
	
	/**
	 * Funcion que muestra usuario
	 */
	public void mostrarUsuario() {
		System.out.println("## Registrado como:" + ActivoUsuario.getNombreUsuario()+ "  ##");
	}

}