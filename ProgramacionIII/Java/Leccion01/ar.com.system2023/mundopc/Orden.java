public class Orden {
    // atributos

    private final int idOrden;
    private Computadora computadora[]; // ARREGLO OBJETOS
    public static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    // constructor vacio 
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    // metodo para agregar una nueva computadora 

    public void agregarCompu (Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }

    }
    // mostrar orden
    public void mostrarOrden(){
        System.out.println("Orden # " + ": " + this.idOrden);
        for(int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadora[i]);
        }
    }
}
