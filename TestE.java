package test;

import Modelo.GestionarEmpresa;
import Modelo.Empresa;
import java.sql.SQLException;

public class TestE {

    public static void main(String[] args) throws SQLException {

        // Prueba del buscar empresa por id
        GestionarEmpresa gestionarEmpresa = new GestionarEmpresa();
        Empresa empresa = new Empresa();

        empresa = gestionarEmpresa.buscarEmpresaId(2);
        System.out.println("Empresa encontrada: " + empresa.getRazonSocial());

        // Prueba del insertar
        Empresa nuevaEmpresa = new Empresa(5, "UsuarioEmpresa", "password123", "Empresa S.A.", 123456789, "empresa@ejemplo.com", "Calle Falsa 123", "Localidad Ejemplo", "Provincia Ejemplo", "Rubro Ejemplo", "logo.png", 5, "Certificación Ejemplo");
        boolean insertado = gestionarEmpresa.insertarEmpresa(nuevaEmpresa);
        System.out.println("Empresa insertada: " + insertado);

        // Prueba del eliminar
        boolean eliminado = gestionarEmpresa.eliminarEmpresa(6);
        System.out.println("Empresa eliminada: " + eliminado);

        // Prueba del modificar
        nuevaEmpresa.setId(1);
        nuevaEmpresa.setRazonSocial("Empresa Modificada S.A.");
        boolean modificado = gestionarEmpresa.modificarEmpresa(nuevaEmpresa);
        System.out.println("Empresa modificada: " + modificado);
    }
}
