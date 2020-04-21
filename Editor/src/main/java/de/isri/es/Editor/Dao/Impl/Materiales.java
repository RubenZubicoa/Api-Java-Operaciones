package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.MaterialesDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Material;

public class Materiales implements MaterialesDAO {

	@Override
	public List<Material> getMateriales() {
		String sql = "select * from materiales";
		List<Material> materialesList = new ArrayList<Material>();
		try {
			Connection conn = Database.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt(1);
				String referencia = rs.getString(2);
				String descripcion = rs.getString(3);
				Material material = new Material(id, referencia, descripcion);
				materialesList.add(material);
			}
			return materialesList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Material insertMaterial(Material material) {
		String sql = "insert into materiales(Referencia, Descripcion) values(?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, material.getReferencia());
			stmt.setString(2, material.getDescripcion());
			stmt.execute();
			return material;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Material updateMaterial(int id, Material material) {
		String sql = "update materiales set Referencia = ?, descripcion = ? where id = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, material.getReferencia());
			stmt.setString(2, material.getDescripcion());
			stmt.setInt(3, id);
			stmt.execute();
			return material;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public Material deleteMaterial(int id) {
		String sql = "delete from materiales where id = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			return new Material();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
