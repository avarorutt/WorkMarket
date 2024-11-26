package Modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionPublicacionp {
    private Conexion c;
    private Connection cn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    // Constructor
    public GestionPublicacionp() {
        this.c = new Conexion();
    }

    // Insertar Publicación Profesional
    public boolean insertarPublicacion(PublicacionProfesional p) throws SQLException {
        boolean respuesta = false;
        String sql = "INSERT INTO publicacionp (idpublicacionp, titulo, descripcion, rubro, idProf) VALUES (?, ?, ?, ?, ?)";
        
        try {
            cn = c.conectar();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, p.getIdpublicacionp());
            ps.setString(2, p.getTitulo());
            ps.setString(3, p.getDescripcion());
            ps.setString(4, p.getRubro());
            ps.setInt(5, p.getIdProf());

            int res = ps.executeUpdate();
            respuesta = res > 0;
        } catch (SQLException exc) {
            exc.printStackTrace();
        } finally {
            cerrarRecursos();
        }
        return respuesta;
    }

    public ArrayList<PublicacionProfesional> buscarPublicacionesP() throws SQLException {
    
    ArrayList<PublicacionProfesional> lista = new ArrayList<>();
    try {
        cn = c.conectar();
        ps = cn.prepareStatement("SELECT * FROM publicacionp WHERE idProf > 0");
        rs = ps.executeQuery();
        
        while (rs.next()) {
            PublicacionProfesional pp = new PublicacionProfesional();
            pp.setIdpublicacionp(rs.getInt("idpublicacionp"));
            pp.setTitulo(rs.getString("titulo"));
            pp.setDescripcion(rs.getString("descripcion"));
            pp.setRubro(rs.getString("rubro"));
            pp.setIdProf(rs.getInt("idProf"));
            lista.add(pp);
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
    return lista;
}

    // Buscar Publicación por ID
    public PublicacionProfesional buscarPublicacionId(int id) throws SQLException {
        PublicacionProfesional p = new PublicacionProfesional();
        String sql = "SELECT * FROM publicacionp WHERE idpublicacionp=?";

        try {
            cn = c.conectar();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
                    

            if (rs.next()) {
                
                p.setIdpublicacionp(rs.getInt("idpublicacionp"));
                p.setTitulo(rs.getString("titulo"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setRubro(rs.getString("rubro"));
                p.setIdProf(rs.getInt("idProf"));
                
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        } finally {
            cerrarRecursos();
        }
        return p;
    }

    // Eliminar Publicación
    public boolean eliminarPublicacion(int id) throws SQLException {
        boolean respuesta = false;
        String sql = "DELETE FROM publicacionp WHERE idpublicacionp=?";

        try {
            cn = c.conectar();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            int res = ps.executeUpdate();
            respuesta = res > 0;
        } catch (SQLException exc) {
            exc.printStackTrace();
        } finally {
            cerrarRecursos();
        }
        return respuesta;
    }

    // Actualizar Publicación
    public boolean actualizarPublicacion(PublicacionProfesional p) throws SQLException {
        boolean respuesta = false;
        String sql = "UPDATE publicacionp SET titulo=?, descripcion=?, rubro=? WHERE idpublicacionp=?";

        try {
            cn = c.conectar();
            ps = cn.prepareStatement(sql);
            ps.setString(1, p.getTitulo());
            ps.setString(2, p.getDescripcion());
            ps.setString(3, p.getRubro());
            ps.setInt(4, p.getIdpublicacionp());
            int res = ps.executeUpdate();
            respuesta = res > 0;
        } catch (SQLException exc) {
            exc.printStackTrace();
        } finally {
            cerrarRecursos();
        }
        return respuesta;
    }

    // Método para cerrar recursos
    private void cerrarRecursos() {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (cn != null) cn.close();
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }
}
