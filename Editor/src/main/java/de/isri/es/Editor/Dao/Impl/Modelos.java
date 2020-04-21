package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.ModelosDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Modelo;

public class Modelos implements ModelosDAO {
	
	@Override
	public List<Modelo> selectAll() {
		String sql = "select * from modelos";
		List<Modelo> modelos = new ArrayList<Modelo>();
		try {
			Connection conn = Database.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Modelo modelo = new Modelo();
				modelo.setId(rs.getInt(1));
				modelo.setReferencia(rs.getString(2));
				modelo.setLinea(rs.getInt(3));
				modelo.setMontaje(rs.getFloat(4));
				modelo.setRespaldo(rs.getFloat(5));
				modelo.setCojin(rs.getFloat(6));
				modelo.setExpediciones(rs.getFloat(7));
				modelos.add(modelo);
			}
			return modelos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Modelo insertModelo(Modelo modelo) {
		String sql = "insert into modelos(Referencia, Linea, Montaje, Respaldo, Cojin, Expediciones) values(?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, modelo.getReferencia());
			stmt.setInt(2, modelo.getLinea());
			stmt.setFloat(3, modelo.getMontaje());
			stmt.setFloat(4, modelo.getRespaldo());
			stmt.setFloat(5, modelo.getCojin());
			stmt.setFloat(6, modelo.getExpediciones());
			stmt.execute();
			return modelo;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Modelo updateModelo(int id, Modelo modelo) {
		String sql = "update modelos set referencia = ?, Linea = ?, Montaje = ?, Respaldo = ?, Cojin = ?, Expediciones = ? where id = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, modelo.getReferencia());
			stmt.setInt(2, modelo.getLinea());
			stmt.setFloat(3, modelo.getMontaje());
			stmt.setFloat(4, modelo.getRespaldo());
			stmt.setFloat(5, modelo.getCojin());
			stmt.setFloat(6, modelo.getExpediciones());
			stmt.setInt(7, id);
			stmt.execute();
			return modelo;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Modelo deleteModelo(int id) {
		String sql = "delete from modelos where id = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			return new Modelo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Modelo> getModelosAsignados(int operacion) {
		String sql = "select Modelos.* from Operaciones_Asignadas inner join Modelos on Modelo = Modelos.Id where Operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			ResultSet rs = stmt.executeQuery();
			List<Modelo> modelos = new ArrayList<Modelo>();
			while(rs.next()) {
				Modelo modelo = new Modelo();
				modelo.setId(rs.getInt(1));
				modelo.setReferencia(rs.getString(2));
				modelos.add(modelo);
			}
			return modelos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

}
