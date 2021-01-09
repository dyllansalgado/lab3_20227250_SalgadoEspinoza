/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3gradle;
import java.util.Scanner;

public class Main {
	/**
	 * Mostrar los comandos de StackOverflow
	 * @param args
	 */
	public static void main(String[] args) {	
		//Creando usuarios
		Scanner entradaEscaner = new Scanner(System.in);
		//USUARIO 1
		String nameUser = "Dyllan";
		String passUser = "dyllan123";
		int reputacion = 100;
		stack myStack = new stack(nameUser, passUser,reputacion);
		//USUARIO 2
		nameUser = "Diegito<3";
		passUser = "diegito123";
		myStack.registrarUsuario(nameUser,passUser,reputacion);
		//USUARIO 3
		nameUser = "Zapallo";
		passUser = "12345";
		myStack.registrarUsuario(nameUser,passUser,reputacion);
		//USUARIO 4
		nameUser = "polka";
		passUser = "1";
		myStack.registrarUsuario(nameUser,passUser,reputacion);
		//Registrar etiquetas
		myStack.agregarEtiqueta("C#", "Lenguaje de programación C#, desarrollado por Windows");
		myStack.agregarEtiqueta("Python","Python el lengiaje mas popular del momento");
		myStack.agregarEtiqueta("C", "nerd");
		//Registrar preguntas
		etiqueta miEtiqueta = myStack.etiquetas.getEtiquetaN(1) ;
		//(String titulo,String contenido, String autor,etiqueta miEtiqueta, int reputacion)
		pregunta miPregunta = new pregunta("Como agrego un elemento a una lista\n","Hola gente, tengo una duda, no sé como añadir un elemnto, soy nuevo en python\n", "Dyllano",miEtiqueta,myStack.preguntas.tamano+1,50);
		myStack.preguntas.agregarPreguntas(miPregunta);;
		
		int x = -1;
		while(x == -1){
    	try{
    	  entradaEscaner = new Scanner (System.in);
    	  System.out.println("### SISTEMA DE PREGUNTAS Y RESPUESTAS ###\n ");
    	  myStack.mostrarUsuarioActual();
    	  System.out.println( "\nEscoja una opcion:\n"
          + "1.   Registrar Usuario\n"
    	  + "2.   Logear Usuario\n"
    	  + "3.   Crear etiqueta\n" 
          + "4.   Realizar pregunta\n"
          + "5.   Realizar respuesta\n"
          + "6.   Ofrecer recompensa por mi pregunta\n"
          + "7.   Aceptar respuestas a mi pregunta\n"
          + "8.   Cerrar sesion\n"
          + "9.   Cerrar aplicacion\n"
          + "10.  Mostrar usuarios \n"
          + "11.  Mostrar preguntas \n"
          + "12.  Mostrar etiquetas \n"
          +"Su opcion es:"
          + " _\n");
          x = entradaEscaner.nextInt();
          switch(x){
          	case 1:{
          		try {
          			myStack.registrarUsuario();
				} catch (Exception e) {
					System.out.println(e);
				}
          		x = -1;
          		break;
          	}
          	case 2:{
          		x = -1;
          		break;
          	}
          	case 3:{
          		x = -1;
          		break;
          	}
          	case 4:{   
          		try {
          			myStack.realizarPregunta();
				} catch (Exception e) {
					System.out.println(e);
				}
          		x = -1;
          		break;
          	}
          	case 5:{
          		x = -1;
          		break;
          	}
          	case 6:{
          		x = -1;
          		break;
          	}
          	case 7:{
          		x = -1;
          		break;
          	}
          	case 8:{
          		myStack.mostrarUsuarios();
          		x = -1;
          		break; 
		    }
        	case 9:{
          		myStack.mostrarPreguntas();
          		x = -1;
          		break; 
		    }
        	case 12:{
        		System.out.println(myStack.etiquetas.etiquetas2String2()); 
        		x = -1;
        	}
          	default :{
          		System.out.println("Ingrese una opcion valida\n");
    		  	break;
            }
        }
      }catch (Exception s){
      System.out.println("Algo salio mal" + s);
	  }
    }
    entradaEscaner.close();	
  }
}