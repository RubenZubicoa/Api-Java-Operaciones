package de.isri.es.Editor.Dao;

import java.util.List;

import de.isri.es.Editor.models.Material;

public interface MaterialesDAO {
	
	public List<Material> getMateriales();
	public Material insertMaterial(Material material);
	public Material updateMaterial(int id, Material material);
	public Material deleteMaterial(int id);
}
