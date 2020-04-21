package de.isri.es.Editor.Dao.Impl.Services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.isri.es.Editor.Dao.TipoComprobacionesDAO;
import de.isri.es.Editor.Dao.Impl.TipoComprobaciones;
import de.isri.es.Editor.models.TipoComprobacion;

@Path("tipoComprobaciones")
public class TipoComprobacionesService implements TipoComprobacionesDAO {
	
	private TipoComprobaciones tipoComprobaciones = new TipoComprobaciones();

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoComprobacion> getTipos() {
		// TODO Auto-generated method stub
		return tipoComprobaciones.getTipos();
	}

}
