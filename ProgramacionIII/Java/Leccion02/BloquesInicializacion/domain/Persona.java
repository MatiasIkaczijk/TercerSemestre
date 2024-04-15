package BloquesInicializacion.domain;
public class Persona {
    // atributos
    private final int idPersona;
    private static int contadorPersona;

    // bloque inicializacion estaticco
    static{
        System.out.println("Ejecucion bloque estático");
        ++Persona.contadorPersona;
    }
    { // Bloque de inicializacion no estático o contexto dinamico
        System.out.println("Ejecucion del bloque no estático");
        this.idPersona = Persona.contadorPersona++;
    } 

    // Los bloques de inicializacion se ejecutan antes del constructor

    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona [idPersona = " + idPersona + "]";
    }

    

}
