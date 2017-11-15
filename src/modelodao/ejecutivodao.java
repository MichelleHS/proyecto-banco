package modelodao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import conexion.conexion;
import modelo.ejecutivo;
import modelo.juridico;


public class ejecutivodao {
	private static final String SQL_INGRESAR_PERSONA=
            "INSERT INTO persona(perRut, perNombre, perApePaterno, perApeMaterno, perNacionalidad, perFecNacimiento) "
            + "VALUES (?, ?, ?, ?, ?, ?)";
	private static final String SQL_INGRESAR_EJECUTIVO=
            "INSERT INTO ejecutivo(persona_perRut, ejeFecContrato) "
            + "VALUES (?, ?)";

	
	private static final conexion cnn=conexion.saberEstado();
	
	public boolean ingresar(ejecutivo x) {
        PreparedStatement ps;
        int bandera;
        try {
            ps=cnn.getCnn().prepareStatement(SQL_INGRESAR_PERSONA);
            ps.setString(1, x.getPerRut());
            ps.setString(2, x.getPerNombre());
            ps.setString(3, x.getPerApePaterno());
            ps.setString(4, x.getPerApeMaterno());
            ps.setString(5, x.getPerNacionalidad());
            ps.setString(6, x.getPerFecNacimiento());
            
            
            ps=cnn.getCnn().prepareStatement(SQL_INGRESAR_EJECUTIVO);
            ps.setString(1, x.getPerRut());
            ps.setString(2, x.getEjeFecContrato());
            bandera=ps.executeUpdate();
            if(bandera > 0){
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            cnn.cerrarConexion();
        }
        return false;
	}

	

}
