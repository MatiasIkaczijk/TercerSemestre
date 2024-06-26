import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        // definimos var, creamos objetos

        Monitor monitorHP = new Monitor("HP ", 13); // importamos la clase
        Teclado tecladoHP = new Teclado("Bluethoot ", " HP");
        Raton ratonHP = new Raton("Bluethoot ", "HP");
        Computadora computadoraHP = new Computadora("ComputadoraHP ", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer ", 32); 
        Teclado tecladoGamer = new Teclado("Bluethoot ", "Gamer ");
        Raton ratonGamer = new Raton("Bluethoot ", "Gamer");
        Computadora computadoraGamer = new Computadora("ComputadoraGamer ", monitorGamer, tecladoGamer, ratonGamer);

        Monitor monitorLogitech = new Monitor("Logitech ", 38); 
        Teclado tecladoLogitech = new Teclado("Bluethoot ", " Logitech ");
        Raton ratonLogitech = new Raton("Bluethoot ", " Logitech ");
        Computadora computadoraLogitech = new Computadora("ComputadoraLogitech ", monitorLogitech, tecladoLogitech, ratonLogitech);
        
        Computadora computadoraVar4 = new Computadora("Computadoras de distintas marcas", monitorLogitech, tecladoHP, ratonGamer);
        Computadora computadoraVar5 = new Computadora("Computadoras de distintas marcas", monitorHP, tecladoGamer, ratonLogitech);
        
        // obj de tipo orden
        Orden orden1 = new Orden(); // arreglo vacio
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();
        Orden orden4 = new Orden();
        Orden orden5 = new Orden();


        orden1.agregarCompu(computadoraGamer);
        orden2.agregarCompu(computadoraHP);
        orden3.agregarCompu(computadoraLogitech);
        orden4.agregarCompu(computadoraVar4);
        orden5.agregarCompu(computadoraVar5);


        orden5.mostrarOrden();
        orden4.mostrarOrden();
        orden3.mostrarOrden();
        orden2.mostrarOrden();
        orden1.mostrarOrden(); 


    }
}
