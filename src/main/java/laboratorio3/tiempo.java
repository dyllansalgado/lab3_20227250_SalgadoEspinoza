/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author dyllan
 */
import java.text.SimpleDateFormat;
import java.util.Date; 
/*
 * Clase global que es solo para obtener la fecha actual en un determinado formato
 * @author dyllan
 * */

public class tiempo {
	//Atributo de clase String
	private static String actualTime;
	
	/**
	 * Obtener el tiempo actual
	 * @return un string con el tiempo actualmente
	 */
	public static String getActualTime() {
		tiempo.setActualTime() ;
		return actualTime;
	}
	
	/**
	 * Actualizar el tiempo a actual
	 */
	public static void setActualTime() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		tiempo.actualTime = formato.format(date);
	}
}
