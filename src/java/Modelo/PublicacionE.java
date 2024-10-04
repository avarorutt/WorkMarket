package Modelo;

import java.util.ArrayList;

public class PublicacionE {

    private int id;
    private String descripcion;
    private String titulo;
    private String requisitos;
    private int idEmpresa;

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }


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

    public int getidEmpresa() {
        return idEmpresa;
    }

    public void setidEmpresa(int requestions) {
        this.idEmpresa = idEmpresa;
    }
  

    public PublicacionE() {
    }

    public PublicacionE(int id, String descripcion, String titulo, int idEmpresa) {
        this.id = id;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.idEmpresa = idEmpresa;
    }

    public PublicacionE(int id, String descripcion, String titulo, String requisitos, int idEmpresa) {
        this.id = id;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.requisitos = requisitos;
        this.idEmpresa = idEmpresa;
    }

}