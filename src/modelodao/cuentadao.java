package modelodao;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import conexion.conexion;
import modelo.cliente;
import modelo.cuenta;
import modelo.ejecutivo;
import modelo.juridico;

public class cuentadao {
	
		private static final String SQL_INGRESAR_CUENTA=
				"call banco.sp_ingresar_cuenta(?,?,?);";
		private static final String SQL_ACTUALIZAR_CUENTA=
				"call banco.sp_ingresar_actualizar(?,?,?,?);";

		private static final conexion cnn=conexion.saberEstado();
		
		public boolean ingresar(cuenta x) {
			CallableStatement ps;
			ResultSet rs;
			int bandera=0;
			try {
				ps=cnn.getCnn().prepareCall(SQL_INGRESAR_CUENTA);
				ps.setString(1,x.getClientote().getPerRut());
				ps.setInt(2, x.getCueSaldo());
				ps.setInt(3, x.getCueSobregiro());
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
		public boolean actualizar(cuenta x) {
			CallableStatement ps;
			ResultSet rs;
			int bandera=0;
			try {
				ps=cnn.getCnn().prepareCall(SQL_ACTUALIZAR_CUENTA);
				ps.setInt(1,x.getCueId());
				ps.setInt(2, x.getCueSaldo());
				ps.setString(3, x.getCueEstado());
				ps.setInt(4,x.getCueSobregiro());
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
//			public boolean eliminar(cuenta x) {
			//CallableStatement ps;
		//	ResultSet rs;
			//int bandera = 0;
			//try {
				//ps=
			
			
		}
	