

import Enumeraciones.Dias;

public class testEnum {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + testEnum.Lunes);
        indicarDiaSemana(testEnum.Jueves); // enumeraciones se tratan como cadenas
        
        System.out.println("Continente N°: 1 " + Continentes.AFRICA.getPaises());
        System.out.println("Numero de habitantes en el 1er continente:  " + Continentes.AFRICA.getHabitantes());

        System.out.println("Continente N°: 2 " + Continentes.EUROPA.getPaises());
        System.out.println("Numero de habitantes en el 2do continente:  " + Continentes.EUROPA.getHabitantes());

        System.out.println("Continente N°: 3 " + Continentes.ASIA.getPaises());
        System.out.println("Numero de habitantes en el 3er continente:  " + Continentes.ASIA.getHabitantes());

        System.out.println("Continente N°: 4 " + Continentes.AMERICA.getPaises());
        System.out.println("Numero de habitantes en el 4to continente:  " + Continentes.OCEANIA.getHabitantes());

        System.out.println("Continente N°: 5 " + Continentes.AMERICA.getPaises());
        System.out.println("Numero de habitantes en el 4to continente:  " + Continentes.OCEANIA.getHabitantes());

    }
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case Lunes:
            System.out.println("Primer dia de la semana");
            break;

            case Martes:
            System.out.println("Segundo dia de la semana");
            break;

            case Miercoles:
            System.out.println("Tercer dia de la semana");
            break;

            case Jueves:
            System.out.println("Cuanto dia de la semana");
            break;

            case Viernes:
            System.out.println("Quinto dia de la semana");
            break;
            
            case Sabado:
            System.out.println("Sexto dia de la semana");
            break;

            case Domingo:
            System.out.println("Ultimo dia de la semana");

            default:
            System.out.println("Dia incorrecto");
        }
    }
}
