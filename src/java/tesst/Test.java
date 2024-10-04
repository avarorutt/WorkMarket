package test;

import Modelo.GestionarPublicacionE;
import Modelo.PublicacionE;
import java.sql.SQLException;


public class Test {
    public static void main (String[] args) throws SQLException{
    //prueba del buscar profesional
    GestionarPublicacionE a = new GestionarPublicacionE();
    PublicacionE p = new PublicacionE();
    p =  a.buscarPublicacionId(2);
    System.out.print (p.getTitulo());
    //prueba del insertar
    PublicacionE p1 = new PublicacionE(5,"Programa de Voluntariado", "Únete a nuestro equipo para ayudar en comunidades vulnerables. Haz la diferencia.", "Disponibilidad de al menos 5 horas semanales, ser mayor de 16 años, buen trato con personas.",1);
           System.out.println(a.insertarPublicacionE(p1));
 //prueba del eliminar
        boolean eliminado = a.eliminarPublicacionE(4);
        System.out.println("Publicacion eliminada: " + eliminado);
        //prueba del modificar
            p1.setId(3);
            boolean modificado = a.modificarPublicacionE(p1);
            System.out.println("Publicacion modificada: " + modificado);
    }
}
