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
    private String contrasena;
    private String nombre;
    private String apellido;
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFotodePerfil() {
        return fotodePerfil;
    }

    public void setFotodePerfil(String fotodePerfil) {
        this.fotodePerfil = fotodePerfil;
    }

    public String getTitulodeProfesional() {
        return titulodeProfesional;
    }

    public void setTitulodeProfesional(String titulodeProfesional) {
        this.titulodeProfesional = titulodeProfesional;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Profesional(int id, String usuario, int telefono, String email, String fotodePerfil, String titulodeProfesional, int calificacion, String curriculum, String localidad, String provincia, String contrasena, String nombre, String apellido, String direccion) {
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
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Profesional() {
    }

    
}