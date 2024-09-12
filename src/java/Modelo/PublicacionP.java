package Modelo;

public class PublicacionP {
    private int id;
    private String rubro;
    private String titulo;
    private String descripcion; 

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PublicacionP() {
    }

    public PublicacionP(int id, String rubro, String titulo, String descripcion) {
        this.id = id;
        this.rubro = rubro;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

   
    
}