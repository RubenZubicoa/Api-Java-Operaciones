package de.isri.es.Editor.Dao.Impl.Services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.isri.es.Editor.Dao.InformesDAO;
import de.isri.es.Editor.Dao.Impl.Informes;
import de.isri.es.Editor.models.InformePuestos;

@Path("informes")
public class InformesService implements InformesDAO {
	
	Informes informes = new Informes();

	@Override
	@GET
	@Path("/informePuestos/{modelo}")
	@Produces(MediaType.APPLICATION_JSON)
	public InformePuestos getInformePuestos(@PathParam("modelo") int modelo) {
		// TODO Auto-generated method stub
		return informes.getInformePuestos(modelo);
	}

}
