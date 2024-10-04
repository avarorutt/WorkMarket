package Modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionarPublicacionE {
    private Conexion c;
    private Connection cn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public GestionarPublicacionE() {
        this.c = new Conexion();
        this.cn = null;
        this.ps = null;
        this.rs = null;
    }

    // Código Insert
    public boolean insertarPublicacionE(PublicacionE pe) throws SQLException {
        boolean respuesta = false;
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO publicacionE ( descripcion, titulo,  requisitos, idEmpresa) VALUES ( ?, ?, ?, ?)");
            ps.setString(1,pe.getTitulo ());
            ps.setString(2,pe.getDescripcion ());
            ps.setString(3,pe.getRequisitos());
            ps.setInt(4, pe.getidEmpresa());

            int res = ps.executeUpdate();
            respuesta = res > 0;
        } catch (SQLException exc) {
            exc.printStackTrace(); // Manejo de errores
        } finally {
            try {
                if (rs != null) { rs.close(); }
                if (ps != null) { ps.close(); }
                if (cn != null) { cn.close(); }
            } catch (SQLException exc2) {
                exc2.printStackTrace(); // Manejo de errores
            }
        }
        return respuesta;
    }

    // Buscar Publicación por ID
    public PublicacionE buscarPublicacionId(int id) throws SQLException {
        PublicacionE pe = new PublicacionE();
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM publicacionE WHERE idpublicacione=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pe.setId(rs.getInt(1));
                pe.setTitulo(rs.getString(2));
                pe.setDescripcion(rs.getString(3));
                pe.setRequisitos(rs.getString(4));
                pe.setidEmpresa(rs.getInt(5));

            }
        } catch (SQLException exc) {
            exc.printStackTrace(); // Manejo de errores
        } finally {
            try {
                if (rs != null) { rs.close(); }
                if (ps != null) { ps.close(); }
                if (cn != null) { cn.close(); }
            } catch (SQLException exc2) {
                exc2.printStackTrace(); // Manejo de errores
            }
        }
        return pe;
    }

    // Eliminar Publicación
    public boolean eliminarPublicacionE(int id) throws SQLException {
        boolean respuesta = false;
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("DELETE FROM publicacionE WHERE idpublicacione=?");
            ps.setInt(1, id);
            int res = ps.executeUpdate();
            respuesta = res > 0;
        } catch (SQLException exc) {
            exc.printStackTrace(); // Manejo de errores
        } finally {
            try {
                if (rs != null) { rs.close(); }
                if (ps != null) { ps.close(); }
                if (cn != null) { cn.close(); }
            } catch (SQLException exc2) {
                exc2.printStackTrace(); // Manejo de errores
            }
        }
        return respuesta;
       
    }
    
            //Modificar
    public boolean modificarPublicacionE(PublicacionE e) throws SQLException {
    boolean respuesta = false;
    try {
        cn = c.conectar();
        ps = cn.prepareStatement("UPDATE publicacione SET titulo = ?, descripcion = ?, requisitos = ?, idEmpresa = ?  WHERE idpublicacione = ?");
        ps.setString(1, e.getTitulo());
        ps.setString(2, e.getDescripcion());
        ps.setString(3, e.getRequisitos());
        ps.setInt(4, e.getidEmpresa());
        ps.setInt(5, e.getId());
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
}
