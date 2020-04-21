package de.isri.es.Editor.Dao.Impl.Services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.isri.es.Editor.Dao.SerialPortsDAO;
import de.isri.es.Editor.Dao.Impl.SerialPorts;
import de.isri.es.Editor.models.SerialPort;

@Path("serialPorts")
public class SerialPortsService implements SerialPortsDAO {
	
	private SerialPorts ports = new SerialPorts();

	@Override
	@GET
	@Path("/{equipo}")
	@Produces(MediaType.APPLICATION_JSON)
	public SerialPort getSerialPort(@PathParam("equipo") int equipo) {
		// TODO Auto-generated method stub
		return ports.getSerialPort(equipo);
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public SerialPort insertSerialPort(SerialPort port) {
		// TODO Auto-generated method stub
		return ports.insertSerialPort(port);
	}

	@Override
	@PUT
	@Path("/{equipo}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public SerialPort updateSerialPort(@PathParam("equipo") int equipo, SerialPort port) {
		// TODO Auto-generated method stub
		return ports.updateSerialPort(equipo, port);
	}

	@Override
	@DELETE
	@Path("/{equipo}")
	public SerialPort deleteSerialPort(@PathParam("equipo") int equipo) {
		// TODO Auto-generated method stub
		return ports.deleteSerialPort(equipo);
	}

}
