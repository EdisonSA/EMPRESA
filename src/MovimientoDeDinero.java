public class MovimientoDeDinero {

    //private usuario usuario;
    //private Empresa Empresa;
    long id;
    String concepto;
    float monto;
    int crearDato;
    int  ActualizarDato;


    public MovimientoDeDinero() {
    }

    public MovimientoDeDinero(long id, String concepto, float monto) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getCrearDato() {
        return crearDato;
    }

    public void setCrearDato(int crearDato) {
        this.crearDato = crearDato;
    }

    public int getActualizarDato() {
        return ActualizarDato;
    }

    @Override
    public String toString() {
        return "MovimientoDeDinero{" + "id=" + id + ", concepto="
                + concepto + ", monto=" + monto + ", crearDato="
                + crearDato + ", ActualizarDato=" + ActualizarDato + '}';
    }


}
