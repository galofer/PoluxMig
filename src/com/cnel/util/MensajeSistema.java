package com.cnel.util;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.zkoss.zul.Messagebox;

public class MensajeSistema {

	/**
	 * Mensaje de información : Indica que se ejecuto una Transacción exitosa en la B/D
	 * @throws InterruptedException
	 */
	public static void mensajeTransaccionExitosa() throws InterruptedException{
		Messagebox.show("Transacción exitosa", "Información", Messagebox.OK,Messagebox.INFORMATION);
	}
	
	/**
	 * Mensaje de información solicitud : Indica que se generó exitosamente una solicitud
	 * intNumeroSolicitud
	 * @throws InterruptedException
	 */
	public static void mensajeTransaccionExitosa(String strNumeroSolicitud) throws InterruptedException{
		Messagebox.show("Transacción exitosa, se generó la solicitud Nº: " + strNumeroSolicitud  , "Información", Messagebox.OK,Messagebox.INFORMATION);
	}
	
	/**
	 * Indica que se anulo correctamente una solicitud
	 * @param strNumeroSolicitud
	 * @throws InterruptedException
	 */
	public static void mensajeAnulacionExitosa(String strNumeroSolicitud) throws InterruptedException{
		Messagebox.show("Transacción exitosa, se anuló la solicitud Nº: " + strNumeroSolicitud  , "Información", Messagebox.OK,Messagebox.INFORMATION);
	}
	
	/**
	 * Indica que se aprobo correctamente una solicitud
	 * @param strNumeroSolicitud
	 * @throws InterruptedException
	 */
	public static void mensajeAprobacionExitosa(String strNumeroSolicitud) throws InterruptedException{
		Messagebox.show("Transacción exitosa, se aprobó la solicitud Nº: " + strNumeroSolicitud  , "Información", Messagebox.OK,Messagebox.INFORMATION);
	}
	
	/**
	 * Mensaje de advertencia : Indica que los campos requeridos por el Systema estan vacios.
	 * @param strCampo
	 * @throws InterruptedException
	 */
	public static void mensajeCampoRequerido(String strCampo) throws InterruptedException{
		Messagebox.show("Llenar campo requerido: "+ strCampo ,"Advertencia", Messagebox.OK,Messagebox.EXCLAMATION);
	}
	
	/**
	 * Mensaje de error : Indica que ocurrio un error al ejecutar una Transacción sobre la B/D
	 * @throws InterruptedException
	 */
	public static void mensajeErrorTransaccion() throws InterruptedException{
		Messagebox.show("Error de Transacción","Error", Messagebox.OK,Messagebox.ERROR);
		
	}

	/**
	 * Mensaje de informacion : Indica que no se encontró el campo buscado
	 * @throws InterruptedException
	 */
	public static void mensajeNoExiste(String strCampo) throws InterruptedException{
		Messagebox.show("No existe: " + strCampo ,"Advertencia", Messagebox.OK,Messagebox.EXCLAMATION);
		
	}
	
	/**
	 * Mensaje de informacion, para indicar al usuario que seleccione determinado campo antes de elegir otro
	 * @throws InterruptedException
	 */
	public static void mensajeSeleccionePrimero(String strCampo) throws InterruptedException{
		Messagebox.show("Seleccione primero: " + strCampo ,"Advertencia", Messagebox.OK,Messagebox.EXCLAMATION);
		
	}
	
	/**
	 * Mensaje de confirmación, para preguntar al usuario si desea continuar
	 * @throws InterruptedException
	 */
	public static boolean mensajeConfirmacion() throws InterruptedException{
		boolean exito = false;
		if((Messagebox.show("¿Esta seguro(a) que desea continuar?", "Confirmación", Messagebox.YES |Messagebox.NO,Messagebox.QUESTION)) == Messagebox.YES){
			exito = true;
		}
		return exito;
	}
	
	/**
	 * Mensaje de eliminación, para preguntar al usuario si desea eliminar
	 * @throws InterruptedException
	 */
	public static boolean mensajeConfirmarEliminacion() throws InterruptedException{
		boolean exito = false;
		if((Messagebox.show("¿Esta seguro(a) que desea eliminar?", "Confirmación", Messagebox.YES |Messagebox.NO,Messagebox.QUESTION)) == Messagebox.YES){
			exito = true;
		}
		return exito;
	}
	
	/**
	 * Mensaje de confirmación personalizado, para preguntar al usuario si desea continuar
	 * @throws InterruptedException
	 */
	public static boolean mensajeConfirmacion(String strMensaje) throws InterruptedException{
		boolean exito = false;
		if((Messagebox.show(strMensaje, "Confirmación", Messagebox.YES |Messagebox.NO,Messagebox.QUESTION)) == Messagebox.YES){
			exito = true;
		}
		return exito;
	}
	
	/**
	 * Mensaje personalizado
	 * @param strMensaje: Es un mensaje personalizado para el Systema
	 * @param intTipoMensaje : 1=Información ; 2=Exclamación ; 3=Error
	 * @throws InterruptedException
	 */
	public static void mensajePersonalizado(String strMensaje, int intTipoMensaje ) throws InterruptedException{
		switch (intTipoMensaje) {
			case 1: 	Messagebox.show(strMensaje,"Información", Messagebox.OK,Messagebox.INFORMATION);
				break;
			case 2:		Messagebox.show(strMensaje,"Advertencia", Messagebox.OK,Messagebox.EXCLAMATION);
				break;
			case 3:		Messagebox.show(strMensaje,"Error", Messagebox.OK,Messagebox.ERROR);
				break;	
		}		
	}
	
	/**
	 * @param e: Es la excepcion, que contiene toda la traza del error.
	 * @throws InterruptedException
	 */
	public static void mensajeErrorTransaccion(Exception e)throws InterruptedException{
		StringWriter errores = new StringWriter();
		e.printStackTrace(new PrintWriter(errores));
		Messagebox.show(errores.toString(),"Error", Messagebox.OK,Messagebox.ERROR);
	}
}
