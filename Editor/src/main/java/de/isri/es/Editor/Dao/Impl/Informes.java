package de.isri.es.Editor.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.isri.es.Editor.Dao.InformesDAO;
import de.isri.es.Editor.db.Database;
import de.isri.es.Editor.models.InformePuestos;

public class Informes implements InformesDAO {

	@Override
	public InformePuestos getInformePuestos(int modelo) {
		String sql = "select Puesto, sum(Tiempo) from Operaciones inner join Operaciones_Asignadas on Operaciones.Id = Operaciones_Asignadas.Operacion where Modelo = ? group by Puesto";
		InformePuestos informePuestos = new InformePuestos();
		try {
			Connection conn = Database.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, modelo);
			ResultSet rs = stmt.executeQuery();
			List<Integer> puestos = new ArrayList<Integer>();
			List<Float> tiempos = new ArrayList<Float>();
			while(rs.next()) {
				puestos.add(rs.getInt(1));
				tiempos.add(rs.getFloat(2));
			}
			informePuestos.setPuestos(puestos);
			informePuestos.setTiempos(tiempos);
			return informePuestos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
