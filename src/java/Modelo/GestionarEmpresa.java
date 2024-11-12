package Modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarEmpresa {
    private Conexion c;
    private Connection cn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public GestionarEmpresa (){
        this.c = new Conexion ();
        this.cn = null;
        this.ps = null;
        this.rs = null;
    }
    
    //Código Insert
    public boolean insertarEmpresa (Empresa e) throws SQLException{
        boolean respuesta = false;
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO empresa (usuario, contrasena, razonSocial, tel, email, direccion, localidad, provincia, rubro, logo, calificacion, certificacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, e.getUsuario());
            ps.setString(2, e.getContraseña());
            ps.setString(3, e.getRazonSocial());
            ps.setInt(4, e.getTelefono());
            ps.setString(5, e.getEmail());
            ps.setString(6, e.getDireccion());
            ps.setString(7, e.getLocalidad());
            ps.setString(8, e.getProvincia());
            ps.setString(9, e.getRubro());
            ps.setString(10, e.getLogo());
            ps.setInt(11, e.getCalificacion());
            ps.setString(12, e.getCertificacion());
            int res = ps.executeUpdate();
            respuesta = res > 0;
        } catch (SQLException exc) {
            
        } finally{
            try {
                if (rs!=null) {rs.close();}
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException exc2){
                
            }
        }
        return respuesta;
    }
    
    //Buscar Empresa
    public Empresa buscarEmpresaId(int idEmpresa) throws SQLException{
        Empresa e = new Empresa();
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM empresa WHERE idEmpresa=?");
            ps.setInt(1, idEmpresa);
            rs = ps.executeQuery();
            if (rs.next()){
                e.setId(rs.getInt(1));
                e.setUsuario(rs.getString(2));
                e.setContraseña(rs.getString(3));
                e.setRazonSocial(rs.getString(4));
                e.setTelefono(rs.getInt(5));
                e.setEmail(rs.getString(6));
                e.setDireccion(rs.getString(7));
                e.setLocalidad(rs.getString(8));
                e.setProvincia(rs.getString(9));
                e.setRubro(rs.getString(10));
                e.setLogo(rs.getString(11));
                e.setCalificacion(rs.getInt(12));
                e.setCertificacion(rs.getString(13));
            }
        } catch (SQLException exc) {
            
        }finally{
            try {
                if (rs!=null) {rs.close();}
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException exc2){
                
            }
        }
        return e;
    }
    
    //Eliminar
    public boolean eliminarEmpresa (int EmpresaId) throws SQLException{
        boolean respuesta = false;
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("DELETE FROM empresa WHERE EmpresaId=?");
            ps.setInt(1, EmpresaId);
            int res = ps.executeUpdate();
            respuesta = res>0;
        } catch (SQLException exc) {
            
        } finally{
            try {
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException exc2){
                
            }
        }
        return respuesta;
    }
    
    //Modificar
    public boolean modificarEmpresa (Empresa e) throws SQLException {
        boolean respuesta = false;
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("UPDATE workmarket.empresa SET usuario = ?, contrasena = ?, razonSocial = ?, tel = ?, email = ?, direccion = ?, localidad = ?, provincia = ?, rubro = ?, logo = ?, calificacion = ?, certificacion = ? WHERE idEmpresa=? ");
            ps.setString(1, e.getUsuario());
            ps.setString(2, e.getContraseña());
            ps.setString(3, e.getRazonSocial());
            ps.setInt(4, e.getTelefono());
            ps.setString(5, e.getEmail());
            ps.setString(6, e.getDireccion());
            ps.setString(7, e.getLocalidad());
            ps.setString(8, e.getProvincia());
            ps.setString(9, e.getRubro());
            ps.setString(10, e.getLogo());
            ps.setInt(11, e.getCalificacion());
            ps.setString(12, e.getCertificacion());
            int res = ps.executeUpdate();
            respuesta = res>0;
        } catch (SQLException exc){
            
        } finally{
            try {
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException exc2){
                
            }
        }
        return respuesta; 
    }
    
public Empresa buscarEmpresaLogin(String usuario, String contrasena) throws SQLException {
    Empresa e = null;
    try {
        cn = c.conectar();
        ps = cn.prepareStatement("SELECT * FROM empresa WHERE usuario = ? AND contrasena = ?");
        ps.setString(1, usuario);
        ps.setString(2, contrasena);
        rs = ps.executeQuery();
        
        if (rs.next()) {
       
            e = new Empresa();
            e.setUsuario(rs.getString("usuario"));
            e.setContraseña(rs.getString("contrasena"));
            e.setRazonSocial(rs.getString("razonSocial"));
            e.setTelefono(rs.getInt("tel"));
            e.setEmail(rs.getString("email"));
            e.setDireccion(rs.getString("direccion"));
            e.setLocalidad(rs.getString("localidad"));
            e.setProvincia(rs.getString("provincia"));
            e.setRubro(rs.getString("rubro"));
            e.setLogo(rs.getString("logo"));
            e.setCalificacion(rs.getInt("calificacion"));
            e.setCertificacion(rs.getString("certificacion"));
        }
    } catch (SQLException exc) {
        exc.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (cn != null) cn.close();
        } catch (SQLException exc2) {
            exc2.printStackTrace();
        }
    }
    return e;
}
}
