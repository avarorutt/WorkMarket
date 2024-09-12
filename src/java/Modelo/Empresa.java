package Modelo;

import java.util.ArrayList;

public class Empresa {

    private int id;
    private String usuario;
    private String contraseña;
    private String razonSocial;
    private int telefono;
    private String email;
    private String direccion;
    private String localidad;
    private String provincia;
    private String rubro;
    private String logo;
    private int calificacion;
    private String certificacion;
    
    private ArrayList<PublicacionP> listadoPublicacionP;
    private ArrayList<Profesional> favorito;
    
    
    public Empresa() {
    }

    public Empresa(int id, String usuario, String contraseña, String razonSocial, int telefono, String email, String direccion, String localidad, String provincia, String rubro, String logo, int calificacion, String certificacion) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.rubro = rubro;
        this.logo = logo;
        this.calificacion = calificacion;
        this.certificacion = certificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }
}






