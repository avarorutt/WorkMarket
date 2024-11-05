package Modelo;

public class PublicacionProfesional {
    private int Idpublicacionp;
    private String rubro;
    private String titulo;
    private String descripcion; 
    private int IdProf;

    public int getIdpublicacionp() {
        return Idpublicacionp;
    }

    public void setIdpublicacionp(int Idpublicacionp) {
        this.Idpublicacionp = Idpublicacionp;
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

    public int getIdProf() {
        return IdProf;
    }

    public void setIdProf(int IdProf) {
        this.IdProf = IdProf;
    }

    public PublicacionProfesional(int Idpublicacionp, String rubro, String titulo, String descripcion, int IdProf) {
        this.Idpublicacionp = Idpublicacionp;
        this.rubro = rubro;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.IdProf = IdProf;
    }

    public PublicacionProfesional() {
    }
    

    
}