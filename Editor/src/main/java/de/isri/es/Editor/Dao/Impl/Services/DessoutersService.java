package de.isri.es.Editor.Dao.Impl.Services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.isri.es.Editor.Dao.DessoutersDAO;
import de.isri.es.Editor.Dao.Impl.Dessouters;
import de.isri.es.Editor.models.Dessouter;

@Path("dessouters")
public class DessoutersService implements DessoutersDAO {
	
	Dessouters dessouters = new Dessouters();

	@Override
	@GET
	@Path("/{equipo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Dessouter getDessouter(@PathParam("equipo") int equipo) {		
		return dessouters.getDessouter(equipo);
	}

	@Override
	@PUT
	@Path("/{equipo}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Dessouter updateDessouter(@PathParam("equipo") int equipo, Dessouter dessouter) {
		// TODO Auto-generated method stub
		return dessouters.updateDessouter(equipo, dessouter);
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Dessouter insertDessouter(Dessouter dessouter) {
		// TODO Auto-generated method stub
		return dessouters.insertDessouter(dessouter);
	}

	

}
