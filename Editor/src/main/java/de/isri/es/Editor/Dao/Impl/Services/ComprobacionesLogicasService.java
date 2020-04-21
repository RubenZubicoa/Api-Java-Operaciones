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

import de.isri.es.Editor.Dao.ComprobacionesLogicasDAO;
import de.isri.es.Editor.Dao.Impl.ComprobacionesLogicas;
import de.isri.es.Editor.models.ComprobacionLogica;

@Path("comprobacionesLogicas")
public class ComprobacionesLogicasService implements ComprobacionesLogicasDAO {
	
	private ComprobacionesLogicas comprobaciones = new ComprobacionesLogicas();

	@Override
	@GET
	@Path("/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ComprobacionLogica> getComprobacionesDeOperacion(@PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return comprobaciones.getComprobacionesDeOperacion(operacion);
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ComprobacionLogica insertComprobacion(ComprobacionLogica comprobacion) {
		// TODO Auto-generated method stub
		return comprobaciones.insertComprobacion(comprobacion);
	}

	@Override
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ComprobacionLogica updateComprobacion(@PathParam("id") int id, ComprobacionLogica comprobacion) {
		// TODO Auto-generated method stub
		return comprobaciones.updateComprobacion(id, comprobacion);
	}

	@Override
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ComprobacionLogica deleteComprobacion(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return comprobaciones.deleteComprobacion(id);
	}

}
