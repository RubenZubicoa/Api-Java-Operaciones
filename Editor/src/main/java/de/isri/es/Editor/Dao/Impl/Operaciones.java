package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.OperacionesDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.Material;
import de.isri.es.Editor.models.Operacion;

public class Operaciones implements OperacionesDAO{

	@Override
	public List<Operacion> getOperaciones() {
		String sql = "select * from operaciones";
		List<Operacion> operacionesList = new ArrayList<Operacion>();
		try {
			Connection conn = Database.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Operacion operacion = new Operacion();
				operacion.setId(rs.getInt(1));
				operacion.setDescripcion(rs.getString(2));
				operacion.setCategoria(rs.getString(3));
				operacion.setTorque(rs.getFloat(4));
				operacion.setTolerancia(rs.getFloat(5));
				operacion.setUtillaje(rs.getString(6));
				operacion.setTiempo(rs.getFloat(7));
				operacion.setTexto(rs.getString(8));
				operacion.setProceso(rs.getInt(9));
				operacionesList.add(operacion);
			}
			return operacionesList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Operacion insertOperacion(Operacion operacion) {
		String sql = "insert into Operaciones(Id, Descripcion, Categoria, Torque, Tolerancia, Utillaje, Tiempo, Texto, Proceso) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion.getId());
			stmt.setString(2, operacion.getDescripcion());
			stmt.setString(3, operacion.getCategoria());
			stmt.setFloat(4, operacion.getTorque());
			stmt.setFloat(5, operacion.getTolerancia());
			stmt.setString(6, operacion.getUtillaje());
			stmt.setFloat(7, operacion.getTiempo());
			stmt.setString(8, operacion.getTexto());
			stmt.setInt(9, operacion.getProceso());
			stmt.execute();
			return operacion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Operacion updateOperacion(int id, Operacion operacion) {
		String sql = "update Operaciones set Id = ?, Descripcion = ?, Categoria = ?, Torque = ?, Tolerancia = ?, Utillaje = ?, Tiempo = ?, Texto = ?, Proceso = ? where id = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion.getId());
			stmt.setString(2, operacion.getDescripcion());
			stmt.setString(3, operacion.getCategoria());
			stmt.setFloat(4, operacion.getTorque());
			stmt.setFloat(5, operacion.getTolerancia());
			stmt.setString(6, operacion.getUtillaje());
			stmt.setFloat(7, operacion.getTiempo());
			stmt.setString(8, operacion.getTexto());
			stmt.setInt(9, operacion.getProceso());
			stmt.setInt(10, id);
			stmt.execute();
			return operacion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Operacion deleteOperacion(int id) {
		String sql = "delete from operaciones where id = ?";			
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			return new Operacion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public List<Operacion> getOperacionesPorMaterial(Material material) {
		String sql = "select Operaciones.* from Operaciones inner join Materiales_Necesarios on Id = Materiales_Necesarios.Operacion inner join Materiales on Materiales_Necesarios.Material = Materiales.Id where Materiales.Referencia like '%"+material.getReferencia()+"%' group by Operaciones.Id, Operaciones.Descripcion, Operaciones.Categoria, Operaciones.Torque, Operaciones.Tolerancia, Operaciones.Utillaje, Operaciones.Tiempo, Operaciones.Texto, Operaciones.Proceso";
		try {
			Connection conn = Database.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			List<Operacion> lista = new ArrayList<Operacion>();
			while(rs.next()) {
				Operacion operacion = new Operacion();
				operacion.setId(rs.getInt(1));
				operacion.setDescripcion(rs.getString(2));
				operacion.setCategoria(rs.getString(3));
				operacion.setTorque(rs.getFloat(4));
				operacion.setTolerancia(rs.getFloat(5));
				operacion.setUtillaje(rs.getString(6));
				operacion.setTiempo(rs.getFloat(7));
				operacion.setTexto(rs.getString(8));
				operacion.setProceso(rs.getInt(9));
				lista.add(operacion);
			}
			return lista;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
