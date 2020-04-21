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

import de.isri.es.Editor.Dao.ModelosDAO;
import de.isri.es.Editor.Dao.Impl.Modelos;
import de.isri.es.Editor.models.Modelo;

@Path("modelos")
public class ModelosService implements ModelosDAO {
	
	private Modelos modelos = new Modelos();

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Modelo> selectAll() {
		// TODO Auto-generated method stub
		return modelos.selectAll();
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Modelo insertModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		return modelos.insertModelo(modelo);
	}

	@Override
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Modelo updateModelo(@PathParam("id") int id, Modelo modelo) {
		// TODO Auto-generated method stub
		return modelos.updateModelo(id, modelo);
	}

	@Override
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Modelo deleteModelo(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return modelos.deleteModelo(id);
	}

	@Override
	@GET
	@Path("/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Modelo> getModelosAsignados(@PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return modelos.getModelosAsignados(operacion);
	}

	

}
