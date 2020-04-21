package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.PuestosDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Puesto;

public class Puestos implements PuestosDAO {

	@Override
	public List<Puesto> getPuestos() {
		String sql = "select * from Puesto";
		List<Puesto> puestos = new ArrayList<Puesto>();
		try {
			Connection conn = Database.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Puesto puesto = new Puesto();
				puesto.setCodigo(rs.getInt(1));
				puesto.setLinea(rs.getInt(2));
				puesto.setDescripcion(rs.getString(3));
				puesto.setPuestoAnterior(rs.getInt(4));
				puestos.add(puesto);
			}
			return puestos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Puesto insertPuesto(Puesto puesto) {
		String sql = "insert into Puesto(Codigo, Linea, Descripcion, Puesto_Anterior) values (?, ?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, puesto.getCodigo());
			stmt.setInt(2, puesto.getLinea());
			stmt.setString(3, puesto.getDescripcion());
			stmt.setInt(4, puesto.getPuestoAnterior());
			stmt.execute();
			return puesto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Puesto updatePuesto(int codigo, Puesto puesto) {
		String sql = "update Puesto set codigo = ?, linea = ?, descripcion = ?, puesto_anterior = ? where codigo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, puesto.getCodigo());
			stmt.setInt(2, puesto.getLinea());
			stmt.setString(3, puesto.getDescripcion());
			stmt.setInt(4, puesto.getPuestoAnterior());
			stmt.setInt(5, codigo);
			stmt.execute();
			return puesto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Puesto deletePuesto(int codigo) {
		String sql = "delete from puesto where codigo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Puesto> getPuestosPorLinea(int linea) {
		String sql = "select * from puesto where linea = ?";
		List<Puesto> puestos = new ArrayList<Puesto>();
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, linea);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Puesto puesto = new Puesto();
				puesto.setCodigo(rs.getInt(1));
				puesto.setLinea(rs.getInt(2));
				puesto.setDescripcion(rs.getString(3));
				puesto.setPuestoAnterior(rs.getInt(4));
				puestos.add(puesto);
			}
			return puestos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Puesto> getPuestosAsignados(int operacion, int modelo) {
		String sql = "select Puesto.* from Operaciones_Asignadas inner join Modelos on Modelo = Modelos.Id inner join Puesto on Operaciones_Asignadas.Puesto = Puesto.Codigo where Operacion = ? and Modelo = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			stmt.setInt(2, modelo);
			ResultSet rs = stmt.executeQuery();
			List<Puesto> puestos = new ArrayList<Puesto>();
			while(rs.next()) {
				Puesto puesto = new Puesto();
				puesto.setCodigo(rs.getInt(1));
				puesto.setLinea(rs.getInt(2));
				puesto.setDescripcion(rs.getString(3));
				puesto.setPuestoAnterior(rs.getInt(4));
				puestos.add(puesto);
			}
			return puestos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
