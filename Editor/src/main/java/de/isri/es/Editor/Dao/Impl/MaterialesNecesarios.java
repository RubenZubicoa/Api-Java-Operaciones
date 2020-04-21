package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.MaterialesNecesariosDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Material;
import de.isri.es.Editor.models.MaterialNecesario;

public class MaterialesNecesarios implements MaterialesNecesariosDAO {

	@Override
	public List<MaterialNecesario> getMaterialesNecesariosDeOperacion(int operacion) {
		String sql = "select * from Materiales inner join Materiales_Necesarios on Materiales.Id = Materiales_Necesarios.Material where Operacion = ?";
		List<MaterialNecesario> materialesList = new ArrayList<MaterialNecesario>();
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String referencia = rs.getString(2);
				String descripcion = rs.getString(3);
				int material = rs.getInt(5);
				int cantidad = rs.getInt(6);
				MaterialNecesario materialNecesario = new MaterialNecesario(operacion, material, cantidad, new Material(material, referencia, descripcion));
				materialesList.add(materialNecesario);
			}
			return materialesList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MaterialNecesario insertMaterialNecesario(MaterialNecesario material) {
		String sql = "insert into Materiales_Necesarios(Operacion, Material, Cantidad) values(?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, material.getIdOperacion());
			stmt.setInt(2, material.getIdMaterial());
			stmt.setInt(3, material.getCantidad());
			stmt.execute();
			return material;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public MaterialNecesario updateMaterialNecesario(int operacion, int material, MaterialNecesario materialNecesario) {
		String sql = "update Materiales_Necesarios set Operacion = ?, material = ?, cantidad = ? where operacion = ? and material = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, materialNecesario.getIdOperacion());
			stmt.setInt(2, materialNecesario.getIdMaterial());
			stmt.setInt(3, materialNecesario.getCantidad());
			stmt.setInt(4, operacion);
			stmt.setInt(5, material);
			stmt.execute();
			return materialNecesario;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String deleteMaterialNecesario(int operacion, int material) {
		String sql = "delete from Materiales_Necesarios where operacion = ? and material = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			stmt.setInt(2, material);
			stmt.execute();
			return "Material eliminado correctamente";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

}
