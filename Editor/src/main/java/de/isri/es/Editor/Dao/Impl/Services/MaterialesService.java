package de.isri.es.Editor.Dao.Impl.Services;

import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.isri.es.Editor.Dao.MaterialesDAO;
import de.isri.es.Editor.Dao.Impl.Materiales;
import de.isri.es.Editor.models.Material;

@Path("materiales")
public class MaterialesService implements MaterialesDAO {
	
	private Materiales materiales = new Materiales();

	@Override
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Material> getMateriales() {
		// TODO Auto-generated method stub
		return materiales.getMateriales();
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Material insertMaterial(Material material) {
		// TODO Auto-generated method stub
		return materiales.insertMaterial(material);
	}

	@Override
	@Path("/{id}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Material updateMaterial(@PathParam("id") int id, Material material) {
		// TODO Auto-generated method stub
		return materiales.updateMaterial(id, material);
	}

	@Override
	@Path("/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Material deleteMaterial(@PathParam("id") int id) {
		// TODO Auto-generated method stub
		return materiales.deleteMaterial(id);
	}

}
