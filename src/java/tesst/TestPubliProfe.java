package test;

import Modelo.GestionPublicacionp;
import Modelo.PublicacionProfesional;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class TestPubliProfe {
    public static void main(String[] args) throws SQLException {
        // Crear instancia de la clase que gestiona las publicaciones
        GestionPublicacionp GestionPublicacionp = new GestionPublicacionp();
        
        // Crear una nueva publicación profesional
        PublicacionProfesional nuevaPublicacion = new PublicacionProfesional();
        nuevaPublicacion.setTitulo("Nueva Publicación 1");
        nuevaPublicacion.setDescripcion("Descripción de prueba 1");
        nuevaPublicacion.setRubro("Tecnología 1");
        nuevaPublicacion.setIdProf(5);

        // Insertar la publicación
        System.out.println("Insertar publicación: " + GestionPublicacionp.insertarPublicacion(nuevaPublicacion));

     // Buscar la publicación insertada por el ID generado

PublicacionProfesional publicacionBuscada = GestionPublicacionp.buscarPublicacionId(4);
if (publicacionBuscada != null) {
    System.out.println("Publicación encontrada: " + publicacionBuscada.getTitulo() + publicacionBuscada.getRubro() + publicacionBuscada.getDescripcion());
} else {
    System.out.println("Publicación no encontrada.");
}


    // Actualizar la publicación
   nuevaPublicacion.setIdpublicacionp(2);
    boolean publicacionActualizada = GestionPublicacionp.actualizarPublicacion(nuevaPublicacion);
    System.out.println("Actualizar publicación: " + (publicacionActualizada ? "Éxito" : "Fallo"));

    // Eliminar la publicación
    System.out.println("Eliminar publicación: " + GestionPublicacionp.eliminarPublicacion(5));
}
       
}
