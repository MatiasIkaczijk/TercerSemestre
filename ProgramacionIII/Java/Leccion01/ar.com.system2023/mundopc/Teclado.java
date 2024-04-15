import ar.com.system2023.mundopc.DispositivoEntrada;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclados;
    
    // constructor
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return " Teclado {" + "idTeclado =" + idTeclado + ", " + super.toString() + "}";
    }
    
}
