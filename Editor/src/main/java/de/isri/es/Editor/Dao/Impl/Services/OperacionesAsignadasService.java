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

import de.isri.es.Editor.Dao.OperacionesAsignadasDAO;
import de.isri.es.Editor.Dao.Impl.OperacionesAsignadas;
import de.isri.es.Editor.models.OperacionAsignada;

@Path("operacionesAsignadas")
public class OperacionesAsignadasService implements OperacionesAsignadasDAO {
	
	OperacionesAsignadas operaciones = new OperacionesAsignadas();

	@Override
	@GET
	@Path("operacion/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OperacionAsignada> getAsignacionesDeOperaciones(@PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return operaciones.getAsignacionesDeOperaciones(operacion);
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public OperacionAsignada insertOperacionAsignada(OperacionAsignada operacion) {
		// TODO Auto-generated method stub
		return operaciones.insertOperacionAsignada(operacion);
	}

	@Override
	@PUT
	@Path("/{modelo}/{puesto}/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public OperacionAsignada updateOperacionAsignada(@PathParam("modelo") int modelo, @PathParam("puesto") int puesto, @PathParam("operacion") int operacion,
			OperacionAsignada operacionAsignada) {
		// TODO Auto-generated method stub
		return operaciones.updateOperacionAsignada(modelo, puesto, operacion, operacionAsignada);
	}

	@Override
	@DELETE
	@Path("/{modelo}/{puesto}/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	public OperacionAsignada deleteOperacionAsignada(@PathParam("modelo") int modelo, @PathParam("puesto") int puesto, @PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return operaciones.deleteOperacionAsignada(modelo, puesto, operacion);
	}
	
	@Override
	@GET
	@Path("/{modelo}/{puesto}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OperacionAsignada> getOperacionesPorModeloYPuesto(@PathParam("modelo") int modelo, @PathParam("puesto") int puesto) {
		// TODO Auto-generated method stub
		return operaciones.getOperacionesPorModeloYPuesto(modelo, puesto);
	}

	@Override
	@GET
	@Path("/{modelo}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OperacionAsignada> getOperacionesPorModelo(@PathParam("modelo") int modelo) {		
		return operaciones.getOperacionesPorModelo(modelo);
	}
}
