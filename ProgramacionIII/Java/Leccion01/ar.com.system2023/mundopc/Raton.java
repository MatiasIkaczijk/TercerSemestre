
import ar.com.system2023.mundopc.DispositivoEntrada;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    
    // constructor
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton {" + "idRaton =" + idRaton + ", " + super.toString() + "}";
    }
    
}
