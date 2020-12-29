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
		System.out.println("Ingrese contraseña de usuario");
		String passUser = entradaEscaner.nextLine();
		int x = -1;//La entrada la incicializamos en -1
		while(x != 8){
    	try{
    	  entradaEscaner = new Scanner (System.in);
    	  System.out.println("### Simulacion de StackOverflow ###\n"
          + "\nEscoja una opcion:\n"
          + "1.  Registrar Usuario\n"
          + "2.  Iniciar Sesion\n"
          + "3.  Realizar pregunta\n"
          + "4.  Realizar respuesta\n"
          + "5.  Ofrecer recompensa por mi pregunta\n"
          + "6.  Aceptar respuestas a mi pregunta\n"
          + "7.  Cerrar sesion\n"
          + "8.  Cerrar aplicacion\n"
          +"Su opcion es:"
          + " _\n");
          x = entradaEscaner.nextInt();
          switch(x){
          	case 1:{
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
      System.out.println("Algo saliÃ³ mal" + s);
	  }
    }
    entradaEscaner.close();	
  }
}
