package Modelo;

public class Profesional {
    private int id;
    private String usuario;
    private int telefono;
    private String email;
    private String fotodePerfil;
    private String titulodeProfesional;
    private int calificacion;
    private String curriculum;
    private String localidad;
    private String provincia; 

    
    
    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getFotodePerfil() {
        return fotodePerfil;
    }

    public String getTitulodeProfesional() {
        return titulodeProfesional;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDireccion() {
        return direccion;
    }
    private String direccion;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFotodePerfil(String fotodePerfil) {
        this.fotodePerfil = fotodePerfil;
    }

    public void setTitulodeProfesional(String titulodeProfesional) {
        this.titulodeProfesional = titulodeProfesional;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Profesional() {
    }

    public Profesional(int id, String usuario, int telefono, String email, String fotodePerfil, String titulodeProfesional, int calificacion, String curriculum, String localidad, String provincia, String direccion) {
        this.id = id;
        this.usuario = usuario;
        this.telefono = telefono;
        this.email = email;
        this.fotodePerfil = fotodePerfil;
        this.titulodeProfesional = titulodeProfesional;
        this.calificacion = calificacion;
        this.curriculum = curriculum;
        this.localidad = localidad;
        this.provincia = provincia;
        this.direccion = direccion;
    }
    
    
}
