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

import de.isri.es.Editor.Dao.OperacionesDocumentosDAO;
import de.isri.es.Editor.Dao.Impl.OperacionesDocumentos;
import de.isri.es.Editor.models.OperacionDocumento;

@Path("operacionesDocumentos")
public class OperacionesDocumentosService implements OperacionesDocumentosDAO {
	
	private OperacionesDocumentos opsDocs = new OperacionesDocumentos();

	@Override
	@GET
	@Path("/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OperacionDocumento> getDocumentosDeOperacion(@PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return opsDocs.getDocumentosDeOperacion(operacion);
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public OperacionDocumento insertOperacionDocumento(OperacionDocumento opDoc) {
		// TODO Auto-generated method stub
		return opsDocs.insertOperacionDocumento(opDoc);
	}

	@Override
	@PUT
	@Path("/{operacion}/{documento}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public OperacionDocumento updateOperacionDocumento(@PathParam("operacion") int operacion, @PathParam("documento") int documento, OperacionDocumento opDoc) {
		// TODO Auto-generated method stub
		return opsDocs.updateOperacionDocumento(operacion, documento, opDoc);
	}

	@Override
	@DELETE
	@Path("/{operacion}/{documento}")
	@Produces(MediaType.APPLICATION_JSON)
	public OperacionDocumento deleteOperacionDocumento(@PathParam("operacion") int operacion, @PathParam("documento") int documento) {
		// TODO Auto-generated method stub
		return opsDocs.deleteOperacionDocumento(operacion, documento);
	}

}
