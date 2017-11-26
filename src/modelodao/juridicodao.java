package modelodao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import conexion.conexion;
import modelo.cuenta;
import modelo.juridico;
import modelo.natural;


public class juridicodao {

	private static final String SQL_INGRESAR_JURIDICO=
			"call banco.sp_ingresar_juridico(?,?,?,?,?,?);";
	private static final String SQL_ACTUALIZAR_JURIDICO=
			"call banco.sp_actualizar_juridico(?,?,?,?,?,?,?,?,?);";

	private static final conexion cnn=conexion.saberEstado();
	
	public boolean ingresar(juridico x) {
		CallableStatement ps;
		ResultSet rs;
		int bandera=0;
		try {
			ps=cnn.getCnn().prepareCall(SQL_INGRESAR_JURIDICO);
			ps.setString(1,x.getPerRut());
			ps.setString(2, x.getPerNombre());
			ps.setString(3, x.getPerApePaterno());
			ps.setString(4,x.getPerApeMaterno());
			ps.setString(5, x.getCliCategoria());
			ps.setString(6, x.getJurRazonSocial());
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
	public boolean actualizar(juridico x) {
		CallableStatement ps;
		ResultSet rs;
		int bandera=0;
		try {
			ps=cnn.getCnn().prepareCall(SQL_ACTUALIZAR_JURIDICO);
			ps.setString(1,x.getPerRut());
			ps.setString(2, x.getPerNombre());
			ps.setString(3, x.getPerApePaterno());
			ps.setString(4,x.getPerApeMaterno());
			ps.setString(5, x.getPerNacionalidad());
			ps.setString(6, x.getPerFecNacimiento());
			ps.setString(7, x.getCliCategoria());
			ps.setString(8, x.getEje().getPerRut());
			ps.setString(9, x.getJurRazonSocial());
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

