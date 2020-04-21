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

import de.isri.es.Editor.Dao.MaterialesNecesariosDAO;
import de.isri.es.Editor.Dao.Impl.MaterialesNecesarios;
import de.isri.es.Editor.models.MaterialNecesario;

@Path("materialNecesario")
public class MaterialNecesarioService implements MaterialesNecesariosDAO {
	
	private MaterialesNecesarios materiales = new MaterialesNecesarios();

	@Override
	@GET
	@Path("/{operacion}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MaterialNecesario> getMaterialesNecesariosDeOperacion(@PathParam("operacion") int operacion) {
		// TODO Auto-generated method stub
		return materiales.getMaterialesNecesariosDeOperacion(operacion);
	}

	@Override
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public MaterialNecesario insertMaterialNecesario(MaterialNecesario material) {
		// TODO Auto-generated method stub
		return materiales.insertMaterialNecesario(material);
	}

	@Override
	@PUT
	@Path("/{operacion}/{material}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public MaterialNecesario updateMaterialNecesario(@PathParam("operacion") int operacion, @PathParam("material") int material, MaterialNecesario materialNecesario) {
		// TODO Auto-generated method stub
		return materiales.updateMaterialNecesario(operacion, material, materialNecesario);
	}

	@Override
	@DELETE
	@Path("/{operacion}/{material}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteMaterialNecesario(@PathParam("operacion") int operacion, @PathParam("material") int material) {
		// TODO Auto-generated method stub
		return materiales.deleteMaterialNecesario(operacion, material);
	}

}
