package modelo;

import java.util.Scanner;

public class Menu {
	/**
	 * Mostrar los comandos de StackOverflow
	 * @param args
	 */
	public static void main(String[] args) {	
		Scanner entradaEscaner = new Scanner(System.in);
		System.out.println("Ingrese nombre de usuario");
		String nameUser = entradaEscaner.nextLine();
		System.out.println("Ingrese pass de usuario");
		String passUser = entradaEscaner.nextLine();
		stack myStack = new stack(nameUser, passUser);
		int x = -1;
		while(x != 8){
    	try{
    	  entradaEscaner = new Scanner (System.in);
    	  System.out.println("### SISTEMA DE PREGUNTAS Y RESPUESTAS ###\n ");
    	  myStack.mostrarUsuario();
    	  System.out.println( "\nEscoja una opcion:\n"
          + "1.  Registrar Usuario\n"
          + "2.  Realizar pregunta\n"
          + "3.  Realizar respuesta\n"
          + "4.  Ofrecer recompensa por mi pregunta\n"
          + "5.  Aceptar respuestas a mi pregunta\n"
          + "6.  Cerrar sesion\n"
          + "7.  Cerrar aplicacion\n"
          + "8.  Mostrar usuarios \n"
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
          		break;
          	}
          	case 3:{
          		break;
          	}
          	case 4:{   
          		break;
          	}
          	case 5:{
          		break;
          	}
          	case 6:{
          		break;
          	}
          	case 7:{
          		break;
          	}
          	case 8:{
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
