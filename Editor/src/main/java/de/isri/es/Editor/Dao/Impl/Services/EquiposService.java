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

import de.isri.es.Editor.Dao.EquiposDAO;
import de.isri.es.Editor.Dao.Impl.Equipos;
import de.isri.es.Editor.models.Equipo;

@Path("equipos")
public class EquiposService implements EquiposDAO {
	
	Equipos equipos = new Equipos();

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Equipo> getEquipos() {
		return equipos.getEquipos();
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Equipo insertEquipo(Equipo equipo) {
		return equipos.insertEquipo(equipo);
	}

	@Override
	@PUT
	@Path("/{puesto}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Equipo updateEquipo(@PathParam("puesto") int puesto, Equipo equipo) {
		return equipos.updateEquipo(puesto, equipo);
	}

	@Override
	@DELETE
	@Path("/{puesto}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Equipo deleteEquipo(@PathParam("puesto") int puesto) {
		return equipos.deleteEquipo(puesto);		
	}

}
