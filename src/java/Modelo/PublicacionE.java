package Modelo;

import java.util.ArrayList;

public class PublicacionE {

    private int id;
    private String descripcion;
    private String titulo;
    private String requestions;
    private ArrayList<Empresa> listadoProfesional;

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRequestions() {
        return requestions;
    }

    public void setRequestions(String requestions) {
        this.requestions = requestions;
    }
  

    public PublicacionE() {
    }

    public PublicacionE(int id, String descripcion, String titulo, String requestions) {
        this.id = id;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.requestions = requestions;
    }

}