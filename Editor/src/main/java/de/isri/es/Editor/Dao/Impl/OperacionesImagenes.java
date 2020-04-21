package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.OperacionesImagenesDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.OperacionImagen;

public class OperacionesImagenes implements OperacionesImagenesDAO {

	@Override
	public List<OperacionImagen> getImagenesDeOperacion(int operacion) {
		String sql = "select Operacion, Imagen, Ruta from Operaciones_Imagenes inner join Imagenes on Id = Imagen where Operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			ResultSet rs = stmt.executeQuery();
			List<OperacionImagen> lista = new ArrayList<OperacionImagen>();
			while(rs.next()) {
				OperacionImagen opImg = new OperacionImagen();
				opImg.setIdOperacion(rs.getInt(1));
				opImg.setIdImagen(rs.getInt(2));
				opImg.setRuta(rs.getString(3));
				lista.add(opImg);
			}
			return lista;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionImagen insertOperacionImagen(OperacionImagen opImg) {
		String sql = "insert into Operaciones_Imagenes(Operacion, Imagen) values(?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, opImg.getIdOperacion());
			stmt.setInt(2, opImg.getIdImagen());
			stmt.execute();
			return opImg;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionImagen updateOperacionImagen(int operacion, int imagen, OperacionImagen opImg) {
		String sql = "update Operaciones_Imagenes set operacion = ?, imagen = ? where operacion = ? and imagen = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			stmt.setInt(2, imagen);
			stmt.setInt(3, opImg.getIdOperacion());
			stmt.setInt(4, opImg.getIdImagen());
			stmt.execute();
			return opImg;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionImagen deleteOperacionImagen(int operacion, int imagen) {
		String sql = "delete from Operaciones_Imagenes where Operacion = ? and imagen = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			stmt.setInt(2, imagen);
			stmt.execute();
			return new OperacionImagen();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
