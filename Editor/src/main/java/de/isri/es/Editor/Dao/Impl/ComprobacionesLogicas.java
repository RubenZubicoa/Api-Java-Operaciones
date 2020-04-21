package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.ComprobacionesLogicasDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.ComprobacionLogica;
import de.isri.es.Editor.models.Modelo;
import de.isri.es.Editor.models.TipoComprobacion;

public class ComprobacionesLogicas implements ComprobacionesLogicasDAO {

	@Override
	public List<ComprobacionLogica> getComprobacionesDeOperacion(int operacion) {
		String sql = "select * from Comprobaciones_logicas inner join tipo_comprobaciones on Tipo_Comprobacion = tipo_comprobaciones.Id inner join Modelos on Modelo = Modelos.Id where operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			ResultSet rs = stmt.executeQuery();
			List<ComprobacionLogica> lista = new ArrayList<ComprobacionLogica>();
			while(rs.next()) {
				ComprobacionLogica comprobacion = new ComprobacionLogica();
				comprobacion.setId(rs.getInt(1));
				comprobacion.setIdOperacion(rs.getInt(2));
				comprobacion.setIdModelo(rs.getInt(3));
				comprobacion.setIdTipoComprobacion(rs.getInt(4));
				comprobacion.setEquals(rs.getInt(5));
				comprobacion.setError(rs.getInt(6));
				comprobacion.setTexto(rs.getString(7));
				comprobacion.setCodigoPuesto(rs.getInt(8));
				
				TipoComprobacion tipo = new TipoComprobacion();
				tipo.setId(rs.getInt(9));
				tipo.setDescripcion(rs.getString(10));
				comprobacion.setTipoComprobacion(tipo);
				
				Modelo modelo = new Modelo();
				modelo.setId(rs.getInt(11));
				modelo.setReferencia(rs.getString(12));
				comprobacion.setModelo(modelo);
				lista.add(comprobacion);
			}
			return lista;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ComprobacionLogica insertComprobacion(ComprobacionLogica comprobacion) {
		String sql = "insert into Comprobaciones_logicas(Operacion, Modelo, Tipo_Comprobacion, Equals, Error, Texto, puesto) values(?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, comprobacion.getIdOperacion());
			stmt.setInt(2, comprobacion.getIdModelo());
			stmt.setInt(3, comprobacion.getIdTipoComprobacion());
			stmt.setInt(4, comprobacion.getEquals());
			stmt.setInt(5, comprobacion.getError());
			stmt.setString(6, comprobacion.getTexto());
			stmt.setInt(7, comprobacion.getCodigoPuesto());
			stmt.execute();
			return comprobacion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ComprobacionLogica updateComprobacion(int id, ComprobacionLogica comprobacion) {
		String sql = "update Comprobaciones_logicas set Operacion = ?, Modelo = ?, Tipo_Comprobacion = ?, Equals = ?, Error = ?, Texto = ?, puesto = ? where id = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, comprobacion.getIdOperacion());
			stmt.setInt(2, comprobacion.getIdModelo());
			stmt.setInt(3, comprobacion.getIdTipoComprobacion());
			stmt.setInt(4, comprobacion.getEquals());
			stmt.setInt(5, comprobacion.getError());
			stmt.setString(6, comprobacion.getTexto());
			stmt.setInt(7, comprobacion.getCodigoPuesto());
			stmt.setInt(8, id);
			stmt.execute();
			return comprobacion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ComprobacionLogica deleteComprobacion(int id) {
		String sql = "delete from Comprobaciones_logicas where id = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			return new ComprobacionLogica();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
