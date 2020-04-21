package de.isri.es.Editor.Dao.Impl.Services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.isri.es.Editor.Dao.OperacionesDAO;
import de.isri.es.Editor.Dao.Impl.Operaciones;
import de.isri.es.Editor.models.Material;
import de.isri.es.Editor.models.Operacion;

@Path("operaciones")
public class OperacionesService extends Operaciones implements OperacionesDAO {

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Operacion> getOperaciones() {
		return super.getOperaciones();
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Operacion insertOperacion(Operacion operacion) {
		return super.insertOperacion(operacion);
	}

	@Override
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Operacion updateOperacion(@PathParam("id") int id, Operacion operacion) {
		return super.updateOperacion(id, operacion);
	}

	@Override
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Operacion deleteOperacion(@PathParam("id") int id) {
		return super.deleteOperacion(id);
	}

	@Override
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Operacion> getOperacionesPorMaterial(Material material) {
		return super.getOperacionesPorMaterial(material);
	}

	

}
