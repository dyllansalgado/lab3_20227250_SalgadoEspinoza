package lab3_java_20227250;

import java.util.Scanner;
public class stack {
	//Atributos
	usuario ActivoUsuario; //Usuario actual
	ListaDeUsuarios usuarios;//Usuarios totales	
	ListaDePreguntas preguntas;//Lista de preguntas
	
	//Metodos
	//Constructor de usuario
	public stack(String userName,String password) {
		// TODO Auto-generated constructor stub
		ActivoUsuario = new usuario(userName, password);
		preguntas = new ListaDePreguntas();
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
					System.out.println("Ingrese clave de usuario");
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
	public void realizarPregunta() {
		@SuppressWarnings("resource")
		Scanner entradaEscaner = new Scanner(System.in);
		System.out.println("Ingrese el titulo de la pregunta");
		String titulo = entradaEscaner.nextLine();
		System.out.println("Ingrese el contenido de la pregutna");
		String contenido = entradaEscaner.nextLine();
		System.out.println("Ingrese sus etiquetas");
		String etiquetas = entradaEscaner.nextLine();
		pregunta miPregunta = new pregunta(titulo, contenido, ActivoUsuario.getNombreUsuario(), etiquetas, preguntas.getTamano()+1);
		preguntas.agregarPreguntas(miPregunta);
		System.out.println("Pregunta agregada");
	}
	
	/**
	 * Funcion que muestra usuario
	 */
	public void mostrarUsuarioActual() {System.out.println("## Registrado como:" + ActivoUsuario.getNombreUsuario()+ "  ##");}
	public void mostrarUsuarios() {System.out.println(usuarios.usuarios2String());System.out.println(usuarios.usuarios2String());}
	public void mostrarPreguntas() {System.out.println(preguntas.preguntas2String());}
}
