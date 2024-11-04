
package Modelo;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarProfesional {
    private Conexion c;
    private Connection cn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
   //Gestionar Profesional
    public GestionarProfesional (){
        this.c = new Conexion ();
        this.cn = null;
        this.ps = null;
        this.rs = null;
    }
   //Código Insert
    public boolean insertarProfesional (Profesional e) throws SQLException{
        boolean respuesta = false;
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO profesional (usuario, contrasena, nombre, apellido, telefono, email, fotoPerfil, tituloProfesional, calificacion, curriculum, direccion, localidad, provincia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, e.getUsuario());
            ps.setString(2, e.getContrasena());
            ps.setString(3, e.getNombre());
            ps.setString(4, e.getApellido());
            ps.setInt(5, e.getTelefono());
            ps.setString(6, e.getEmail());
            ps.setString(7, e.getFotodePerfil());
            ps.setString(8, e.getTitulodeProfesional());
            ps.setInt(9, e.getCalificacion());
            ps.setString(10, e.getCurriculum());
            ps.setString(11, e.getDireccion());
            ps.setString(12, e.getLocalidad());
            ps.setString(13, e.getProvincia());
            int res = ps.executeUpdate();
            respuesta = res > 0;
        } catch (SQLException exc) {
           exc.printStackTrace();
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
   
    //Buscar Profesional
    public Profesional buscarProfesional(int id) throws SQLException{
        Profesional e = new Profesional();
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM profesional WHERE id=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()){
                e.setId(rs.getInt(1));
                e.setUsuario(rs.getString(2));
                e.setContrasena(rs.getString(3));
                e.setNombre(rs.getString(4));
                e.setApellido(rs.getString(5));
                e.setTelefono(rs.getInt(6));
                e.setEmail(rs.getString(7));
                e.setFotodePerfil(rs.getString(8));
                e.setTitulodeProfesional(rs.getString(9));
                e.setCalificacion(rs.getInt(10));
                e.setCurriculum(rs.getString(11));
                e.setDireccion(rs.getString(12));
                e.setLocalidad(rs.getString(13));
                e.setProvincia(rs.getString(14));
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
    public boolean eliminarProfesional (int id) throws SQLException{
        boolean respuesta = false;
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("DELETE FROM profesional WHERE id=?");
            ps.setInt(1, id);
            int res = ps.executeUpdate();
            respuesta = res>0;
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
     //Modificar
    public boolean modificarProfesional(Profesional e) throws SQLException {
    boolean respuesta = false;
    try {
        cn = c.conectar();
        ps = cn.prepareStatement("UPDATE profesional SET usuario = ?, contrasena = ?, nombre = ?, apellido = ?, telefono = ?, email = ?, fotoPerfil = ?, tituloProfesional = ?, calificacion = ?, curriculum = ?, direccion = ?, localidad = ?, provincia = ? WHERE id = ?");
        ps.setString(1, e.getUsuario());
        ps.setString(2, e.getContrasena());
        ps.setString(3, e.getNombre());
        ps.setString(4, e.getApellido());
        ps.setInt(5, e.getTelefono());
        ps.setString(6, e.getEmail());
        ps.setString(7, e.getFotodePerfil());
        ps.setString(8, e.getTitulodeProfesional());
        ps.setInt(9, e.getCalificacion());
        ps.setString(10, e.getCurriculum());
        ps.setString(11, e.getDireccion());
        ps.setString(12, e.getLocalidad());
        ps.setString(13, e.getProvincia());
        ps.setInt(14, e.getId());
        int res = ps.executeUpdate();
        respuesta = res > 0;
    } catch (SQLException exc) {
        exc.printStackTrace();
    } finally {
        try {
            if (ps != null) {ps.close();}
            if (cn != null) {cn.close();}
        } catch (SQLException exc2) {
            exc2.printStackTrace();
        }
    }
    return respuesta;
}
    //Buscar Profesional nombre
    public ArrayList<Profesional> buscarProfesionalN (String nombre) throws SQLException{
      ArrayList<Profesional> lista = new ArrayList<>();
      
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM profesional WHERE nombre=?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            
            while(rs.next()){
           Profesional e = new Profesional();
                e.setId(rs.getInt(1));
                e.setUsuario(rs.getString(2));
                e.setContrasena(rs.getString(3));
                e.setNombre(rs.getString(4));
                e.setApellido(rs.getString(5));
                e.setTelefono(rs.getInt(6));
                e.setEmail(rs.getString(7));
                e.setFotodePerfil(rs.getString(8));
                e.setTitulodeProfesional(rs.getString(9));
                e.setCalificacion(rs.getInt(10));
                e.setCurriculum(rs.getString(11));
                e.setDireccion(rs.getString(12));
                e.setLocalidad(rs.getString(13));
                e.setProvincia(rs.getString(14));
                lista.add(e);
             
            
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
        return lista;
    }
     //Buscar Profesional apellido
    public ArrayList<Profesional> buscarProfesionalA (String apellido) throws SQLException{
      ArrayList<Profesional> lista = new ArrayList<>();
      
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM profesional WHERE apellido=?");
            ps.setString(1, apellido);
            rs = ps.executeQuery();
             
            while(rs.next()){
           Profesional e = new Profesional();
                e.setId(rs.getInt(1));
                e.setUsuario(rs.getString(2));
                e.setContrasena(rs.getString(3));
                e.setNombre(rs.getString(4));
                e.setApellido(rs.getString(5));
                e.setTelefono(rs.getInt(6));
                e.setEmail(rs.getString(7));
                e.setFotodePerfil(rs.getString(8));
                e.setTitulodeProfesional(rs.getString(9));
                e.setCalificacion(rs.getInt(10));
                e.setCurriculum(rs.getString(11));
                e.setDireccion(rs.getString(12));
                e.setLocalidad(rs.getString(13));
                e.setProvincia(rs.getString(14));
                lista.add(e);
                
            
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
        return lista;
    }
        //Buscar Profesional tituloProfesional
    public ArrayList<Profesional> buscarProfesionalTiPf (String tituloProfesional) throws SQLException{
      ArrayList<Profesional> lista = new ArrayList<>();
      
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM profesional WHERE tituloProfesional=?");
            ps.setString(1, tituloProfesional);
            rs = ps.executeQuery();
             
            while(rs.next()){
           Profesional e = new Profesional();
                e.setId(rs.getInt(1));
                e.setUsuario(rs.getString(2));
                e.setContrasena(rs.getString(3));
                e.setNombre(rs.getString(4));
                e.setApellido(rs.getString(5));
                e.setTelefono(rs.getInt(6));
                e.setEmail(rs.getString(7));
                e.setFotodePerfil(rs.getString(8));
                e.setTitulodeProfesional(rs.getString(9));
                e.setCalificacion(rs.getInt(10));
                e.setCurriculum(rs.getString(11));
                e.setDireccion(rs.getString(12));
                e.setLocalidad(rs.getString(13));
                e.setProvincia(rs.getString(14));
                lista.add(e);
                
            
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
        return lista;
    }
         //Buscar Profesional localidad
    public ArrayList<Profesional> buscarProfesionalLoc (String localidad) throws SQLException{
      ArrayList<Profesional> lista = new ArrayList<>();
      
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM profesional WHERE localidad=?");
            ps.setString(1, localidad);
            rs = ps.executeQuery();
             
            while(rs.next()){
           Profesional e = new Profesional();
                e.setId(rs.getInt(1));
                e.setUsuario(rs.getString(2));
                e.setContrasena(rs.getString(3));
                e.setNombre(rs.getString(4));
                e.setApellido(rs.getString(5));
                e.setTelefono(rs.getInt(6));
                e.setEmail(rs.getString(7));
                e.setFotodePerfil(rs.getString(8));
                e.setTitulodeProfesional(rs.getString(9));
                e.setCalificacion(rs.getInt(10));
                e.setCurriculum(rs.getString(11));
                e.setDireccion(rs.getString(12));
                e.setLocalidad(rs.getString(13));
                e.setProvincia(rs.getString(14));
                lista.add(e);
                
            
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
        return lista;
    }
         //Buscar Profesional provincia
    public ArrayList<Profesional> buscarProfesionalP (String provincia) throws SQLException{
      ArrayList<Profesional> lista = new ArrayList<>();
      
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM profesional WHERE provincia=?");
            ps.setString(1, provincia);
            rs = ps.executeQuery();
             
            while(rs.next()){
           Profesional e = new Profesional();
                e.setId(rs.getInt(1));
                e.setUsuario(rs.getString(2));
                e.setContrasena(rs.getString(3));
                e.setNombre(rs.getString(4));
                e.setApellido(rs.getString(5));
                e.setTelefono(rs.getInt(6));
                e.setEmail(rs.getString(7));
                e.setFotodePerfil(rs.getString(8));
                e.setTitulodeProfesional(rs.getString(9));
                e.setCalificacion(rs.getInt(10));
                e.setCurriculum(rs.getString(11));
                e.setDireccion(rs.getString(12));
                e.setLocalidad(rs.getString(13));
                e.setProvincia(rs.getString(14));
                lista.add(e);
                
            
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
        return lista;
    }
}


    
