public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamano){
        this();
        this.tamano = tamano;
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamano() {
        return this.tamano;
    }
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    // ingreso manual del getIdMonitor

    public int getIdMonitor(){
        return this.idMonitor;
    }
    @Override
    public String toString() {
        return "Monitor {" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + "}";
    }

    

}
