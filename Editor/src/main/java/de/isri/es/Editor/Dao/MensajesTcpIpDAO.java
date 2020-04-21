package de.isri.es.Editor.Dao;

import de.isri.es.Editor.models.MensajeTcpIp;

public interface MensajesTcpIpDAO {

	//Devuelve el mensaje de una operacion
	public MensajeTcpIp getMensaje(int operacion);
	//introduce un mensaje a una operacion
	public MensajeTcpIp insertMensaje(MensajeTcpIp mensaje);
	//modifica un mensaje
	public MensajeTcpIp updateMensaje(int operacion, MensajeTcpIp mensaje);
	//elimina un mensaje
	public MensajeTcpIp deleteMensaje(int operacion);
}
