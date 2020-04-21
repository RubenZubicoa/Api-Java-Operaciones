package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.OperacionesAsignadasDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Modelo;
import de.isri.es.Editor.models.Operacion;
import de.isri.es.Editor.models.OperacionAsignada;

public class OperacionesAsignadas implements OperacionesAsignadasDAO {

	@Override
	public List<OperacionAsignada> getAsignacionesDeOperaciones(int operacion) {
		String sql = "select Id, Referencia, Puesto, Prioridad from Modelos inner join Operaciones_Asignadas on Modelos.Id = Operaciones_Asignadas.Modelo where Operacion = ?";
		List<OperacionAsignada> lista = new ArrayList<OperacionAsignada>();
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Modelo modelo = new Modelo();
				modelo.setId(rs.getInt(1));
				modelo.setReferencia(rs.getString(2));
				OperacionAsignada opAsignada = new OperacionAsignada();
				opAsignada.setIdModelo(modelo.getId());
				opAsignada.setCodigoPuesto(rs.getInt(3));
				opAsignada.setIdOperacion(operacion);
				opAsignada.setPrioridad(rs.getInt(4));
				opAsignada.setModelo(modelo);
				lista.add(opAsignada);
			}
			return lista;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionAsignada insertOperacionAsignada(OperacionAsignada operacion) {
		String sql = "insert into Operaciones_Asignadas(Modelo, Puesto, Operacion, Prioridad) values(?, ?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion.getIdModelo());
			stmt.setInt(2, operacion.getCodigoPuesto());
			stmt.setInt(3, operacion.getIdOperacion());
			stmt.setInt(4, operacion.getPrioridad());
			stmt.execute();
			return operacion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionAsignada updateOperacionAsignada(int modelo, int puesto, int operacion,
			OperacionAsignada operacionAsignada) {
		
		String sql = "update Operaciones_Asignadas set Modelo = ?, Puesto = ?, Operacion = ?, Prioridad = ? where modelo = ? and puesto = ? and operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacionAsignada.getIdModelo());
			stmt.setInt(2, operacionAsignada.getCodigoPuesto());
			stmt.setInt(3, operacionAsignada.getIdOperacion());
			stmt.setInt(4, operacionAsignada.getPrioridad());
			stmt.setInt(5, modelo);
			stmt.setInt(6, puesto);
			stmt.setInt(7, operacion);
			stmt.execute();
			return operacionAsignada;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionAsignada deleteOperacionAsignada(int modelo, int puesto, int operacion) {
		String sql = "delete from Operaciones_Asignadas where modelo = ? and puesto = ? and operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, modelo);
			stmt.setInt(2, puesto);
			stmt.setInt(3, operacion);
			stmt.execute();
			OperacionAsignada opAsignada = new OperacionAsignada();
			opAsignada.setIdModelo(modelo);
			opAsignada.setCodigoPuesto(puesto);
			opAsignada.setIdOperacion(operacion);
			return opAsignada;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@Override
	public List<OperacionAsignada> getOperacionesPorModeloYPuesto(int modelo, int puesto) {
		String sql = "select * from Operaciones inner join Operaciones_Asignadas on Operaciones.Id = Operaciones_Asignadas.Operacion where Modelo = ? and Puesto = ? order by prioridad";
		List<OperacionAsignada> lista = new ArrayList<OperacionAsignada>();
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, modelo);
			stmt.setInt(2, puesto);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Operacion operacion = new Operacion();
				operacion.setId(rs.getInt(1));
				operacion.setDescripcion(rs.getString(2));
				operacion.setCategoria(rs.getString(3));
				operacion.setTorque(rs.getInt(4));
				operacion.setTolerancia(rs.getFloat(5));
				operacion.setUtillaje(rs.getString(6));
				operacion.setTiempo(rs.getFloat(7));
				operacion.setTexto(rs.getString(8));
				operacion.setProceso(rs.getInt(9));
				OperacionAsignada opAsignada = new OperacionAsignada();
				opAsignada.setOperacion(operacion);
				opAsignada.setIdModelo(rs.getInt(10));
				opAsignada.setCodigoPuesto(rs.getInt(11));
				opAsignada.setIdOperacion(rs.getInt(12));
				opAsignada.setPrioridad(rs.getInt(13));
				lista.add(opAsignada);
			}
			return lista;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<OperacionAsignada> getOperacionesPorModelo(int modelo) {
		String sql = "select * from Operaciones inner join Operaciones_Asignadas on Operaciones.Id = Operaciones_Asignadas.Operacion inner join Modelos on Operaciones_Asignadas.Modelo = Modelos.Id where Modelo = ? order by prioridad";
		List<OperacionAsignada> lista = new ArrayList<OperacionAsignada>();
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, modelo);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Operacion op = new Operacion();				
				op.setId(rs.getInt(1));
				op.setDescripcion(rs.getString(2));
				op.setCategoria(rs.getString(3));
				op.setTorque(rs.getInt(4));
				op.setTolerancia(rs.getFloat(5));
				op.setUtillaje(rs.getString(6));
				op.setTiempo(rs.getFloat(7));
				op.setTexto(rs.getString(8));
				op.setProceso(rs.getInt(9));
				OperacionAsignada opAsignada = new OperacionAsignada();
				opAsignada.setOperacion(op);
				opAsignada.setIdModelo(rs.getInt(10));
				opAsignada.setCodigoPuesto(rs.getInt(11));
				opAsignada.setIdOperacion(rs.getInt(12));
				opAsignada.setPrioridad(rs.getInt(13));
				Modelo m = new Modelo();
				m.setId(rs.getInt(14));
				m.setReferencia(rs.getString(15));
				opAsignada.setModelo(m);
				lista.add(opAsignada);
			}
			return lista;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

}
