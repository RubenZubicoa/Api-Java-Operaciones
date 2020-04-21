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

import de.isri.es.Editor.Dao.PuestosDAO;
import de.isri.es.Editor.Dao.Impl.Puestos;
import de.isri.es.Editor.models.Puesto;

@Path("puestos")
public class PuestosService implements PuestosDAO {
	
	private Puestos puestos = new Puestos();

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Puesto> getPuestos() {
		// TODO Auto-generated method stub
		return puestos.getPuestos();
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Puesto insertPuesto(Puesto puesto) {
		// TODO Auto-generated method stub
		return puestos.insertPuesto(puesto);
	}

	@Override
	@PUT
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Puesto updatePuesto(@PathParam("codigo") int codigo, Puesto puesto) {
		// TODO Auto-generated method stub
		return puestos.updatePuesto(codigo, puesto);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Puesto deletePuesto(@PathParam("codigo") int codigo) {
		// TODO Auto-generated method stub
		return puestos.deletePuesto(codigo);
	}

	@Override
	@GET
	@Path("/{linea}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Puesto> getPuestosPorLinea(@PathParam("linea") int linea) {
		// TODO Auto-generated method stub
		return puestos.getPuestosPorLinea(linea);
	}

	@Override
	@GET
	@Path("/{operacion}/{modelo}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Puesto> getPuestosAsignados(@PathParam("operacion") int operacion, @PathParam("modelo") int modelo) {
		// TODO Auto-generated method stub
		return puestos.getPuestosAsignados(operacion, modelo);
	}

}
