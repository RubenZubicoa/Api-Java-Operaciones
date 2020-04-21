package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.EquiposDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Equipo;

public class Equipos implements EquiposDAO {

	
	@Override
	public List<Equipo> getEquipos() {
		String sql = "Select * from equipos";
		List<Equipo> equiposList = new ArrayList<>();
		try {
			Connection conn = Database.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Equipo equipo = new Equipo();
				equipo.setIdPuesto(rs.getInt(1));
				equipo.setDescripcion(rs.getString(2));
				equipo.setDireccionIp(rs.getString(3));
				equiposList.add(equipo);
			}
			return equiposList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Override
	public Equipo insertEquipo(Equipo equipo) {
		String sql = "insert into Equipos(Puesto, Descripcion, DireccionIp) values(?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, equipo.getIdPuesto());
			stmt.setString(2, equipo.getDescripcion());
			stmt.setString(3, equipo.getDireccionIp());
			stmt.execute();
			return equipo;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Override
	public Equipo updateEquipo(int puesto, Equipo equipo) {
		String sql = "update equipos set puesto = ?, Descripcion = ?, DireccionIp = ? where puesto = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, equipo.getIdPuesto());
			stmt.setString(2, equipo.getDescripcion());
			stmt.setString(3, equipo.getDireccionIp());
			stmt.setInt(4, puesto);
			stmt.execute();
			return equipo;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
		
		
	}

	@Override
	public Equipo deleteEquipo(int puesto) {
		String sql = "delete from equipos where puesto = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, puesto);
			stmt.execute();
			return new Equipo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

}
