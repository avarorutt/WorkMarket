
package tesst;

import Modelo.GestionarProfesional;
import Modelo.Profesional;
import java.sql.SQLException;


public class Test {
    public static void main (String[] args) throws SQLException{
    //prueba del buscar profesional
    GestionarProfesional a = new GestionarProfesional();
    Profesional p = new Profesional();
    p =  a.buscarProfesional(2);
    System.out.print (p.getNombre());
    //prueba del insertar
    Profesional p1 = new Profesional("p1", "123", "juan", "perez", 123456789, "email@gmail.com", "foto.jpg", "Ingeniero", 5, "curriculum.pdf", "avenidaj 123", "Localidad", "Provincia");
        System.out.println(a.insertarProfesional(p1));
        //prueba del eliminar
        boolean eliminado = a.eliminarProfesional(5); 
        System.out.println("Profesional eliminado: " + eliminado);
        //prueba del modificar
            p1.setId(3);
            boolean modificado = a.modificarProfesional(p1);
            System.out.println("Profesional modificado: " + modificado);
    }
}
