package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.LineasDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Linea;

public class Lineas implements LineasDAO {

	@Override
	public List<Linea> getLineas() {
		String sql = "select * from linea";
		List<Linea> lineasList = new ArrayList<Linea>();
		try {
			Connection conn = Database.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int codigo = rs.getInt(1);
				String descripcion = rs.getString(2);
				Linea linea = new Linea(codigo, descripcion);
				lineasList.add(linea);
			}
			return lineasList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Linea insertLinea(Linea linea) {
		String sql = "insert into Linea(Codigo, Descripcion) values(?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, linea.getCodigo());
			stmt.setString(2, linea.getDescripcion());
			stmt.execute();
			return linea;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Linea updateLinea(int codigo, Linea linea) {
		String sql = "update Linea set Codigo = ?, Descripcion = ? where Codigo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, linea.getCodigo());
			stmt.setString(2, linea.getDescripcion());
			stmt.setInt(3, codigo);
			stmt.execute();
			return linea;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Linea deleteLinea(int codigo) {
		String sql = "delete from Linea where codigo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
			return new Linea();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
