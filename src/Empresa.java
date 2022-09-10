public class Empresa {

    long id;
    String nombreEmpresa;
    String documentoEmpresa; //nitEmpresa
    String telefonoEmpresa;
    String direccionEmpresa;
    usuario empleado[];
    transaccion MovimientoDeDinero[];
    //createdAt datos;
    //updatedAt datos;


    public Empresa(long id, String nombreEmpresa, String documentoEmpresa, String telefonoEmpresa, String direccionEmpresa) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.documentoEmpresa = documentoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDocumentoEmpresa() {
        return documentoEmpresa;
    }

    public void setDocumentoEmpresa(String documentoEmpresa) {
        this.documentoEmpresa = documentoEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", documentoEmpresa='" + documentoEmpresa + '\'' +
                ", telefonoEmpresa='" + telefonoEmpresa + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                '}';
    }
}
