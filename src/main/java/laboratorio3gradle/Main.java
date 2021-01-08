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
		Scanner entradaEscaner = new Scanner(System.in);
		System.out.println("Ingrese nombre de usuario");
		String nameUser = entradaEscaner.nextLine();
		System.out.println("Ingrese contraseña de usuario");
		String passUser = entradaEscaner.nextLine();
		stack myStack = new stack(nameUser, passUser);
		int x = -1;
		while(x == -1){
    	try{
    	  entradaEscaner = new Scanner (System.in);
    	  System.out.println("### SISTEMA DE PREGUNTAS Y RESPUESTAS ###\n ");
    	  myStack.mostrarUsuarioActual();
    	  System.out.println( "\nEscoja una opcion:\n"
          + "1.  Registrar Usuario\n"
          + "2.  Realizar pregunta\n"
          + "3.  Realizar respuesta\n"
          + "4.  Ofrecer recompensa por mi pregunta\n"
          + "5.  Aceptar respuestas a mi pregunta\n"
          + "6.  Cerrar sesion\n"
          + "7.  Cerrar aplicacion\n"
          + "8.  Mostrar usuarios \n"
          + "9.  Mostrar preguntas \n"
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
          		try {
          			myStack.realizarPregunta();
				} catch (Exception e) {
					System.out.println(e);
				}
          		x = -1;
          		break;
          	}
          	case 3:{
          		x = -1;
          		break;
          	}
          	case 4:{   
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