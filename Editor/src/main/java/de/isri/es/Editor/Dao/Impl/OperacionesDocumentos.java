package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.OperacionesDocumentosDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.OperacionDocumento;

public class OperacionesDocumentos implements OperacionesDocumentosDAO {

	@Override
	public List<OperacionDocumento> getDocumentosDeOperacion(int operacion) {
		String sql = "select * from Documentos inner join Operaciones_Documentos on id = Documento where Operacion = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			ResultSet rs = stmt.executeQuery();
			List<OperacionDocumento> lista = new ArrayList<OperacionDocumento>();
			while(rs.next()) {
				OperacionDocumento opDoc = new OperacionDocumento();
				opDoc.setIdDocumento(rs.getInt(1));
				opDoc.setRuta(rs.getString(2));
				opDoc.setIdOperacion(rs.getInt(3));		
				lista.add(opDoc);
			}
			return lista;			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionDocumento insertOperacionDocumento(OperacionDocumento opDoc) {
		String sql = "insert into Operaciones_Documentos(Operacion, Documento) values(?, ?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, opDoc.getIdOperacion());
			stmt.setInt(2, opDoc.getIdDocumento());
			stmt.execute();
			return opDoc;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionDocumento updateOperacionDocumento(int operacion, int documento, OperacionDocumento opDoc) {
		String sql = "update Operaciones_Documentos set operacion = ?, documento = ? where operacion = ? and documento = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, opDoc.getIdOperacion());
			stmt.setInt(2, opDoc.getIdDocumento());
			stmt.setInt(3, operacion);
			stmt.setInt(4, documento);
			stmt.execute();
			return opDoc;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OperacionDocumento deleteOperacionDocumento(int operacion, int documento) {
		String sql = "delete from Operaciones_Documentos where operacion = ? and documento = ?";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, operacion);
			stmt.setInt(2, documento);
			stmt.execute();
			return new OperacionDocumento();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
