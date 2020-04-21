package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.TipoComprobacionesDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.TipoComprobacion;

public class TipoComprobaciones implements TipoComprobacionesDAO {

	@Override
	public List<TipoComprobacion> getTipos() {
		String sql = "select * from Tipo_comprobaciones";
		try {
			Connection conn = Database.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			List<TipoComprobacion> tipos = new ArrayList<TipoComprobacion>();
			while(rs.next()) {
				TipoComprobacion tipo = new TipoComprobacion();
				tipo.setId(rs.getInt(1));
				tipo.setDescripcion(rs.getString(2));
				tipos.add(tipo);
			}
			return tipos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
