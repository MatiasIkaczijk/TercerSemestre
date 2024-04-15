package BloquesInicializacion.test;
import domain.Persona;

public class TestBloqueInicializiacion {
    public static void main(String[] args){
        BloquesInicializacion.domain.Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);

        BloquesInicializacion.domain.Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
    }
}
