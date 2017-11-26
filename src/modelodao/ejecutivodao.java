package modelodao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import conexion.conexion;
import modelo.ejecutivo;
import modelo.natural;


public class ejecutivodao {
	private static final String SQL_INGRESAR_EJECUTIVO=
			"call banco.sp_ingresar_ejecutivo(?,?,?,?,?);";
	private static final String SQL_ACTUALIZAR_EJECUTIVO=
			"call banco.sp_actualizar_ejecutivo(?,?,?,?,?,?,?);";

	private static final conexion cnn=conexion.saberEstado();
	
	public boolean ingresar(ejecutivo x) {
		CallableStatement ps;
		ResultSet rs;
		int bandera=0;
		try {
			ps=cnn.getCnn().prepareCall(SQL_INGRESAR_EJECUTIVO);
			ps.setString(1,x.getPerRut());
			ps.setString(2, x.getPerNombre());
			ps.setString(3, x.getPerApePaterno());
			ps.setString(4, x.getPerApeMaterno());
			ps.setString(5, x.getEjeFecContrato());
			rs= ps.executeQuery();
			while(rs.next()) {
				bandera = rs.getInt("_resultado");
				System.out.println(bandera);
			}
			if (bandera > 0) {
				return true;
			}
		}catch(SQLException ex) {
			System.out.println(ex.toString());
		}finally {
			cnn.cerrarConexion();}
		return false;
	}
	public boolean actualizar(ejecutivo x) {
		CallableStatement ps;
		ResultSet rs;
		int bandera=0;
		try {
			ps=cnn.getCnn().prepareCall(SQL_ACTUALIZAR_EJECUTIVO);
			ps.setString(1,x.getPerRut());
			ps.setString(2, x.getPerNombre());
			ps.setString(3, x.getPerApePaterno());
			ps.setString(4,x.getPerApeMaterno());
			ps.setString(5, x.getPerNacionalidad());
			ps.setString(6, x.getPerFecNacimiento());
			ps.setString(7, x.getEjeFecContrato());
			rs= ps.executeQuery();
			while(rs.next()) {
				bandera = rs.getInt("_resultado");
				System.out.println(bandera);
			}
			if (bandera > 0) {
				return true;
			}
		}catch(SQLException ex) {
			System.out.println(ex.toString());
		}finally {
			cnn.cerrarConexion();}
		return false;
	}

}