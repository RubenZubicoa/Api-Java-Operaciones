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

import de.isri.es.Editor.Dao.OperacionesImagenesDAO;
import de.isri.es.Editor.Dao.Impl.OperacionesImagenes;
import de.isri.es.Editor.models.OperacionImagen;

@Path("operacionesImagenes")
public class OperacionesImagenesService implements OperacionesImagenesDAO {
	
	private OperacionesImagenes opsImgs = new OperacionesImagenes();

	@Override
	@GET
	@Path("/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OperacionImagen> getImagenesDeOperacion(@PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return opsImgs.getImagenesDeOperacion(operacion);
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public OperacionImagen insertOperacionImagen(OperacionImagen opImg) {
		// TODO Auto-generated method stub
		return opsImgs.insertOperacionImagen(opImg);
	}

	@Override
	@PUT
	@Path("/{operacion}/{imagen}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public OperacionImagen updateOperacionImagen(@PathParam("operacion") int operacion, @PathParam("imagen") int imagen, OperacionImagen opImg) {
		// TODO Auto-generated method stub
		return opsImgs.updateOperacionImagen(operacion, imagen, opImg);
	}

	@Override
	@DELETE
	@Path("/{operacion}/{imagen}")
	@Produces(MediaType.APPLICATION_JSON)
	public OperacionImagen deleteOperacionImagen(@PathParam("operacion") int operacion, @PathParam("imagen") int imagen) {
		// TODO Auto-generated method stub
		return opsImgs.deleteOperacionImagen(operacion, imagen);
	}

}
