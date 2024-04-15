public enum Continentes {
    AFRICA(54, "1.4 billones"),
    EUROPA(27, "741 millones"),
    ASIA(51, "4757 millones"),
    AMERICA(35, "1036 millones"),
    OCEANIA(14, "44 millon"),

  
    private final int paises;
    private String habitantes;

    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }

    // metodo get, porque estaba encapsulado paises
    public int getPaises(){
        return this.paises;
    }

    public String getHabitantes(){
        return this.habitantes;
    }
}
