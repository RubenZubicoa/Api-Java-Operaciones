package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.DessoutersDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Dessouter;

public class Dessouters implements DessoutersDAO {

	@Override
	public Dessouter getDessouter(int equipo) {
		String sql = "select * from dessouters where equipo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, equipo);
			ResultSet rs = stmt.executeQuery();
			Dessouter dessouter = new Dessouter();
			if(rs.next()) {				
				dessouter.setIdEquipo(rs.getInt(1));
				dessouter.setCodigo(rs.getString(2));
				dessouter.setIp(rs.getString(3));
				dessouter.setPuerto(rs.getInt(4));
			}
			return dessouter;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Dessouter updateDessouter(int equipo, Dessouter dessouter) {
		String sql = "update dessouters set codigo = ?, direccionIp = ?, puerto = ? where equipo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, dessouter.getCodigo());
			stmt.setString(2, dessouter.getIp());
			stmt.setInt(3, dessouter.getPuerto());
			stmt.setInt(4, equipo);
			stmt.execute();
			return dessouter;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Dessouter insertDessouter(Dessouter dessouter) {
		String sql = "insert into Dessouters(Equipo, Codigo, DireccionIp, Puerto) values (?, ?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, dessouter.getIdEquipo());
			stmt.setString(2, dessouter.getCodigo());
			stmt.setString(3, dessouter.getIp());
			stmt.setInt(4, dessouter.getPuerto());
			stmt.execute();
			return dessouter;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
