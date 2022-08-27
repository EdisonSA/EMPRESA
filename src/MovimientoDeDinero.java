public class MovimientoDeDinero {

    private String usuario;
    private double saldo;
    private  int gastos;
    private int ingresos;

    public MovimientoDeDinero() {
    }

    public MovimientoDeDinero(String usuario, double saldo, int gastos, int ingresos) {
        this.usuario = usuario;
        this.saldo = saldo;
        this.gastos = gastos;
        this.ingresos = ingresos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "MovimientoDeDinero{" +
                "usuario='" + usuario + '\'' +
                ", saldo=" + saldo +
                ", gastos=" + gastos +
                ", ingresos=" + ingresos +
                '}';
    }
    
}
