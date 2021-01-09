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
import java.util.Scanner;

public class stack {
	//Atributos
	public usuario ActivoUsuario; //Usuario actual
	public ListaDeUsuarios usuarios;//Usuarios totales	
	public ListaDePreguntas preguntas;//Lista de preguntas
	public ListaDeEtiquetas etiquetas;//Lista de etiquetas
	
	//Metodos
	//Constructor de usuario
	public stack(String userName,String password,int reputacion) {
		// TODO Auto-generated constructor stub
		ActivoUsuario = new usuario(userName, password,reputacion);
		preguntas = new ListaDePreguntas();
		usuarios = new ListaDeUsuarios();
		etiquetas = new ListaDeEtiquetas();
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
					System.out.println("Ingrese contrasena de usuario");
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
	public void registrarUsuario(String nameUser,String password, int reputacion) {
		usuario myUsuario= new usuario(nameUser, password,reputacion); 
		usuarios.agregarUsuario(myUsuario);
		usuarios.agregarUsuario(myUsuario);
	}
	public void realizarPregunta() {
		@SuppressWarnings("resource")
		Scanner entradaEscaner = new Scanner(System.in);
		System.out.println("Ingrese el titulo de la pregunta");
		String titulo = entradaEscaner.nextLine();
		System.out.println("Ingrese el contenido de la pregunta");
		String contenido = entradaEscaner.nextLine();
		System.out.println(etiquetas.etiquetas2String1());
		System.out.println("Indique la etiqueta que quiere agregar");
		int x = entradaEscaner.nextInt();
		etiqueta miEtiqueta ;
		if (etiquetas.getEtiquetaN(x)!= null) {
			miEtiqueta =  etiquetas.getEtiquetaN(x);
		}else {
			miEtiqueta = new etiqueta("NULL","NULL");
		}
		pregunta miPregunta = new pregunta(titulo, contenido, ActivoUsuario.getNombreUsuario(),miEtiqueta, preguntas.getTamano()+1);
		System.out.println("Desea asignar recompensa? S/N" );
		String respuesta = entradaEscaner.nextLine();
		if (respuesta.equals("S")||respuesta.equals("s")) {
			System.out.println("Ingrese recompensa a asignar" );
			int recompensa = entradaEscaner.nextInt();
			miPregunta.setRecompensa(recompensa);
		}
		preguntas.agregarPreguntas(miPregunta);
		System.out.println("Pregunta agregada");
	}
	public void realizarPregunta(String titulo,String contenido, String autor,etiqueta miEtiqueta, int reputacion) {
		pregunta myPregunta = new pregunta(titulo, contenido, autor,miEtiqueta, reputacion);
		preguntas.agregarPreguntas(myPregunta);
	}
	public void agregarEtiqueta(String nombre,String descripcion) {
		etiqueta myEtiqueta = new etiqueta(nombre,descripcion);
		etiquetas.agregarEtiquetas(myEtiqueta);
	}
	
	/**
	 * Funcion que muestra usuario
	 */
	public void mostrarUsuarioActual() {System.out.println("## Registrado como:" + ActivoUsuario.getNombreUsuario()+ "  ##");}
	public void mostrarUsuarios() {System.out.println(usuarios.usuarios2String());System.out.println(usuarios.usuarios2String());}
	public void mostrarPreguntas() {System.out.println(preguntas.preguntas2String());}
}
