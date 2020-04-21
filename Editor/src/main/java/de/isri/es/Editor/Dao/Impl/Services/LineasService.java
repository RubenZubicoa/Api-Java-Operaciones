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

import de.isri.es.Editor.Dao.LineasDAO;
import de.isri.es.Editor.Dao.Impl.Lineas;
import de.isri.es.Editor.models.Linea;

@Path("lineas")
public class LineasService implements LineasDAO {
	
	private Lineas lineas = new Lineas();

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Linea> getLineas() {		
		return lineas.getLineas();
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Linea insertLinea(Linea linea) {
		// TODO Auto-generated method stub
		return lineas.insertLinea(linea);
	}

	@Override
	@PUT
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Linea updateLinea(@PathParam("codigo") int codigo, Linea linea) {
		// TODO Auto-generated method stub
		return lineas.updateLinea(codigo, linea);
	}

	@Override
	@DELETE
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Linea deleteLinea(@PathParam("codigo") int codigo) {
		// TODO Auto-generated method stub
		return lineas.deleteLinea(codigo);
	}

	
}
