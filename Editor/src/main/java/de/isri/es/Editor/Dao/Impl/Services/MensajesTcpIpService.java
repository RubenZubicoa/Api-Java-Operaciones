package de.isri.es.Editor.Dao.Impl.Services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.isri.es.Editor.Dao.MensajesTcpIpDAO;
import de.isri.es.Editor.Dao.Impl.MensajesTcpIp;
import de.isri.es.Editor.models.MensajeTcpIp;

@Path("mensajesTcpIp")
public class MensajesTcpIpService implements MensajesTcpIpDAO {
	
	MensajesTcpIp mensajes = new MensajesTcpIp();

	@Override
	@GET
	@Path("/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	public MensajeTcpIp getMensaje(@PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return mensajes.getMensaje(operacion);
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public MensajeTcpIp insertMensaje(MensajeTcpIp mensaje) {
		// TODO Auto-generated method stub
		return mensajes.insertMensaje(mensaje);
	}

	@Override
	@PUT
	@Path("/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public MensajeTcpIp updateMensaje(@PathParam("operacion") int operacion, MensajeTcpIp mensaje) {
		// TODO Auto-generated method stub
		return mensajes.updateMensaje(operacion, mensaje);
	}

	@Override
	@DELETE
	@Path("/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	public MensajeTcpIp deleteMensaje(@PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return mensajes.deleteMensaje(operacion);
	}

}
