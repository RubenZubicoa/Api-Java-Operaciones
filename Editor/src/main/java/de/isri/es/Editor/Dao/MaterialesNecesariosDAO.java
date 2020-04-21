package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.MaterialNecesario;

public interface MaterialesNecesariosDAO {

	public List<MaterialNecesario> getMaterialesNecesariosDeOperacion(int operacion);
	public MaterialNecesario insertMaterialNecesario(MaterialNecesario material);
	public MaterialNecesario updateMaterialNecesario(int operacion, int material, MaterialNecesario materialNecesario);
	public String deleteMaterialNecesario(int operacion, int material);
}
